package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Appointment;
import pojo.Doctor;

import java.io.IOException;

import dao.AppointmentDAO;
import dao.DoctorDAO;

/**
 * Servlet implementation class BookAppointment
 */
public class BookAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Appointment appointment = new Appointment();
		appointment.setDoctorName(request.getParameter("doctorName"));
		appointment.setPatientName(request.getParameter("patientName"));
		appointment.setDate(request.getParameter("date"));
		AppointmentDAO.bookAppointment(appointment);
		response.sendRedirect("index.jsp");
	}

}
