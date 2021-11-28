<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
request.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Success</title>
</head>
<!-- CSS here -->
<link rel="stylesheet" href="css/style.css">
<body>
	<div>
		<img src="images/logo.png"></img>
	</div>
	<hr>
	<div class="login-form-area" style="position:absolute;top:10px;left:250px;">
		<div class="login-form">
			<div class="login-heading">
				<span>Successfully Registered</span>
				<p>Click "Login" to continue.</p>
			</div>
			<div style="text-align:center;">				
				<a href="Login.jsp" class="btn_1">Login</a>
			</div>
		</div>
	</div>
	
	<!-- JS here -->
	<script src="js/modernizr-3.5.0.min.js"></script>
	<script src="js/jquery-1.12.4.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/jquery.magnific-popup.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.counterup.min.js"></script>
	<script src="js/waypoints.min.js"></script>
	<script src="js/contact.js"></script>
	<script src="js/jquery.form.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/mail-script.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/main.js"></script>
</body>
</html>