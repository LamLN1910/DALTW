package com.tpt.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tpt.dao.hibernate.impl.TaikhoanDao;
import com.tpt.model.TaikhoanModel;
import com.tpt.model.hibernate.Taikhoan;
import com.tpt.service.ITaikhoanService;
import com.tpt.service.impl.TaikhoanServiceImpl;

@WebServlet(urlPatterns = { "/login" })
public class DangnhapController extends HttpServlet {
	ITaikhoanService taikhoanService = new TaikhoanServiceImpl();
	TaikhoanDao taikhoanDao = new TaikhoanDao();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		Cookie arrCookie[] = req.getCookies();
		if(arrCookie != null)
		{
			for(Cookie cookie : arrCookie)
			{
				if(cookie.getName().equals("tentk"))
				{
					req.setAttribute("tentk", cookie.getValue());
				}
				if (cookie.getName().equals("matkhau"))
				{
					req.setAttribute("matkhau", cookie.getValue());
				}
			}
		}
		
		req.setAttribute("check", "login");
		req.getRequestDispatcher("/views/web/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String tentk = req.getParameter("tentk");
		String matkhau = req.getParameter("matkhau");
		
		String rmb = req.getParameter("rmb");
		
		Cookie tkCookie = new Cookie("tentk", tentk);
		Cookie pwCookie = new Cookie("matkhau", matkhau);
		tkCookie.setMaxAge(10);
		resp.addCookie(tkCookie);
		if(rmb!=null)
		{
			pwCookie.setMaxAge(10);
			resp.addCookie(pwCookie);
		}
		else 
		{
			pwCookie.setMaxAge(0);
		}
		TaikhoanModel taikhoan = new TaikhoanModel();
		taikhoan.setTentk(tentk);
		taikhoan.setMatkhau(matkhau);
		TaikhoanModel account = taikhoanService.dangNhap(taikhoan);		
		if (account == null) {
			req.setAttribute("error", "Sai tên đăng nhập hoặc mật khẩu");
			req.getRequestDispatcher("/views/web/login.jsp").forward(req, resp);
		}
		else
		{
			int id = account.getId_tk();
			Taikhoan tkentity = taikhoanDao.select(id);
			HttpSession session = req.getSession();
			session.setAttribute("account", account);
			session.setAttribute("tkentity", tkentity);
			resp.sendRedirect(req.getContextPath() + "/trangchu");
		}
	}
}
