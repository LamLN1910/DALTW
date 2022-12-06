package com.tpt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpt.dao.hibernate.impl.LoaiphongDao;
import com.tpt.model.LoaiphongModel;
import com.tpt.model.hibernate.Loaiphong;
import com.tpt.service.ILoaiphongService;
import com.tpt.service.impl.LoaiphongServiceImpl;

@WebServlet(urlPatterns = {"/admin/list-loaiphong"})
public class ListLoaiphong extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ILoaiphongService loaiphongService = new LoaiphongServiceImpl();
	LoaiphongDao loaiphongDao = new LoaiphongDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		
		List<LoaiphongModel> loaiphongs = loaiphongService.getAll();
		req.setAttribute("loaiphongs", loaiphongs);
		
		req.getRequestDispatcher("/views/admin/list-loaiphong.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setCharacterEncoding("utf-8");
		
		String id_lpString = req.getParameter("id_lp");
		String tenloai = req.getParameter("tenloai");
		int id_lp = Integer.parseInt(id_lpString);
		//LoaiphongModel lp = new LoaiphongModel();
		Loaiphong lp = new Loaiphong();
		lp.setTenloai(tenloai);
		lp.setIdLp(id_lp);
		loaiphongDao.update(lp);
		//loaiphongService.editLoaiphong(lp);
		
		List<LoaiphongModel> loaiphongs = loaiphongService.getAll();
		req.setAttribute("loaiphongs", loaiphongs);
		
		resp.sendRedirect(req.getContextPath() + "/admin/list-loaiphong");
	}
}
