package com.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig Config=getServletConfig();
		String id =Config.getInitParameter("TraineeId");
		String name =Config.getInitParameter("TraineeName");
		PrintWriter out=response.getWriter();
		out.println("Message from servlet 1");
		out.println("id :"+id);
		out.println("name :"+name);	
		// context usage starts here
		ServletContext context = getServletContext();
		String tn=context.getInitParameter("TraineeName");
		String org=context.getInitParameter("Org");
		out.println("message from servlet 1 Context");
		out.println("trainee name:"+tn);
		out.println("Org :"+org);
		

	}

}
