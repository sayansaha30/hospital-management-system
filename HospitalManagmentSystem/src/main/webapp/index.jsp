<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
    // Check if the user is logged in
    if (session.getAttribute("userName") == null) {
        // Redirect to the login page if not logged in
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Hospital Management System</title>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
       
        <li class="nav-item">
          <a class="nav-link" href="addPatient.jsp">Add Patient</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addDoctor.jsp">Add Doctor</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="ViewAllPatientAndDoctorName">Book Appointment</a>
        </li>
       <li class="nav-item">
          <a class="nav-link" href="ViewAllDoctor">View All Doctor</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ViewAllPatient">View All Patient</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="ViewAllAppointment">View All Appointment</a>
        </li>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="Logout">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>