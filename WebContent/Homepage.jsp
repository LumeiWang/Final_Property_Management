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
<title>Property Manager</title>
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
	<!-- header -->
	<%@include file="Header.jsp"%>
	<main>
		<!-- slider Area -->
		<section class="slider-area ">
			<div class="slider-active">
				<!-- Single Slider -->
				<div
					class="single-slider slider-bg1 hero-overly slider-height d-flex align-items-center">
					<div class="container">
						<div class="row">
							<div class="offset-xl-1 col-xxl-5 col-xl-6 col-lg-6 col-md-8">
								<div class="hero-caption">
									<span>Find your ideal house from 500+ properties</span>
									<h1 data-animation="bounceIn" data-delay="0.2s">Your Best
										Choice</h1>
									<p data-animation="fadeInUp" data-delay="0.4s">Get started
										by viewing properties with us and find your favourite!</p>
									<span class="price">From £100 To £20,000 per month</span> <a
										href="/Project/viewProperty" class="btn hero-btn" data-animation="fadeInUp"
										data-delay="0.7s">View Properties</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- latest-items -->
		<section class="latest-items section-padding">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-xxl-6 col-xl-7">
						<!-- Section Tittle -->
						<div class="section-tittle mb-50 text-center ">
							<h2>Latest Properties</h2>
						</div>
					</div>
				</div>
				<div class="items-active">
					<div class="single-cat mb-30">
						<div class="cat-img">
							<img src="images/inside1.png" alt="">
						</div>
						<div class="cat-cap">
							<div class="cap-top">
								<span>£950 per month</span>
								<h5>
									<a href="#">Scot House</a>
								</h5>
								<p>
									> 1-bed flat<br>> 0.2miles to Glasgow Queen Street
								</p>
							</div>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="single">
									<img src="images/bed.svg" alt=""> <span>1 Bedroom</span>
								</div>
							</div>
						</div>
					</div>
					<div class="single-cat mb-30">
						<div class="cat-img">
							<img src="images/inside1.png" alt="">
						</div>
						<div class="cat-cap">
							<div class="cap-top">
								<span>£950 per month</span>
								<h5>
									<a href="#">Scot House</a>
								</h5>
								<p>
									> 1-bed flat<br>> 0.2miles to Glasgow Queen Street
								</p>
							</div>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="single">
									<img src="images/bed.svg" alt=""> <span>1 Bedroom</span>
								</div>
							</div>
						</div>
					</div>
					<div class="single-cat mb-30">
						<div class="cat-img">
							<img src="images/inside1.png" alt="">
						</div>
						<div class="cat-cap">
							<div class="cap-top">
								<span>£950 per month</span>
								<h5>
									<a href="#">Scot House</a>
								</h5>
								<p>
									> 1-bed flat<br>> 0.2miles to Glasgow Queen Street
								</p>
							</div>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="single">
									<img src="images/bed.svg" alt=""> <span>1 Bedroom</span>
								</div>
							</div>
						</div>
					</div>
					<div class="single-cat mb-30">
						<div class="cat-img">
							<img src="images/inside1.png" alt="">
						</div>
						<div class="cat-cap">
							<div class="cap-top">
								<span>£950 per month</span>
								<h5>
									<a href="#">Scot House</a>
								</h5>
								<p>
									> 1-bed flat<br>> 0.2miles to Glasgow Queen Street
								</p>
							</div>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="single">
									<img src="images/bed.svg" alt=""> <span>1 Bedroom</span>
								</div>
							</div>
						</div>
					</div>
					<div class="single-cat mb-30">
						<div class="cat-img">
							<img src="images/inside1.png" alt="">
						</div>
						<div class="cat-cap">
							<div class="cap-top">
								<span>£950 per month</span>
								<h5>
									<a href="#">Scot House</a>
								</h5>
								<p>
									> 1-bed flat<br>> 0.2miles to Glasgow Queen Street
								</p>
							</div>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="single">
									<img src="images/bed.svg" alt=""> <span>1 Bedroom</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Services Area -->
		<section class="categories-area section-bg">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-xl-4">
						<div class="section-tittle section-title3 mb-20">
							<h2>
								Explore<br>by Different Cities
							</h2>
							<p>Get started by choosing your city.</p>
							<a href="#" class="btn mt-30">View All Properties</a>
						</div>
					</div>
					<div class="col-xl-2 col-lg-3 col-md-4 col-sm-6 p-0">
						<div class="single-cat text-center mb-10">
							<div class="cat-icon">
								<img src="images/property1.svg" alt="">
							</div>
							<div class="cat-cap">
								<h5>
									<a href="#">Glasgow</a>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-xl-2 col-lg-3 col-md-4 col-sm-6 p-0">
						<div class="single-cat text-center mb-10">
							<div class="cat-icon">
								<img style="transform: scale(0.1 0.1);"
									src="images/property2.svg" alt="">
							</div>
							<div class="cat-cap">
								<h5>
									<a href="#">London</a>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-xl-2 col-lg-3 col-md-4 col-sm-6 p-0">
						<div class="single-cat text-center mb-10">
							<div class="cat-icon">
								<img src="images/property3.svg" alt="">
							</div>
							<div class="cat-cap">
								<h5>
									<a href="#">Cambridge</a>
								</h5>
							</div>
						</div>
					</div>
					<div class="col-xl-2 col-lg-3 col-md-4 col-sm-6 p-0">
						<div class="single-cat text-center mb-10">
							<div class="cat-icon">
								<img src="images/property4.svg" alt="">
							</div>
							<div class="cat-cap">
								<h5>
									<a href="#">Edingburgh</a>
								</h5>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- subscribe Area -->
		<%@include file="Subscribe.jsp"%>
	</main>
	<!-- footer & Scroll Up -->
	<%@include file="FooterScroll.jsp"%>

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