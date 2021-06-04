package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArithmaticServlet")
public class ArithmaticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num1 =request.getParameter("n1");
		int number1=Integer.parseInt(num1);
		String num2 =request.getParameter("n2");
		int number2=Integer.parseInt(num2);
		String selection =request.getParameter("n3");
		PrintWriter out=response.getWriter();
		if(selection.equals("Add")){
			out.println("addition:"+(number1+number2));
		}else if(selection.equals("Sub")){
			out.println("substraction:"+(number1-number2));
		}else if(selection.equals("Mul")){
			out.println("MULTIPLICATION:"+(number1*number2));
		}else if(selection.equals("Div")){
			out.println("DIVISION:"+(number1/number2));
		}
		response.setContentType("text/html");
		out.print("br");
		out.print("<h1>servlet allowed html and text content<h1>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
