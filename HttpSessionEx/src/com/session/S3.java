package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/S3")
public class S3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession se = request.getSession(false);
		
		out.println("Session Id in S3:" + se.getId());

		String uName = (String) se.getAttribute("n");
		String uBranch = (String) se.getAttribute("b");
		out.println("NAme:" + uName);
		out.println("Branch:" + uBranch);
				
	}

}
