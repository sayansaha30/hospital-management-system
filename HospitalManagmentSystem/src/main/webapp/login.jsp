<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- bootstrap  import-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>login page</title>
</head>
<body>
    <h1 class="text-center">Welcome</h1>
    <form action="Login" method="post" class="container">
        <label for="username" class="form-label"><strong>User Name:</strong></label>
        <input type="text" name="userName"  class="form-control" required placeholder="Enter user name">
        <label for="password" class="form-label"><strong>Password:</strong></label>
        <input type="text"  class="form-control" name="password" required placeholder="Enter password">
        <button type="submit" class="btn btn-primary">Login</button>
        <a href="createUser.jsp" class="btn btn-primary">Create User</a>
    </form>
    

<!-- bootstrap js import-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>