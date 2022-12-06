package com.tpt.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpt.model.HuyenModel;
import com.tpt.service.IQuanhuyenService;
import com.tpt.service.impl.QuanhuyenServiceImpl;

@WebServlet(urlPatterns = { "/listhuyen" })
public class ListQuanhuyenAjaxController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	IQuanhuyenService quanhuyenService = new QuanhuyenServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");

		String id_tinh = req.getParameter("exits");
		int id_t = Integer.parseInt(id_tinh);
		List<HuyenModel> huyens = quanhuyenService.getByTinh(id_t);
		PrintWriter out = resp.getWriter();
		out.print("<option value='0' selected>Chọn quận huyện</option>");
		for (HuyenModel h : huyens) {
			out.println("<option value=" + h.getMahuyen() + " > " + h.getTenhuyen() + "</option>\n");
		}
	}
}
