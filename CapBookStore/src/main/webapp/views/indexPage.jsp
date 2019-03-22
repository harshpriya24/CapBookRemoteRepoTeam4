<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<title>
<h3>Capbook</h3>
</title>
<style>
.col {
  float: right;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}
.h2{
float:centre;
color:blue;
}
input[type=submit] {
  background-color:blue;
  color: white;
  cursor: pointer;
}
input[type=submit]:hover {
  background-color: green;
}
</style>
<body>
<table>
<tr>
<td>Click Here To</td>
<a href="login">Sign In</a>
</td>
</tr>
<br>
<tr>
<td>Click Here To</td>
<a href="registration">Sign Up</a>
</td>
</tr>
</table>
 </body>
</html>