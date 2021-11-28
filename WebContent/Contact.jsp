<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact Us</title>

<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/other-style.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/swiper.min.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700&display=swap">

</head>
<body>
	<!-- Header -->
	<%@include file="Header.jsp"%>
	<!-- Subheader -->
	<div class="subheader section-padding">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="breadcrumb-wrapper">
						<div class="page-title">
							<h1 class="text-theme fw-500">Contact Us</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="index.jsp">Back To Homepage</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Start Contact top -->
	<section class="section-padding bg-light-white contact-top">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-sm-6">
					<div class="contact-info-box mb-md-40">
						<i class="ti-location-pin"></i>
						<h6 class="text-theme fw-600">
							76-82, Park St,<br> London, SE1 9DZ, United Kingdom
						</h6>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="contact-info-box mb-md-40">
						<i class="ti-user"></i>
						<h6 class="text-theme fw-600">
							<a href="#" class="text-theme">(+44)7529285746</a><br>
							Mon-Sat 9:00am-5:00pm
						</h6>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="contact-info-box">
						<i class="ti-email"></i>
						<h6 class="text-theme fw-600">
							<a href="#" class="text-theme">propertymanager036@gmail.com</a><br> 24 X
							7 online support
						</h6>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Contact map -->
	<div class="contact-map">
		<iframe
			src="https://maps.google.com/maps?q=university%20of%20san%20francisco&amp;t=&amp;z=13&amp;ie=UTF8&amp;iwloc=&amp;output=embed"></iframe>
	</div>
	<br>
	<!-- subscribe Area -->
	<%@include file="Subscribe.jsp"%>

	<!-- footer & Scroll Up -->
	<%@include file="FooterScroll.jsp"%>

	<!-- JS here -->
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.nice-select.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script src="js/swiper.min.js"></script>
	<script src="js/infobox.min.js"></script>
	<script src="js/markerclusterer.js"></script>
	<script src="js/custom-maps.js"></script>
	<script src="js/custom.js"></script>
	<script
		src="https://ditu.google.cn/maps/api/js?key=AIzaSyDnd9JwZvXty-1gHZihMoFhJtCXmHfeRQg"></script>

</body>
</html>