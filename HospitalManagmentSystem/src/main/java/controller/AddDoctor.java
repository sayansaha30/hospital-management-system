package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Doctor;

import java.io.IOException;

import dao.DoctorDAO;

/**
 * Servlet implementation class AddDoctor
 */
public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor = new Doctor();
		doctor.setName(request.getParameter("name"));
		doctor.setSpecialization(request.getParameter("specialization"));
		DoctorDAO.addDoctor(doctor);
		response.sendRedirect("index.jsp");
	}

}
