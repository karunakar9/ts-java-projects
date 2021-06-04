package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ubutton = request.getParameter("action");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (ubutton.equals("Login")) {
			String umail = request.getParameter("mail");
			String upwd = request.getParameter("pwd");

			try {
				String dppwd = UserDao.getPasswordWithEmail(umail);
				if (upwd.equals(dppwd)) {
					out.println("Welcome to home page");
				} else {
					out.println("Sorry! Invalid Details");
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					rd.include(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else if (ubutton.equals("Register")) {
			String uname = request.getParameter("sname");
			String umail = request.getParameter("smail");
			String upwd = request.getParameter("spwd");

			boolean userExisted = UserDao.validateUserWithEmail(umail);
			if (userExisted) {
				out.println("UserAlready Existed");
			} else {
				if (UserDao.registerUser(new User(uname, umail, upwd))) {
					out.println("Registered");
				} else {
					out.print("Not registered");
				}
			}
		}

	}

}
