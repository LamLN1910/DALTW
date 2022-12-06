package com.tpt.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.tpt.dao.hibernate.impl.TaikhoanDao;
import com.tpt.model.TaikhoanModel;
import com.tpt.model.hibernate.Taikhoan;
import com.tpt.service.ITaikhoanService;
import com.tpt.service.impl.TaikhoanServiceImpl;
import com.tpt.util.Constant;
import com.tpt.util.ThemAnh;
@MultipartConfig()
@WebServlet(urlPatterns = {"/admin/themtk"})
public class ThemTaikhoan extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ITaikhoanService taikhoanService = new TaikhoanServiceImpl();
	TaikhoanDao taikhoanDao = new TaikhoanDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		req.getRequestDispatcher("/views/admin/them-taikhoan.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		Part part = req.getPart("anhdaidien");
		String realPath = Constant.DIR + "/taikhoan";
		String filename = ThemAnh.ThemAnh(part, realPath, 0);
		/*
		TaikhoanModel taikhoan = new TaikhoanModel();
		taikhoan.setTentk(req.getParameter("tentk"));
		taikhoan.setMatkhau(req.getParameter("matkhau"));
		taikhoan.setHo(req.getParameter("ho"));
		taikhoan.setTen(req.getParameter("ten"));
		taikhoan.setQuyen(Integer.parseInt(req.getParameter("quyen")));
		taikhoan.setSdt(req.getParameter("sdt"));
		taikhoan.setEmail(req.getParameter("email"));
		taikhoan.setAnhdaidien(filename);
		taikhoanService.insertTaikhoan(taikhoan);
		*/
		Taikhoan tk = new Taikhoan();
		tk.setTentk(req.getParameter("tentk"));
		tk.setMatkhau(req.getParameter("matkhau"));
		tk.setHo(req.getParameter("ho"));
		tk.setTen(req.getParameter("ten"));
		tk.setQuyen(Integer.parseInt(req.getParameter("quyen")));
		tk.setSdt(req.getParameter("sdt"));
		tk.setEmail(req.getParameter("email"));
		tk.setAnhdaidien(filename);
		taikhoanDao.create(tk);
		resp.sendRedirect(req.getContextPath() + "/admin/list-taikhoan");
	}
}
