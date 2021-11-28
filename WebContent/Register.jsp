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
<title>Register</title>
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
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

<script type="text/javascript">	
	function check() {		
		var password = document.getElementById("pw").value;
    	var repassword = document.getElementById("repw").value;
    	
    	if(password == repassword) {
       		document.getElementById("alert").innerHTML="<br><font></font>";
    		document.getElementById("register").disabled = false;    			
		}else {
			document.getElementById("alert").innerHTML="<br><font color='red'>Different Passwords!</font>";
	    	document.getElementById("register").disabled = true; 
		} 
	}
</script>

</head>
<body>
	<div>
		<img src = "images/logo.png"></img>
	</div>
	<hr>
	<form action="http://localhost:8080/Project/register" method="post">
	<main class="login-bg">
        <!-- Register Area-->
        <div class="register-form-area">
            <div class="register-form text-center">
                <!-- Login Heading -->
                <div class="register-heading">
                    <span>Register</span>
                    <p>Create your account to get full access (* Required)</p>               
                </div>
                <!-- Single Input Fields -->
                <div class="input-box">
                    <div class="single-input-fields">
                        <label>Username *</label>
                        <input name="username" type="text" placeholder="Enter full name">
                    </div>
                    <div class="single-input-fields">
                        <label>Email Address *</label>
                        <input name="email" type="email" placeholder="Enter email address">
                    </div>
                     <div class="single-input-fields">
                        <label>Phone Number</label>
                        <input name="phone" type="text" placeholder="Enter phone number">
                    </div>
                    <div class="single-input-fields">
                        <label>Password *</label>
                        <input id="pw" name="password" type="password" placeholder="Enter Password" onkeyup="check()">
                    </div>
                    <div class="single-input-fields">
                        <label>Confirm Password *</label>
                        <input id="repw" name="repeatPw" type="password" placeholder="Confirm Password" onkeyup="check()">
                        <label id="alert"></label>
                    </div>
                </div>
                <!-- form Footer -->
                <div class="register-footer">
                    <p> Already have an account? <a href="Login.jsp"> Login here!</a></p>
                    <input id="register" type="submit" value="Register" class="submit-btn3" />
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