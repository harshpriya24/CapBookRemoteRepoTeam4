<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: blue;
	font-weight: bold;
}
</style>
</head>
<body>
	<form:form action="registerUser" method="post" modelAttribute="user">
		<div class="container">
			<h2>Sign Up</h2>
			<table>
				<tr>
					<td>FirstName :</td>
					<td><form:input path="firstName" size="30" /></td>
					<td><form:errors path="firstName" cssClass="error" /></td>
					<input type="text" placeholder="Enter FirstName " name="FirstName "
						required>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td><form:input path="lastName" size="30" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
					<input type="text" placeholder="Enter Last Name" name="LastName"
						required>
				</tr>
				<tr>
					<td>Email :</td>
					<td><form:input path="email" size="30" /></td>
					<td><form:errors path="email" cssClass="error" /></td>
					<input type="text" placeholder="Enter Email" name="email" required>
				</tr>
				<tr>
					<td>Password :</td>
					<td><form:input path="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
					<input type="text" placeholder="Enter password" name="password"
						required>
				</tr>
				<tr>
					<td>Confirm Password :</td>
					<td><form:input path="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
					<input type="text" placeholder="Enter Password Again"
						name="psw-repeat" required>
				</tr>
				<input type="submit" value="Submit" />
			</table>
		</div>
	</form:form>
</body>
</html>