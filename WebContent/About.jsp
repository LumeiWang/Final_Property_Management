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
<title>About Us</title>

<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/style2.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/swiper.min.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/responsive.css">

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
							<h1 class="text-theme fw-500">About Us</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="index.jsp">Back To Homepage</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- About Us -->
    <section class="section-padding about-us">
        <div class="container">
            <div class="row">
                <div class="col-xl-7 col-lg-6 align-self-center mb-md-80">
                    <div class="about-left-side">
                        <div class="section-header">
                            <div class="section-heading">
                                <h5 class="text-custom-blue">About</h5>
                                <h3 class="text-theme fw-700">Our Story</h3>
                            </div>
                        </div>
                        <div class="about-desc">
                            <p class="text-light-white">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text.</p>
                            <p class="text-light-white">
                                On the other hand, we denounce with righteous indignation the foult anuals dislike men who are so beguiled and demoralized by the nuhaiicharms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound toen sue; and equal blame belongs to those who fail in their duty.
                            </p>
                        </div>
                        <div class="about-list">
                            <ul class="custom">
                                <li class="text-theme fs-14"><span class="ti-pin"></span> Personalized Service.</li>
                                <li class="text-theme fs-14"><span class="ti-pin"></span> 24/7 support.</li>
                                <li class="text-theme fs-14"><span class="ti-pin"></span> Financing made easy.</li>
                                <li class="text-theme fs-14"><span class="ti-pin"></span> Trusted by thousands.</li>
                            </ul>
                        </div>                     
                    </div>
                </div>
                <div class="col-xl-5 col-lg-6">
                    <div class="about-right-side">
                        <img src="images/about.jpg" class="img-fluid full-width" alt="about">
                    </div>
                </div>
            </div>
        </div>
    </section>
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

</body>
</html>