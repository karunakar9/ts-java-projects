package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("n1");
		String email =request.getParameter("n2");
		String phNO =request.getParameter("n3");
		String age =request.getParameter("n4");
		PrintWriter out=response.getWriter();
		out.println("name is:"+name);
		out.println("email is:"+email);
		out.println("PhNo is:"+phNO);
		out.println("age is:"+age);
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
