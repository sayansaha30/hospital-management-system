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
<title>Add Doctor</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
	<div class="container mt-5">
		<h2>Add Doctor</h2>
		<form action="AddDoctor" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" required="required"
					class="form-control" name="name" placeholder="Enter your name">
			</div>
			<div class="form-group">
				<label for="specialization">Specialization:</label> <input required="required" type="text"
					class="form-control" id="specialization" name="specialization" placeholder="Enter your specialization">
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