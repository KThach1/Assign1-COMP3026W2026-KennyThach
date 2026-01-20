<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>User Registration Form</h1>

		<!-- form action ="RegFormServlet" method="post"> -->
<form action="<%=request.getContextPath()%>/RegFormServlet" method="post">
			<table style="width: 80%">
				<tr>
					<td><label for="userName">Username</label></td>
					<!-- Pattern is from 5 to 12 characters long and only letters (upper or lower case) and numbers -->
					<td><input id="userName" type="text" name="userName" pattern="[A-Za-z0-9]{5,12}" required /></td>
				</tr>
				<tr>
					<td><label for="password">Password</label></td>
					<!-- Pattern is any characters (the period means any character) but min 7 characters and max 12 -->
					<td><input id="password" type="password" name="password" pattern=".{7,12}"required/></td>
				</tr>
				<tr>
					<td><label for="fullName">Full Name</label></td>
					<!-- Pattern should be letters only (* means zero or more but + means at least one character)-->
					<!-- Pattern from the internet for optional middle name which would require two spaces -->
					<td><input id="fullName" type="text" name="fullName" pattern="[A-Za-z]+( [A-Za-z]+){1,2}" required/></td>
				</tr>
				<tr>
					<td><label for="address">Address</label></td>
					<td><input id="address" type="text" name="address" /></td>
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
					<td><label for="zipCode">ZIP Code</label></td>
					<!-- This is going to cause an issue with Canadian postalcodes which include letters -->
					<td><input id="zipCode" type="text" name="zipCode" pattern="[0-9]{5,9}" required/></td>
				</tr>
				<tr>
					<td><label for="email">Email</label></td>
					<td><input id="email" type="email" name="email" required/></td>
				</tr>
				<tr>
				  <td><label for="male">Sex:</label></td>
				  <td>
				  	<!-- Making one required makes the whole group required -->
				    <input type="radio" id="male" name="sex" value="Male" required>
				    <label for="male">Male</label>			
				    <input type="radio" id="female" name="sex" value="Female">
				    <label for="female">Female</label>
				  </td>
				</tr>
				<!-- Wasn't able to get "required to work on checkbox group for language so it was changed to radiobutton -->
				<tr>
				  <td><label>Language:</label></td>
				  <td>
				  	<!-- Making one required makes the whole group required -->
				    <input type="radio" id="english" name="language" value="english" required>
				    <label for="english">English</label>			
				    <input type="radio" id="french" name="language" value="french">
				    <label for="frenchh">French</label>
				  </td>
				</tr>
				<tr>
					<td><label for="about">About:</label></td>
					<td><textarea id="about" name="about" rows="10" cols="50"></textarea></td>
				</tr>
				
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>