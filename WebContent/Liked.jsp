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
<title>Liked Properties</title>
<!-- CSS here -->
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/account-style.css">
</head>
<body>
	<!-- header -->
	<%@include file="Header.jsp"%>

	<!-- Subheader -->
	<div class="subheader section-padding">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="breadcrumb-wrapper">
						<div class="page-title">
							<h1 class="text-theme fw-500">Welcome To Your Account!</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="index.jsp">Back To Homepage</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br><br><br><br>

	<!-- User Dashboard -->
	<section class="bg-light">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12">
					<div class="filter_search_opt">
						<a href="javascript:void(0);" onclick="openFilterSearch()">Dashboard
							Navigation<i class="ml-2 ti-menu"></i>
						</a>
					</div>
				</div>
			</div>

			<div class="row">

				<div class="col-lg-3 col-md-12">

					<div class="simple-sidebar sm-sidebar" id="filter_search">

						<div class="sidebar-widgets">
							<div class="dashboard-navbar">

								<div class="d-user-avater">
									<img src="images/user.jpg" class="img-fluid avater" alt="">
									<h4 style="color: black">User Name: ${userName}</h4>
									<h6 style="color: grey">User ID: ${userID}</h6>
								</div>

								<div class="d-navigation">
									<ul>
										<li><a href="Account.jsp"><i class="ti-user"></i>My Profile</a></li>
										<li class="active"><a href="Liked.jsp"><i class="ti-heart"></i>Liked Properties</a></li>
										<li><a href="MyProperty.jsp"><i class="ti-layers"></i>My Properties</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-9 col-md-12">
					<div class="dashboard-wraper">

						<!-- Bookmark Property -->
						<table class="property-table-wrap responsive-table bkmark">

							<tbody>
								<tr>
									<th><i class="fa fa-file-text"></i>Liked Properties</th>
									<th></th>
								</tr>

								<!-- Item #1 -->
								<tr>
									<td class="property-container"><img
										src="images/house1.jpg" alt="">
										<div class="title">
											<h4>
												<a href="PropertyDetail.jsp">Serene Uptown</a>
											</h4>
											<span>6 Bishop Ave. Perkasie, PA </span> <span
												class="table-property-price">$900 / monthly</span>
										</div></td>
									<td class="action"><a href="#" class="delete"><i
											class="ti-close"></i> Delete</a></td>
								</tr>

								<!-- Item #2 -->
								<tr>
									<td class="property-container"><img
										src="images/house1.jpg" alt="">
										<div class="title">
											<h4>
												<a href="PropertyDetail.jsp">Oak Tree Villas</a>
											</h4>
											<span>71 Lower River Dr. Bronx, NY</span> <span
												class="table-property-price">$535,000</span>
										</div></td>
									<td class="action"><a href="#" class="delete"><i
											class="ti-close"></i> Delete</a></td>
								</tr>

								<!-- Item #3 -->
								<tr>
									<td class="property-container"><img
										src="images/house1.jpg" alt="">
										<div class="title">
											<h4>
												<a href="PropertyDetail.jsp">Selway Villas</a>
											</h4>
											<span>33 William St. Northbrook, IL </span> <span
												class="table-property-price">$420,000</span>
										</div></td>
									<td class="action"><a href="#" class="delete"><i
											class="ti-close"></i> Delete</a></td>
								</tr>

								<!-- Item #4 -->
								<tr>
									<td class="property-container"><img
										src="images/house1.jpg" alt="">
										<div class="title">
											<h4>
												<a href="PropertyDetail.jsp">Town Manchester</a>
											</h4>
											<span> 7843 Durham Avenue, MD </span> <span
												class="table-property-price">$420,000</span>
										</div></td>
									<td class="action"><a href="#" class="delete"><i
											class="ti-close"></i> Delete</a></td>
								</tr>

							</tbody>
						</table>

					</div>
				</div>

			</div>
		</div>
	</section>

	<!-- footer & Scroll Up -->
	<%@include file="FooterScroll.jsp"%>

	<!-- JS here -->
	<script src="js/jquery.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/rangeslider.js"></script>
	<script src="js/select2.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/slick.js"></script>
	<script src="js/slider-bg.js"></script>
	<script src="js/lightbox.js"></script>
	<script src="js/imagesloaded.js"></script>
	<script src="js/custom.js"></script>
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
	<script>
		function openFilterSearch() {
			document.getElementById("filter_search").style.display = "block";
		}
		function closeFilterSearch() {
			document.getElementById("filter_search").style.display = "none";
		}
	</script>

</body>
</html>