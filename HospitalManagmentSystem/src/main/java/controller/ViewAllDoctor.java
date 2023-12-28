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

/**
 * Servlet implementation class ViewAllDoctor
 */
public class ViewAllDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Doctor> doctorList = DoctorDAO.viewAllDoctor();
		request.setAttribute("doctorList", doctorList);

        // Forward the request to the JSP page
        request.getRequestDispatcher("doctorList.jsp").forward(request, response);
	}

	

}
