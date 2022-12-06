package com.tpt.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpt.dao.hibernate.impl.LoaiphongDao;
import com.tpt.model.hibernate.Loaiphong;
import com.tpt.service.ILoaiphongService;
import com.tpt.service.impl.LoaiphongServiceImpl;

@WebServlet(urlPatterns = { "/admin/xoa-loaiphong" })
public class XoaLoaiphong extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ILoaiphongService loaiphongService = new LoaiphongServiceImpl();
	LoaiphongDao loaiphongDao = new LoaiphongDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");

		String id_lpString = req.getParameter("id_lp");
		int id_lp = Integer.parseInt(id_lpString);
		Loaiphong loaiphong = new Loaiphong();
		loaiphong.setIdLp(id_lp);
		loaiphongDao.delete(loaiphong);
		loaiphongDao.close();
		//loaiphongService.deleteLoaiphong(id_lp);
		resp.sendRedirect(req.getContextPath() + "/admin/list-loaiphong");
	}
}
