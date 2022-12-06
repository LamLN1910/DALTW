package com.tpt.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpt.dao.hibernate.impl.PhongDao;
import com.tpt.model.hibernate.Phong;
import com.tpt.service.IPhongService;
import com.tpt.service.impl.PhongServiceImpl;

@WebServlet(urlPatterns = {"/admin/xoa-phong"})
public class XoaPhong extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IPhongService phongService = new PhongServiceImpl();
	PhongDao phongDao = new PhongDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String id_pString = req.getParameter("id_p");
		int id_p;
		if(id_pString != null)
		{
			id_p = Integer.parseInt(id_pString);
			Phong phong = new Phong();
			phong.setIdP(id_p);
			phongDao.delete(phong);
			phongDao.close();
			//phongService.deletePhong(id_p);
			resp.sendRedirect(req.getContextPath() + "/admin/list-phong");
		}
		String id_taikhoan  = req.getParameter("id_taikhoan");
		String id_loaip = req.getParameter("id_loaip");
		if(id_taikhoan != null)
		{
			resp.sendRedirect(req.getContextPath() + "/admin/taikhoan?id_tk=" + id_taikhoan);
		}
		if(id_loaip != null)
		{
			resp.sendRedirect(req.getContextPath() + "/admin/loaiphong?id_lp=" + id_loaip);
		}
	}
}
