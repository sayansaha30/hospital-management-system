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
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Add Patient</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
	<div class="container mt-5">
		<h2>Add Patient</h2>
		<form action="AddPatient" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" name="name" placeholder="Enter your name">
			</div>
			<div class="form-group">
				<label for="age">Age:</label> <input type="number"
					class="form-control" id="age" name="age" placeholder="Enter your age">
			</div>
			<div class="form-group">
				<label for="sex">Sex:</label> <label for="sex"> <input
					type="radio" name="sex" value="M">Male
				</label> <label for="sex"><input type="radio" name="sex" value="F">Female</label>
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