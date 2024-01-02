<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
// Check if the user is logged in
if (session.getAttribute("userName") == null) {
	// Redirect to the login page if not logged in
	response.sendRedirect("login.jsp");
}
%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Book Appointment</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div class="container mt-5">
		<h2>Book Appointment</h2>
		<form action="BookAppointment" method="post">
	
			
			<div class="form-group">
				<label for="doctorName">Doctor Name:</label> <select
					name="doctorName" class="form-select" required="required">

					<c:forEach var="doctor" items="${doctorList}">

						<option value=${doctor.name}>${doctor.name}</option>

					</c:forEach>

				</select>
			</div>
			

			<div class="form-group">
				<label for="patientName">Patient Name:</label> 
				<select
					name="patientName" class="form-select" required="required">

					<c:forEach var="patient" items="${patientList}">

						<option  value=${patient.name}>${patient.name}</option>

					</c:forEach>

				</select>
			</div>
			<div class="form-group">
				<label for="date">Date:</label> <input required="required" type="date"
					class="form-control" id="date" name="date">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<!-- Bootstrap JS and Popper.js (optional, for Bootstrap features) -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>