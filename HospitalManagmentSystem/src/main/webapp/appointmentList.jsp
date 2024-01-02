<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<meta charset="UTF-8">
<title>Appointment List</title>
 <!-- bootstrap  import-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
	<h2 class="text-center" class="h1">Appointment List</h2>

	<table border="1" class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Doctor Name</th>
			<th>Patient Name</th>
			<th>Date</th>
		</tr>



		<c:forEach var="appointment" items="${appointmentList}">
			<tr>
				<td>${appointment.appointmentId}</td>
				<td>${appointment.doctorName}</td>
				<td>${appointment.patientName}</td>
				<td>${appointment.date}</td>
			</tr>
		</c:forEach>
	</table>



<!-- bootstrap js import-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>