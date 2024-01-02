package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Appointment;
import pojo.Doctor;

import java.io.IOException;
import java.util.List;

import dao.AppointmentDAO;
import dao.DoctorDAO;

/**
 * Servlet implementation class ViewAllAppointment
 */
public class ViewAllAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Appointment> appointmentList = AppointmentDAO.viewAllAppointment();
		request.setAttribute("appointmentList", appointmentList);

        // Forward the request to the JSP page
        request.getRequestDispatcher("appointmentList.jsp").forward(request, response);
	}



}
