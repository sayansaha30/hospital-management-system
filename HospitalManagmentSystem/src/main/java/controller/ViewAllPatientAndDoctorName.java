package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Doctor;
import pojo.Patient;

import java.io.IOException;
import java.util.List;

import dao.DoctorDAO;
import dao.PatientDAO;

public class ViewAllPatientAndDoctorName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("I am in ViewAllPatientAndDoctorName Servlet");
		
		List<Patient> patientList = PatientDAO.viewAllPatient();
		List<Doctor> doctorList = DoctorDAO.viewAllDoctor();
		request.setAttribute("doctorList", doctorList);
		request.setAttribute("patientList", patientList);

	        // Forward the request to the JSP page
	        request.getRequestDispatcher("bookAppointment.jsp").forward(request, response);
	}

}
