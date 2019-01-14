 <%@page import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h4>Product Details</h4></center><br>
<form action="<c:url value='/cart/addtocart/${product.id }'></c:url>">
<img src='<c:url value='/resources/images/${product.id }.png'></c:url>' height="350" width="250" alt="Image Not Available">
 ${product.productname }<br>
<b> DESCRIPTION:</b>${product.productDescription }<br><br>
<b>PRICE:</b>${product.price }<br><br>
<b>QUANTITY:</b>${product.quantity }<br><br>


<b>Enter Quantity</b>
<input type="text" name="quantity">
<button type="submit"  value='Add To Cart'  class="btn btn-primary btn-sm glyphicon" >
<span class="glyphicon-shopping-cart"></span>
</button>
</form>
</body>
</html> 
