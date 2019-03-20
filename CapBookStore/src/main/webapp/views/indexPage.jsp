<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>
Capbook
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
<h2>WELCOME TO CAPBOOK</h2>
<form>
 <div class="col">
 <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
      </div>
	  </form>
	  <form>
	  <div class="container">
	  <h2>Sign Up</h2>
	  <hr>
	  <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
	<label for="firstname"><b>FirstName</b></label>
    <input type="text" placeholder="Enter FirstName" name="firstname" required>
	<label for="lastname"><b>LastName</b></label>
    <input type="text" placeholder="Enter LastName" name="lastname" required>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="psw-confirm" required>
    <hr>
	<button type="submit" class="registerbtn">Register</button>
  </div>

	  </form>
 </body>
</html>