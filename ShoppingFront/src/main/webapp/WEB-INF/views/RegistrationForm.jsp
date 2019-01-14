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
     background-repeat: no-repeat;
  
    
}
</style>
</head>
<body>
<c:url value='/all/registercustomer' var="url"></c:url>
<form:form action="${url }" modelAttribute="customer">
<div class="" style="border:">
<center>ENTER CUSTOMER DETAILS</center>
<div class="form-group">
<form:label path="firstname">Enter Firstname</form:label>
<form:input path="firstname"  class="form-control"></form:input>
<form:errors path="firstname" ></form:errors>
</div>

<div class="form-group">
<form:label path="lastname">Enter Lastname</form:label>
<form:input path="lastname"  class="form-control"></form:input>

</div>

<div class="form-group">
<form:label path="email">Email</form:label>
<form:input path="email" type="email" class="form-control" title="Please enter valid email address"></form:input>
<form:errors path="email" cssStyle="color:red"></form:errors>
<span style="color:red">${duplicateEmail }</span>
</div>

<div class="form-group">
<form:label path="phonenumber">PhoneNumber</form:label>
<form:input path="phonenumber"  class="form-control"></form:input>
<form:errors path="phonenumber" cssStyle="color:red"></form:errors>
</div>
</div>

<div class="form-group" style="border:">
<center>ENTER LOGIN DETAILS</center>
<div class="form-group">
<form:label path="user.username">Username</form:label>
<form:input path="user.username"  class="form-control"></form:input>
<form:errors path="user.username" cssStyle="color:red"></form:errors>
<span style="color:red">${duplicateUsername }</span>
</div>

<div class="form-group">
<form:label path="user.password">Password</form:label>
<form:input path="user.password" type="password" class="form-control"></form:input>
<form:errors path="user.password" cssStyle="color:red"></form:errors>
</div>
</div>
<div class="boxed" style="border:">

<div class="form-group" style="border:">
<center>ENTER SHIPPING ADDRESS</center>
<div class="form-group">
<form:label path="shippingaddress.apartmentnumber">Apartment Number</form:label>
<form:input path="shippingaddress.apartmentnumber"  class="form-control"></form:input>
<form:errors path="shippingaddress.apartmentnumber" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.streetname">Streetname</form:label>
<form:input path="shippingaddress.streetname"  class="form-control"></form:input>
<form:errors path="shippingaddress.streetname" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.city">City</form:label>
<form:input path="shippingaddress.city"  class="form-control"></form:input>
<form:errors path="" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.state">State</form:label>
<form:input path="shippingaddress.state"  class="form-control"></form:input>
<form:errors path="" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.zipcode">Zipcode</form:label>
<form:input path="shippingaddress.zipcode"  class="form-control"></form:input>
<form:errors path="" cssStyle="color:red"></form:errors>
</div>
</div>


<center><button type="submit" class="btn btn-success">Submit</button></center>
</form:form>
</body>
</html>


