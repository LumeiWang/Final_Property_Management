<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort() + path;
	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign In</title>
<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/slicknav.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/fontawesome-all.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div>
		<img src = "images/logo.png"></img>
	</div>
	<hr>
	<form action="http://localhost:8080/Project/login" method="get">
	<main class="login-bg">
        <!-- Login Area-->
        <div class="login-form-area">
            <div class="login-form">
                <!-- Login Heading -->
                <div class="login-heading">
                    <span>Login</span>
                    <p>Enter Login details to get access (* Required)</p>
                </div>
                <!-- Single Input Fields -->
                <div class="input-box">
                    <div class="single-input-fields">
                        <label>Email Address *</label>
                        <input name="email" type="text" placeholder="Enter email address">
                    </div>
                    <div class="single-input-fields">
                        <label>Password *</label>
                        <input name="password" type="password" placeholder="Enter Password">
                    </div>

                    <div class="single-input-fields login-check">
                    <a href="ForgetPw.jsp" class="f-right">Forgot Password?</a>
                    </div>

                </div>
                <!-- form Footer -->
                <div class="login-footer">
                    <p>Don’t have an account? <a href="Register.jsp">Sign Up Here</a></p>
                    <input id="login" type="submit" value="Login" class="submit-btn3" />
                </div>
            </div>
        </div>
    </main>
    </form>

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