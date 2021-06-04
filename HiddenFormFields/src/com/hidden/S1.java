package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String un=request.getParameter("uname");
		String ub=request.getParameter("ubatch");
		
		response.setContentType("text/html");
		 
		PrintWriter out=response.getWriter();
		
		out.println("User data from S1:");
		out.println("Name:"+un);
		out.println("Batch:"+ub);
		out.println("<form action='S2' method='post'>");
		out.println("<input type='hidden' name='uName' value='"+un+"'/>");
		out.println("<input type='hidden' name='uBatch' value='"+ub+"'/>");
		out.println("<input type='submit' name ='action' value='GO'/>");
		out.println("</form>");
		
		
	}

}
