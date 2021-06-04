package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("madhukar");
		al.add("karunakar");
		al.add("eswar");
		request.setAttribute("namesList", al);
		request.getRequestDispatcher("al.jsp").forward(request, response);
	}

}
