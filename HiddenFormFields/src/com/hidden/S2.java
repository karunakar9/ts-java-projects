package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String un1 = request.getParameter("uName");
		String ub1 = request.getParameter("uBatch");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("User data from S2:");
		out.println("Name:" + un1);
		out.println("Batch:" + ub1);
		out.close();

	}

}
