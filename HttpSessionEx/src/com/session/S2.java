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

@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession se = request.getSession(true);

		PrintWriter out = response.getWriter();

		out.println("Session Id in S2:" + se.getId());

		String uName = (String) se.getAttribute("n");
		String uBranch = (String) se.getAttribute("b");
		out.println("NAme:" + uName);
		out.println("Branch:" + uBranch);
		//se.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("S3");
		rd.include(request, response);

	}

}
