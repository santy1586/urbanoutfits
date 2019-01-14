<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
    background-image:url("resources/images/pic1.jpg");
     background-size: 1500px 900px;
     background-repeat: no-repeat;
    background-color: none;
    font-family: sans-serif;
}
</style>
</head>
<body>
${error }<br>
${message }<br>

<c:url value='/j_spring_security_check' var="url"></c:url>
<form action="${url }" method="post">
<center>
<div class="container">

<thead><h1>Urban Outfits</h1>
</thead>
<tr>
<td><b>Enter Username</b></td>
<td><input type="text" name="j_username"></td>
</tr>
<br>
<br>
<tr><td><b>Enter Password</b></td>
<td><input type="password" name="j_password"></td></tr>
</tr>
<br>
<br>
<td colspan="2">
<center><button type="submit" class="btn btn-default">Submit</button></center>
</td></tr></table>
</div></center></form>
</body>
</html>