package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 jakarta.servlet.http.HttpSession session = request.getSession(true);
	        if (session != null) {
	            // Invalidate the session
	            session.invalidate();
	        }

	        // Redirect to the login page after logout
	        response.sendRedirect("login.jsp");
	}

	

}
