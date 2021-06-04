package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String password = request.getParameter("n2");
		String ue = request.getParameter("n1");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		response.setContentType("text/html");
		if (password.equals("Hello123")) {
			out.println("Welcome to User(Message from LoginServlet)");
			request.setAttribute("email", ue);// stored data in request scope
			rd = request.getRequestDispatcher("/DetailsServlet");
			rd.include(request, response);
		} else {
			
			out.print("<br>");
			out.print("Sorry Invalid credintials");
			rd = request.getRequestDispatcher("loginForm.html");
			rd.include(request, response);
		}

	}

}
