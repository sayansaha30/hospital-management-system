package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import dao.LoginDAO;
import pojo.LoginInfo;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		PrintWriter  writer=response.getWriter();
		LoginInfo user = new LoginInfo(userName,password);
		if (LoginDAO.isUserValid(user)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userName", userName);
			response.sendRedirect("index.jsp");
		}
		else {
			writer.println("login failed");
			response.sendRedirect("login.jsp");
		}
	}

}
