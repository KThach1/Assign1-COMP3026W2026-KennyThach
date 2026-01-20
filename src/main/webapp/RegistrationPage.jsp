<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="left">
		<h1>User Registration Form</h1>

		<!-- form action ="RegFormServlet" method="post"> -->
<form action="<%=request.getContextPath()%>/RegFormServlet" method="post">
			<table style="width: 80%">
				<tr>
					<td>Username</td>
					<td><input type="text" name="userName" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="lastName" required/></td>
				</tr>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullName" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>