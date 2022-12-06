package com.tpt.controller.admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.tpt.dao.hibernate.impl.LoaiphongDao;
import com.tpt.dao.hibernate.impl.PhongDao;
import com.tpt.dao.hibernate.impl.TaikhoanDao;
import com.tpt.dao.hibernate.impl.XaphuongDao;
import com.tpt.model.LoaiphongModel;
import com.tpt.model.PhongModel;
import com.tpt.model.TinhModel;
import com.tpt.model.hibernate.Loaiphong;
import com.tpt.model.hibernate.Phong;
import com.tpt.model.hibernate.Taikhoan;
import com.tpt.model.hibernate.Xaphuong;
import com.tpt.service.ILoaiphongService;
import com.tpt.service.IPhongService;
import com.tpt.service.IQuanhuyenService;
import com.tpt.service.ITinhService;
import com.tpt.service.impl.LoaiphongServiceImpl;
import com.tpt.service.impl.PhongServiceImpl;
import com.tpt.service.impl.QuanhuyenServiceImpl;
import com.tpt.service.impl.TinhServiceImpl;
import com.tpt.util.Constant;
import com.tpt.util.ThemAnh;

@WebServlet(urlPatterns = {"/admin/them-phong"})
@MultipartConfig()
public class ThemPhong extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	IPhongService phongService = new PhongServiceImpl();
	ILoaiphongService loaiphongService = new LoaiphongServiceImpl();
	ITinhService tinhService = new TinhServiceImpl();
	IQuanhuyenService huyenService = new QuanhuyenServiceImpl();
	PhongDao phongDao = new PhongDao();
	LoaiphongDao loaiphongDao = new LoaiphongDao();
	XaphuongDao xaphuongDao = new XaphuongDao();
	TaikhoanDao taikhoanDao = new TaikhoanDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String id_tk  = req.getParameter("id_tk");
		List<LoaiphongModel> loaiphongs = loaiphongService.getAll();
		List<TinhModel> tinhs = tinhService.getAll();
		req.setAttribute("loaiphongs", loaiphongs);
		req.setAttribute("tinhs", tinhs);
		req.setAttribute("id_tk", id_tk);
		req.getRequestDispatcher("/views/admin/them-phong.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		int temp = 0;
		String hinhanhs[] = new String[Constant.SoHinh];
		String realPath = Constant.DIR + "/phong";
		for(Part part : req.getParts())
		{
			String newFilename = part.getSubmittedFileName();
			if(newFilename != null)
			{
				hinhanhs[temp++] = ThemAnh.ThemAnh(part, realPath, temp);
			}
			
		}
		/*
		PhongModel phong = new PhongModel();
		phong.setTen(req.getParameter("ten"));
		phong.setAnhchinh(hinhanhs[0]);
		phong.setTrangthai(Integer.parseInt(req.getParameter("trangthai")));
		phong.setChieudai(Float.parseFloat(req.getParameter("chieudai")));
		phong.setChieurong(Float.parseFloat(req.getParameter("chieurong")));
		phong.setGia(Integer.parseInt(req.getParameter("gia")));
		phong.setSonguoi(Integer.parseInt(req.getParameter("songuoi")));
		phong.setDcchitiet(req.getParameter("dcchitiet"));
		phong.setMota(req.getParameter("mota"));
		phong.setId_lp(Integer.parseInt(req.getParameter("id_lp")));
		phong.setMaxa(Integer.parseInt(req.getParameter("xa")));
		*/
		
		Phong phong = new Phong();
		Loaiphong loaiphong = loaiphongDao.select(Integer.parseInt(req.getParameter("id_lp")));
		Xaphuong xaphuong = xaphuongDao.select(Integer.parseInt(req.getParameter("xa")));
		
		phong.setTen(req.getParameter("ten"));
		phong.setAnhchinh(hinhanhs[0]);
		phong.setTrangthai(Integer.parseInt(req.getParameter("trangthai")));
		phong.setChieudai(Float.parseFloat(req.getParameter("chieudai")));
		phong.setChieurong(Float.parseFloat(req.getParameter("chieurong")));
		phong.setGia(Integer.parseInt(req.getParameter("gia")));
		phong.setSonguoi(Integer.parseInt(req.getParameter("songuoi")));
		phong.setDcchitiet(req.getParameter("dcchitiet"));
		phong.setMota(req.getParameter("mota"));
		phong.setLoaiphong(loaiphong);
		phong.setXaphuong(xaphuong);
		
		String id_tk = req.getParameter("id_tk");
		Taikhoan taikhoan = taikhoanDao.select(Integer.parseInt(id_tk));
		
		phong.setTaikhoan(taikhoan);
		Date date = new Date(System.currentTimeMillis());
		phong.setNgaydang(date);
		//phongService.insertPhong(phong, hinhanhs);
		phongDao.create(phong);
		resp.sendRedirect(req.getContextPath() + "/admin/taikhoan?id_tk=" + id_tk);
	}
}
