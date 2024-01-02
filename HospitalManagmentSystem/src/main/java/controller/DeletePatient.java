package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.DoctorDAO;
import dao.PatientDAO;

/**
 * Servlet implementation class DeletePatient
 */
public class DeletePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PatientDAO.deletePatient(Integer.parseInt(request.getParameter("patientId")));
		response.sendRedirect("ViewAllPatient");
	}

}
