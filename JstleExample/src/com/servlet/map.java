package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/map")
public class map extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HashMap m=new HashMap();
		m.put("1", "sai");
		m.put("2", "saikumar");
		m.put("3", "saikiran");
		m.put("4", "saikishore");
		HttpSession se=request.getSession();
		se.setAttribute("map", m);
        request.getRequestDispatcher("map.jsp").forward(request, response);
	}

}
