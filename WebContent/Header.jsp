<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<div id="preloader-active">
		<div
			class="preloader d-flex align-items-center justify-content-center">
			<div class="preloader-inner position-relative">
				<div class="preloader-circle"></div>
			</div>
		</div>
	</div>
	<!-- header starts -->
	<header>
		<div class="header-area">
			<div class="main-header">
				<div class="header-top header-sticky">
					<div class="container">
						<div
							class="d-flex align-items-center justify-content-between flex-wrap position-relative">
							<!-- Logo -->
							<div class="left-side d-flex align-items-center">
								<div class="logo">
									<img src="images/logo.png" alt="">
								</div>
								<!-- Main-menu -->
								<div class="main-menu d-none d-lg-block">
									<nav>
										<ul id="navigation">
											<li><a href="#">MENU</a>
												<ul class="submenu">
													<%
													if (session.getAttribute("userEmail") == null) {
													%>
													<li><a href="/Project/viewProperty">For Rent/Sale</a></li>
													<li><a href="Contact.jsp">Contact</a></li>
													<li><a href="FAQ.jsp">FAQs</a></li>
													<%
													} else {
													%>
													<li><a href="Account.jsp">My Account</a></li>
													<li><a href="/Project/viewProperty">For Rent/Sale</a></li>
													<li><a href="Contact.jsp">Contact</a></li>
													<li><a href="FAQ.jsp">FAQs</a></li>
													<%
													}
													%>
												</ul></li>
											<li><a href="index.jsp">HOMEPAGE</a></li>
											<li><a href="Register.jsp">REGISTER</a></li>
										</ul>
									</nav>
								</div>
							</div>
							<div class="header-right-btn f-right">
								<%
								if (session.getAttribute("userEmail") == null) {
								%>
								<a href="Login.jsp" class="btn_1">Sign In</a>
								<%
								} else {
								%>
								<a href="SignOut.jsp" class="btn_1">Sign Out</a>
								<%
								}
								%>
							</div>
							<div class="col-12">
								<div class="mobile_menu d-block d-lg-none"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<hr>
	<!-- header ends -->

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