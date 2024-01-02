<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<title>Doctor List</title>
<!-- CSS -->
<style>
.delete-image:hover {
	opacity: 0.7;
	transform: scale(1.7); /* Increase the size by 10% */

	/* Change the background color to red (adjust as needed) */
}
</style>
<!-- bootstrap  import-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<h2 class="text-center" class="h1">Doctor List</h2>

	<table border="1" class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Specialization</th>
			<th>Action</th>

		</tr>



		<c:forEach var="doctor" items="${doctorList}">
			<tr>
				<td>${doctor.doctorId}</td>
				<td>${doctor.name}</td>
				<td>${doctor.specialization}</td>
				<td>
					<form id="updateForm${doctor.doctorId}" action="UpdateDoctor"
						method="get">
						<input type="hidden" name="doctorId" value="${doctor.doctorId}">
						<img class="delete-image" src="images/edit.svg" alt="Update"
							onclick="submitUpdateForm(${doctor.doctorId})">
					</form>

					<form id="deleteForm${doctor.doctorId}" action="DeleteDoctor"
						method="get">
						<input type="hidden" name="doctorId" value="${doctor.doctorId}">
						<img class="delete-image" src="images/delete.svg" alt="Delete"
							onclick="submitForm(${doctor.doctorId})">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<!-- Java Script -->

	<script>
		function submitForm(doctorId) {
			// Submit the corresponding form
			document.getElementById("deleteForm" + doctorId).submit();
		}
		function submitUpdateForm(doctorId) {
			// Submit the corresponding form
			document.getElementById("updateForm"+doctorId).submit();
		}
	</script>


	<!-- bootstrap js import-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>