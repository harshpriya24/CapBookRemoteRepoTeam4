<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<style >
.error{
 color:blue;
 font-weight:bold;
}
</style>
</head>
<body>
<div align="center">
<table>
<form:form action="registerUser" method="post" modelAttribute="user">
<tr>
 <td>FirstName :</td>
 <td><form:input path="firstName" size="30"/></td>
  <td><form:errors path="firstName" cssClass="error"/></td>
    </tr>
 <tr>
 <td>Last Name :</td>
 <td><form:input path="lastName" size="30"/></td>
   <td><form:errors path="lastName" cssClass="error"/></td>
 </tr>
 <tr>
 <td>userName</td>
<td><form:input path="userName" size="30"/></td>
  <td><form:errors path="userName" cssClass="error"/></td>
</tr>
<tr>
 <td>email</td>
<td><form:input path="email" size="30"/></td>
  <td><form:errors path="email" cssClass="error"/></td>
</tr>
<tr>
 <td>password</td>
<td><form:input path="password" size="30"/></td>
  <td><form:errors path="password" cssClass="error"/></td>
</tr>
<tr>
 <td>gender</td>
<td><form:input path="gender" size="30"/></td>
  <td><form:errors path="gender" cssClass="error"/></td>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>
</tr>
</form:form>
</table>
</div>
</body>
</html>