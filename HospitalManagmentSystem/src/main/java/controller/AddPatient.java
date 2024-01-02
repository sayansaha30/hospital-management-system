package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Patient;

import java.io.IOException;

import dao.PatientDAO;

/**
 * Servlet implementation class AddPatient
 */
public class AddPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Patient patient = new Patient();
		patient.setAge(Integer.parseInt(request.getParameter("age")));
		patient.setName(request.getParameter("name"));
		patient.setSex(request.getParameter("sex"));
		PatientDAO.addPatient(patient);
		response.sendRedirect("index.jsp");
	}

}
