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

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		/*int id = Integer.parseInt(request.getParameter("sid"));*/
		//int id=0;
		/*String name = request.getParameter("sname");
		String batch = request.getParameter("sbatch");
*/
		String button = request.getParameter("bt");
		PrintWriter out = response.getWriter();
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
		else if (button.equals("Add")) {
			String name = request.getParameter("sname");
			String batch = request.getParameter("sbatch");
			//int id = Integer.parseInt(request.getParameter("sid"));
			try {

					if (StudentDao.AddStudent(new Student(name, batch))) {
						//out.print("Added Successfully");
						//
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
						//
					}

				 else {
					out.println("already Existed in database");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else if (button.equals("Delete")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			try {
				if (StudentDao.validateWithId(id)) {
					//out.println("existed");
					if (StudentDao.deleteStudentWithId(id)) {
					//	out.println("Successfully deleted");
						//
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
						//
						
					} else {
						out.println("Not Deleted");

					}
				} else {
					out.print("Not existed");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(button.equals("Update")){
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String batch = request.getParameter("sbatch");
			try {
				if(StudentDao.validateWithId(id)){
					//out.println("existed");
					if(StudentDao.updateStudentWithId(id, name,batch)){
						//out.println("Updated successfully");
						//
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
						//
					}else{
						out.println("Not updated");
					}
				}else {
					out.println("not exist");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(button.equals("Action")){
			String id22=request.getParameter("PresentId");
			int pid=Integer.parseInt(id22);
			try {
				if(StudentDao.validateWithId(pid)){
					out.println("existed");
					HttpSession session = request.getSession();
					List<Student> studList1;
					studList1 = StudentDao.ShowWithId(pid);
					request.setAttribute("studentList", studList1);
					RequestDispatcher rd = request.getRequestDispatcher("StudentUpdate.jsp");
					rd.forward(request, response);
				}else {
					out.println("not exist");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
