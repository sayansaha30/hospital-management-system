package controller;

import java.io.IOException;
import java.util.List;

import dao.DoctorDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Doctor;

/**
 * Servlet implementation class UpdateDoctor
 */
public class UpdateDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor = DoctorDAO.getDoctorById( Integer.parseInt( request.getParameter("doctorId")));
		request.setAttribute("doctor", doctor);

        // Forward the request to the JSP page
        request.getRequestDispatcher("updateDoctor.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor = new Doctor();
		doctor.setDoctorId(Integer.parseInt( request.getParameter("doctorId")));
		doctor.setName(request.getParameter("name"));
		doctor.setSpecialization(request.getParameter("specialization"));
		DoctorDAO.updateDoctor(doctor);
		response.sendRedirect("ViewAllDoctor");
	}

}
