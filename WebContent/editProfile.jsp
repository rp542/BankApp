<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
</head>
<body bgcolor="pink" style="text-align:left">
<br>
<h1>Edit Details</h1>
<form action="editProfile" method="post">
	<br><br>
	<label> Customer Id: </label>
		<input type="number" value="${customer.customerId}" name="customerId" readonly/>
		<br> <br>
		<label> Customer Name: </label>
		<input type="text" placeholder="${customer.customerName}" name="customerName" required/>
		<br> <br>
		<label> Customer Password: </label>
		<input type="password" value="${customer.customerPassword}" name="customerPassword" readonly/>
		<br> <br>
		  <label> Customer Email: </label>
		<input type="email" placeholder="${customer.customerEmail}" name="customerEmail" required/>
		<br> <br>
	    <label> Customer Address: </label>
		<input type="text" placeholder="${customer.customerAddress}" name="customerAddress" required/>
		<br> <br>
	    <label> Customer DOB: </label>
		<input type="date"placeholder="${customer.customerDateOfBirth}" name="customerDob"  required/>
	    <br> <br><br>
	<input type="submit" value="Edit"/>
	</form>
</body>
</html>