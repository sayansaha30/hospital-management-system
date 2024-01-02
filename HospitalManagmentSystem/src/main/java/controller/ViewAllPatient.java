package controller;
import dao.PatientDAO;
import pojo.Patient;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.List;



public class ViewAllPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("I am in ViewAllPatient Servlet");
		
		List<Patient> patientList = PatientDAO.viewAllPatient();
		System.out.println("ArrayList length: " + patientList.size());
		 request.setAttribute("patientList", patientList);

	        // Forward the request to the JSP page
	        request.getRequestDispatcher("patientList.jsp").forward(request, response);
	
	
	}
	

}
