package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// creating session object
		HttpSession se = request.getSession();

		PrintWriter out = response.getWriter();

		out.println("session id: " + se.getId());
		out.println("session creation time: " + se.getCreationTime());

		// collecting data from html
		String name = request.getParameter("uname");
		String branch = request.getParameter("ubranch");
		// storing data in session obj
		se.setAttribute("n", name);
		se.setAttribute("b", branch);

		RequestDispatcher rd = request.getRequestDispatcher("S2");
		rd.include(request, response);

	}

}
