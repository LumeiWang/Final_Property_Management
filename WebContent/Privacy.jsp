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
<title>Privacy Policy</title>

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
							<h1 class="text-theme fw-500">Privacy Policy</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="index.jsp">Back To Homepage</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Privacy Policy -->
	<section class="section-padding about-us">
		<div class="container">
			<div class="row">
				<div class="col-xl-7 col-lg-6 align-self-center mb-md-80">
					<div class="about-left-side">
						<div class="section-header">
							<div class="section-heading">
								<h3 class="text-theme fw-700">Property Manager</h3>
							</div>
						</div>
						<h5 class="text-custom-blue">This service is operated by
							PropertyManager House Rental.</h5>
						<h5 class="text-light-white">If you visit our website or
							contact us, this policy is for you. It's about how we protect
							your data and respect your privacy. We last updated this policy
							in October 2021. We update it from time to time as we make
							improvements or when laws change. Please check it regularly to
							make sure you know exactly how we use your data.</h5>
					</div>
				</div>
				<div class="col-xl-5 col-lg-6">
					<div class="about-right-side">
						<img src="images/house3.jpg" class="img-fluid full-width"
							alt="about">
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="section-padding bg-light-white listing-detail">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="description-box bg-custom-white padding-20">
						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Your property
									information on PropertyManager</h5>
							</div>
							<p class="text-light-white desc">This policy applies to the
								personal information you share with us, not the information
								about properties we show on our website or apps. This
								information is about the property itself, not about the
								occupants or owners of that property.</p>
							<p class="text-light-white desc">
								If you have any questions about the property information we
								display, please <a href="Contact.jsp"
									class="text-light-white desc">contact us</a>. If you’re selling
								or letting a property that’s being advertised on our website or
								apps, please direct any questions to your estate agent.
							</p>
						</div>
						<br>

						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Data we collect
									about you</h5>
							</div>
							<p class="text-light-white desc">When you use our online
								services, we collect data about your visit, including which
								webpages you visited. Sometimes you might give us data, such as
								your email address.</p>
							<p class="text-light-white desc">In this section, we outline
								what information we collect about you when you use our services,
								why we collect it and the legal basis on which we use it.</p>
						</div>
						<br>

						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">Information about
									you</h5>
							</div>
							<h4 class="text-light-white desc">Your contact details (e.g.
								Your address and email address)</h4>
							<p class="text-light-white desc">We use this information to
								distinguish you from other users, and to contact you if we need
								to. To use our My Home service, we'll ask you about your
								relationship to the property address. Any data we collect from
								you will be used to provide products and services to help you
								make the most of your home, unless you ask us not to. If you
								sign up to receive property alerts or marketing emails, we’ll
								send them to your given email address. If you send a message to
								an agent or new homes developer through Zoopla, we’ll share your
								contact details with them so they can contact you.</p>

							<h4 class="text-light-white desc">Account information (e.g.
								Your login details and properties you liked)</h4>
							<p class="text-light-white desc">We use this information to
								maintain your account, save your preferences and manage the
								properties you save in our My Home service. We use this
								information in conjunction with other data we’ve collected from
								your site visits (such as when you last logged in to your
								account), to create audience segments. These segments help us
								make sure any content or ads we share with you via email or your
								mobile, or on our website, or elsewhere on the internet, are
								relevant to you.</p>

							<h4 class="text-light-white desc">Search information (e.g.
								Information about your property searches, clicks, and likes)</h4>
							<p class="text-light-white desc">We use this information to
								understand what you’re looking for and make informed
								suggestions. It also allows us to give Zoopla agents and
								developers a clearer idea of the kind of property we think would
								interest you. And it means we can show you ads or send you
								relevant, targeted emails based on your recent property searches
								and activity on our websites.</p>
						</div>
						<br>

						<div class="content-box">
							<div class="head">
								<h5 class="text-theme fw-600 no-margin">How we store your
									data</h5>
							</div>							
							<p class="text-light-white desc">The personal data we collect
								is processed at our UK offices and in third party data
								processing facilities. The personal data we collect is processed
								at our UK offices and in third party data processing facilities.
								Some of these third parties are located outside the UK and the
								European Economic Area (EEA). If we ever transfer your personal
								data outside the UK and the EEA, we take steps to protect your
								privacy and make sure that the transfers comply with the law.
								These steps usually include ‘Standard Contractual Clauses’ to
								ensure the recipient protects the personal data fully and
								appropriately. Please contact us for more information about our
								data transfer safeguards.</p>
							<p class="text-light-white desc">We only keep your data long
								enough to carry out the task we collected it for. After that
								time, we safely delete it. The exact amount of time varies
								depending on the type of data and how we use it.</p>
							<p class="text-light-white desc">We only share your personal
								data with those suppliers, who host our websites and power our
								business systems, when we absolutely need to. If these suppliers
								are located outside the UK and the EEA, we take further steps to
								protect your privacy and make sure that those transfers comply
								with the law.</p>
						</div>

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