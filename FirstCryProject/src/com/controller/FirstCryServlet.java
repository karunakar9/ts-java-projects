package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OrderDetailsDao;
import com.dao.OrdersDao;
import com.dao.ProductDao;
import com.dao.UserDao;
import com.model.OrderDetails;
import com.model.Orders;
import com.model.Product;
import com.model.User;

@WebServlet("/FirstCryServlet")
public class FirstCryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get Products with selected category In dropDown menu

		// getting all categories and getting all products

		HttpSession session = request.getSession();
		try {
			List<String> cList = ProductDao.getAllCategories();
			System.out.println("In controller ALL Categories:" + cList);
			List<Product> pList = ProductDao.getAllProducts();
			System.out.println("In controller All products:" + pList);
			session.setAttribute("cList", cList);
			session.setAttribute("pList", pList);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("button");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();

		if (button.equals("Register")) {
			String sname = request.getParameter("name");
			String semail = request.getParameter("mail");
			String spwd = request.getParameter("password");
			User c = new User(sname, semail, spwd);
			try {
				if (UserDao.validateUserWithEmail(semail)) {
					out.println("user already exist");
				} else {
					UserDao.addUser(c);
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
				if (UserDao.validateUserWithEmail(lemail)) {
					String dbpwd = UserDao.getPassworWithEmail(lemail);
					if (lpwd.equals(dbpwd)) {
		                /////////////////
						String userName=UserDao.getNameWithEmail(lemail);
						System.out.println(userName);
						session.setAttribute("userName", userName);
						int UserId=UserDao.getIdWithEmail(lemail);
						session.setAttribute("UserId", UserId);
						/////////////////////
						RequestDispatcher rd = request.getRequestDispatcher("loginhome.jsp");
						rd.forward(request, response);
					} else {
						out.println("wrong password");
						RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
						rd.include(request, response);
					}
				} else {
					out.println("enter correct email");
					RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
					rd.include(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (button.equals("Go")) {
			String selectedcategory = request.getParameter("category");
			try {
				List<Product> plist = ProductDao.getItemsWithCategory(selectedcategory);
				session.setAttribute("pList", plist);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (button.equals("GO")) {
			String selectedcategory = request.getParameter("category");
			try {
				List<Product> plist = ProductDao.getItemsWithCategory(selectedcategory);
				session.setAttribute("pList", plist);
				request.getRequestDispatcher("loginhome.jsp").forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (button.equals("ADD TO CART")) {
			int tp = 0;
			List<Integer> qList = null;
			List<Integer> idList = null;
			List<Product> selectedItems = null;
			if (session.getAttribute("selectedItems") == null && session.getAttribute("qList") == null) {
				String id[] = request.getParameterValues("itemId");
				String quantity[] = request.getParameterValues("quantity");
				tp = 0;

				qList = new ArrayList<Integer>();
				idList = new ArrayList<Integer>();
				selectedItems = new ArrayList<Product>();

				for (int i = 0; i < quantity.length && i < id.length; i++) {
					if (Integer.parseInt(quantity[i]) != 0) {
						qList.add(Integer.parseInt(quantity[i]));
						idList.add(Integer.parseInt(id[i]));

					}

				}

				for (int i = 0; i < idList.size(); i++) {
					try {
						Product p = ProductDao.getItemWithId(idList.get(i));
						selectedItems.add(p);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// Billing
				for (int i = 0; i < qList.size() && i < selectedItems.size(); i++) {
					tp += qList.get(i) * selectedItems.get(i).getPrice();

				}
			} else {
				String id[] = request.getParameterValues("itemId");
				String quantity[] = request.getParameterValues("quantity");
				tp = (int) session.getAttribute("tp");
				qList = (List<Integer>) session.getAttribute("qList");
				idList = (List<Integer>) session.getAttribute("idList");
				selectedItems=(List<Product>) session.getAttribute("selectedItems");
				int previousQSize = qList.size();
				for (int i = 0; i < quantity.length && i < id.length; i++) {
					if (Integer.parseInt(quantity[i]) != 0) {
						qList.add(Integer.parseInt(quantity[i]));
						idList.add(Integer.parseInt(id[i]));
					}
				}

				for (int i = previousQSize; i < idList.size(); i++) {
					try {
						Product p = ProductDao.getItemWithId(idList.get(i));
						selectedItems.add(p);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				// Billing
				for (int i = previousQSize; i < qList.size() && i < selectedItems.size(); i++) {
					tp += qList.get(i) * selectedItems.get(i).getPrice();
				}
			}
			session.setAttribute("idList", idList);
			session.setAttribute("qList", qList);
			session.setAttribute("selectedItems", selectedItems);
			session.setAttribute("tp", tp);
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			/*=========================*/

		}else if(button.equals("Continue")){
			int uId=(int) session.getAttribute("UserId");
			int tAmount=(int) session.getAttribute("tp");
			Date d=new Date();//util date
			Orders od=new Orders();
			User u = new User();
			u.setId(uId);
			od.setUserId(u);
			od.setTotalAmount(tAmount);
			//od.setOrderDate(new java.sql.Date(d.getTime()));
			od.setOrderDate(new java.sql.Timestamp(d.getTime()));
			int insertSuccessCount=0;
			//conversion of util date to sql date
			try {
				if(OrdersDao.generateOrder(od)){
					int orderId=OrdersDao.getOrderIdWithUserId(od);
					od.setId(orderId);
					List<Integer> quaList=(List<Integer>) session.getAttribute("qList");
					List<Product> purchasedProducts=(List<Product>) session.getAttribute("selectedItems");
					OrderDetails ord= null;
					for (int i = 0; i < quaList.size(); i++) {
						ord=new OrderDetails(od, purchasedProducts.get(i), quaList.get(i));
						if(OrderDetailsDao.insertPurchasedProducts(ord)){
							insertSuccessCount++;
						}
					}
					if(insertSuccessCount==purchasedProducts.size()){
						request.getRequestDispatcher("final.jsp").forward(request, response);
					}else{
						out.print("Products Details are not inserted");
					}
					//out.print("Generated");
					//request.getRequestDispatcher("final.jsp").forward(request, response);
				}else{
					out.print("Not Generated");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
