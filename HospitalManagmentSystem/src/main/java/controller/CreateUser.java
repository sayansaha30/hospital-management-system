package controller;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Patient;
import pojo.User;

import java.io.IOException;
import java.io.PrintWriter;

import dao.PatientDAO;
import dao.UserDAO;


public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		System.out.println("email is " + request.getParameter("email"));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		if(UserDAO.createUser(user)>0)
		response.sendRedirect("index.jsp");
		else
			response.sendRedirect("createUser.jsp");
	}

}
