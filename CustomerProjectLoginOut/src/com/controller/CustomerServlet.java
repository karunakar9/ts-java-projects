package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.Customer;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("button");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (button.equals("Register")) {
			String sname = request.getParameter("name");
			String semail = request.getParameter("mail");
			String spwd = request.getParameter("password");
			String sdob = request.getParameter("dateofbirth");
			Date dob=Date.valueOf(sdob);
			Customer c = new Customer(sname, semail, spwd, dob);
			try {
				if (CustomerDao.validateCustomerWithEmail(semail)) {
					out.println("user already exist");
				} else {
					CustomerDao.addCustomer(c);
					out.println("user added succesfully");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (button.equals("Login")) {
			String lemail = request.getParameter("lmail");
			String lpwd = request.getParameter("lpassword");
			try {
				if (CustomerDao.validateCustomerWithEmail(lemail)) {
					String dbpwd = CustomerDao.getPassworWithEmail(lemail);
					if (lpwd.equals(dbpwd)) {
						RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
						rd.forward(request, response);
					} else {
						out.println("wrong password");
						RequestDispatcher rd = request.getRequestDispatcher("homePage.html");
						rd.include(request, response);
					}
				} else {
					out.println("enter correct email");
					RequestDispatcher rd = request.getRequestDispatcher("homePage.html");
					rd.include(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
