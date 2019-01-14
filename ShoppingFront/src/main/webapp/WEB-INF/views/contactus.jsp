<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel='stylesheet' href='style.css' type='text/css' media='all' />
<title>Contact Us</title>
<style>
body{
    background-color:#BFE87F;
    color: #2c3e50;
    
    font-family: sans-serif;
}
</style>
</head>
<body>
	<div id="central">
		<div class="content">
			<h1>Contact Us</h1>
			<p>Send your feedback through this form and we will get back to
				you.</p>
			<div id="message">
				<form id="frmContact" name="frmContact" action="" method="POST"
					novalidate="novalidate">
					
					
					<div class="field">
					<label for="inputsm">Name:</label>
						<input type="text" id="pp-name" name="name"
							placeholder="enter your name here" title=""
							class="required" aria-required="true" required>
					</div>
					<br>
					
					<div class="field">
					<label for="inputsm">Email:</label>
						<input type="text" id="pp-email" name="email"
							placeholder="enter your email address here"
							title="" class="required email"
							aria-required="true" required>
					</div>
					<br>
					
					<div class="field">
						<label for="inputsm">Number:</label>
						<input type="text" id="pp-phone" name="phone"
							placeholder="enter your phone number here"
							title="" class="required phone"
							aria-required="true" required>
					</div>
					<br>
					
					<div class="field">
						<label for="inputsm">Meassage:</label>
						<textarea id="about-project" name="message"
							placeholder="enter your message here"></textarea>
					</div>
					<br>
					<div id="mail-status"></div>
					<button type="submit" class="btn btn-default" value="Send Message"
						id="send-message" style="clear: both;">Submit</button>
					
					
				</form>
			</div>
		</div>
		<!-- content -->
	</div>
	<!-- central -->
</body>
</html>