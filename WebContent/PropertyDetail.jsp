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
<title>Property Details</title>
<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/other-style.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/swiper.min.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/proList.css">
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
							<h1 class="text-theme fw-500">Property Details</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="/Project/viewProperty">Back To View Properties</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Listing Details -->
	<section class="section-padding bg-light-white listing-detail">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="listing-detail-heading mb-xl-20">
						<h3 class="no-margin text-theme">Eagle Apartments</h3>
					</div>

					<div class="row">
						<div class="col-lg-6">
							<div class="proDet wrapper">
								<div class="proImg fl">
									<img class="det" src="images/house1.jpg" />
									<div class="smallImg clearfix">
										<img src="images/house1.jpg" data-src="images/house1.jpg">
										<img src="images/house2.jpg" data-src="images/house2.jpg">
										<img src="images/house3.jpg" data-src="images/house3.jpg">
										<img src="images/house1.jpg" data-src="images/house1.jpg">
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="property-details-box">
								<div class="property-details-wrap">
									<div class="price-box mb-xl-20">
										<span class="price text-custom-blue">£ 2,750
										<span class="text-light-white fs-16 fw-500">/ Month</span>
										</span>
										<button class="ti-heart" onclick="change(this)" style="width:150px;height:50px;border:5px;border-radius: 5px;color:black"> Like</button>
										<script type="text/javascript">
											function change(i){
    											if(i.style.backgroundColor==""){
    												i.style.backgroundColor="#FFB6C1";
    											} else{
    												i.style.backgroundColor="";
    											}
    										}
										</script>										
										</div>
									<div class="details">
										<div class="text text-light-white">
											Bedroom: <span class="text-theme">2</span>
										</div>
										<div class="text text-light-white">
											Bathroom: <span class="text-theme">1</span>
										</div>
										<div class="text text-light-white">
											Property type: <span class="text-theme">Townhome</span>
										</div>
										<div class="text text-light-white">
											Size: <span class="text-theme">530 Sqft</span>
										</div>

										<div class="text text-light-white">
											Year built: <span class="text-theme">2010</span>
										</div>
										<div class="text text-light-white">
											Location: <span class="text-theme">Los Angeles</span>
										</div>
										<br>
										<div class="text text-light-white">
											Added on: <span class="text-theme">03.12.19</span>
										</div>
										<hr>
										<div class="contact-form">
											<h5 class="text-theme fw-600 no-margin">Contact Info.</h5>
											<br>
											<div class="text text-light-white">
												Name: <span class="text-theme">Rose</span>
											</div>
											<div class="text text-light-white">
												Email: <span class="text-theme">7335@gmail.com</span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="description-box bg-custom-white padding-20">
						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Description</h5>
							</div>
							<p class="text-light-white desc">Lorem Ipsum is simply dummy
								text of the printing and typesetting industry. Lorem Ipsum has
								been the industry's standard dummy text ever since the 1500s,
								when an unknown printer took a galley of type and scrambled it
								to make a type specimen book. It has survived not only five
								centuries, but also the leap into electronic typesetting,
								remaining essentially unchanged. It was popularised in the 1960s
								with the release of Letraset sheets containing Lorem Ipsum
								passages, and more recently with desktop publishing software
								like Aldus PageMaker including versions of Lorem Ipsum. Lorem
								Ipsum is simply dummy text of the printing and typesetting
								industry. Lorem Ipsum has been the industry's standard dummy
								text ever since the 1500s, when an unknown printer took a galley
								of type and scrambled it to make a type specimen book.</p>
						</div>
						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Property info. for:
									Eagle Apartments</h5>
							</div>
							<ul class="custom listing-infor">
								<li><a href="#" class="text-theme fs-14">Price: £
										2,75,000</a></li>
								<li><a href="#" class="text-theme fs-14">Rooms: 15</a></li>
								<li><a href="#" class="text-theme fs-14">Fireplace</a></li>
								<li><a href="#" class="text-theme fs-14">Status: For
										sale</a></li>
								<li><a href="#" class="text-theme fs-14">Townhome</a></li>
								<li><a href="#" class="text-theme fs-14">2 Balcony</a></li>
								<li><a href="#" class="text-theme fs-14">2 Bedrooms</a></li>
								<li><a href="#" class="text-theme fs-14">Deck</a></li>
								<li><a href="#" class="text-theme fs-14">Dryer</a></li>
								<li><a href="#" class="text-theme fs-14">1 Bathrooms</a></li>
								<li><a href="#" class="text-theme fs-14">Private
										balcony</a></li>
								<li><a href="#" class="text-theme fs-14">Washer</a></li>
							</ul>
						</div>
						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Property on Map</h5>
							</div>
							<div class="location mb-xl-20">
								<iframe id="locmap"
									src="https://maps.google.com/maps?q=university%20of%20san%20francisco&amp;t=&amp;z=13&amp;ie=UTF8&amp;iwloc=&amp;output=embed"></iframe>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
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
	<script src="js/pro.js"></script>
	<script
		src="https://ditu.google.cn/maps/api/js?key=AIzaSyDnd9JwZvXty-1gHZihMoFhJtCXmHfeRQg"></script>

</body>
</html>