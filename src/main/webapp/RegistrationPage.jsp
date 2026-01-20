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
					<!-- Pattern is from 5 to 12 characters long and only letters (upper or lower case) and numbers -->
					<td><input type="text" name="userName" pattern="[A-Za-z0-9]{5,12}" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<!-- Pattern is any characters (the period means any character) but min 7 characters and max 12 -->
					<td><input type="password" name="password" pattern=".{7,12}"required/></td>
				</tr>
				<tr>
					<td>Full Name</td>
					<!-- Pattern should be letters only (* means zero or more but + means at least one character)-->
					<!-- Pattern from the internet for optional middle name which would require two spaces -->
					<td><input type="text" name="fullName" pattern="[A-Za-z]+( [A-Za-z]+){1,2}" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td><label for="country">Country:</label></td>
					<td><select id="country" name="country" required>
					 <!-- <option disabled selected value> -- select an option -- </option> -->
					 <!-- This will default Canada as the country but can be switched to the above to select an option -->
					  <option value="canada">Canada</option>
					  <option value="usa">USA</option>
					  <option value="mexico">Mexico</option>
					  <option value="japan">Japan</option>
					  <option value="australia">Australia</option>
					  <option value="germany">Germany</option>
					  <option value="france">France</option>
					  <option value="uk">United Kingdom</option>
					  <option value="Sweden">Sweden</option>
					</select></td>
				</tr>
				<tr>
					<td>ZIP Code</td>
					<!-- This is going to cause an issue with Canadian postalcodes which include letters -->
					<td><input type="text" name="zipCode" pattern="[0-9]{5,9}" required/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required/></td>
				</tr>
				<tr>
				  <td><label>Sex:</label></td>
				  <td>
				  	<!-- Making one required makes the whole group required -->
				    <input type="radio" id="male" name="sex" value="Male" required>
				    <label for="male">Male</label>			
				    <input type="radio" id="female" name="sex" value="Female">
				    <label for="female">Female</label>
				  </td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>