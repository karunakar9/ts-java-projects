package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDao;
import com.model.Student;

@WebServlet("/AllDetails")
public class AllDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String button = request.getParameter("bt");
		if (button.equals("AllDetails")) {
			List<Student> studList;
			try {
				studList = StudentDao.getAllStudentsDetails();
				request.setAttribute("StudentList", studList);
				RequestDispatcher rd = request.getRequestDispatcher("StudentDetails.jsp");
				rd.forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
