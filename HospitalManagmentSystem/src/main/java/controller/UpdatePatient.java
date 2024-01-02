package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Patient;
import pojo.Patient;

import java.io.IOException;

import dao.PatientDAO;
import dao.PatientDAO;

/**
 * Servlet implementation class UpdatePatient
 */
public class UpdatePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("I am in updatepatient servlet with patientId"+ request.getParameter("patientId"));
		Patient patient = PatientDAO.getPatientById( Integer.parseInt( request.getParameter("patientId")));
		request.setAttribute("patient", patient);

        // Forward the request to the JSP page
        request.getRequestDispatcher("updatePatient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Patient patient = new Patient();
		patient.setPatientId(Integer.parseInt( request.getParameter("patientId")));
		patient.setName(request.getParameter("name"));
		patient.setSex(request.getParameter("sex"));
		patient.setAge( Integer.parseInt( request.getParameter("age")));
		PatientDAO.updatePatient(patient);
		response.sendRedirect("ViewAllPatient");
	}

}
