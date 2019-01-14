<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ page isELIgnored="false" %>   
       <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Urban Outfits</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/login.css'></c:url>">
  
  <!-- Angular js -->
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
  
  <!-- JQuery -->
  <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
  
  <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">

 
</head>
<body>

<nav class="navbar navbar-inverse">
		<div class="container">
		 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar" aria-expanded="false">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
		<div class="navbar-header" id="nav_bar">
         <c:url value="/resources/images/logo.png" var="url"></c:url>
	<a class="navbar-brand" href="${homeurl }"><img src="${url }" alt="URBANOUTFITS" height="30px" width="30px"></a>
			</div>
			  <a class="navbar-brand" href="${homeurl }">Urban Outfits</a>
			<div class="collapse navbar-collapse" id="myNavbar">
		<ul class="nav navbar-nav">
		<c:url value="/" var="homeurl"></c:url>
			<li class="active"><a href="${homeurl }">Home<span class="sr-only">You are in home page link</span></a></li>
			
			<c:url value="/aboutus" var="aboutusUrl"></c:url>
			<li><a href="${aboutusUrl }">AboutUs</a></li>
			
			<c:url value="/contactus" var="contactusUrl"></c:url>
			<li><a href="${contactusUrl }">ContactUs</a></li>
			
		
			
			<security:authorize access="hasRole('ROLE_ADMIN')">
			<c:url value="/admin/getproductform?id=0" var="productform"></c:url>
			<li><a href="${productform }">Add product</a></li>
			
				<c:url value="/all/getallproducts" var="producturl"></c:url>
		    <li><a href="${producturl }">Products</a><li>
		    
			</security:authorize>
			
		
			
             <li class="dropdown">
             <a href="" class="dropdown-toggle" data-toggle="dropdown">
             Select By Category<b class="caret"></b></a>
             <ul class="dropdown-menu">
             <li>
             <c:forEach items="${categories }" var="c">
             <c:url value="/all/product/searchbycategory?searchCondition=${c.categoryname }" var="url"></c:url>
             <a href="${url }">${c.categoryname }</a></c:forEach>
             <c:url value="/all/product/searchbycategory?searchCondition=ALL" var="urll">
             </c:url>
             
             
             
             <a href="${urll }">ALL</a></li>
             </ul>
             </li>
              <security:authorize access="hasRole('ROLE_USER')">
               	<c:url value="/all/getallproducts" var="producturl"></c:url>
		    <li><a href="${producturl }">Products</a><li>
             <li><a href="<c:url value='/cart/getcart/'></span></c:url>">Cart</a></li>
            
             </security:authorize>
              
			<c:if test="${pageContext.request.userPrincipal.name==null }">
			  <ul class="nav navbar-nav navbar-right">
			<c:url value="/login" var="log"></c:url>
			<li><a href="${log }"><span class="glyphicon glyphicon-log-in"></span> login</a></li> 
			
			<c:url value="/all/registrationform" var="register"></c:url>
			<li><a href="${register }"><span class="glyphicon glyphicon-user"></span> join for free</a></li>
			</c:if>
			
			<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<li><a href="${homeurl }">Welcome ${pageContext.request.userPrincipal.name }</a></li>
			<li><a href="<c:url value='/j_spring_security_logout'></c:url>">Logout</a>
			</c:if>
			</ul>
			</div>
		</div>
	</nav>
</body>
</html>

