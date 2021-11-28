<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/propertyList-style.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/swiper.min.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/responsive.css">

</head>
<body>
	<section class="section-padding bg-light-white">
		<div class="container">
			<div class="section-tittle mb-50 text-center ">
				<h2>Choose Your Favorite</h2>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="listing-top-heading mb-xl-20">
						<h6 class="no-margin text-theme">Showing 5 Results</h6>
					</div>
				</div>

				<form action="http://localhost:8080/Project/viewProperty"
					method="get">
					<c:forEach var="property" items="${propertyList}">
						<div class="col-lg-12">
							<div class="property-list-view p-relative mb-xl-30">
								<div class="property-list-wrapper full-width-layout">
									<div class="property-list-img animate-img">
										<a href="PropertyDetail.jsp"> <img
											src="images/inside2.png" class="img-fluid image-fit"
											alt="property img">
										</a> <a href="PropertyDetail.jsp"></a>
										<div class="property-type">
											<a class="property-tag-1 bg-theme text-custom-white">${property.status}</a>
										</div>
									</div>
									<div class="property-list-content">
										<div class="content-box padding-20">
											<h4>
												<a href="PropertyDetail.jsp" class="text-theme">
													No.${property.ID}&nbsp;&nbsp;${property.name}</a>
											</h4>
											<h6 class="fs-14 text-custom-blue">
												<span>${property.city}&nbsp;&nbsp;${property.zip}</span>
											</h6>
											<p class="text-light-white mb-xl-20 desc">${property.description}</p>
											<ul class="custom property-feature">
												<li class="fs-14 fw-500"><img src="images/bed.svg"
													alt=""> <span>&nbsp;${property.bedroom}-Bedroom</span></li>
												<li class="fs-14 fw-500"><img src="images/bath.svg"
													alt=""><span>&nbsp;${property.bathroom}-Bathroom</span></li>
											</ul>
											<div class="property-list-footer">
												<a href="PropertyDetail.jsp"
													class="link-btn text-theme fs-14 fw-600">Read More <span
													class="ti-arrow-circle-right"></span></a> <span
													class="price fw-700 text-custom-blue">£&nbsp;${property.price}</span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
					<div class="row">
						<div class="col-12">
							<nav class="section-padding-top">
								<ul class="custom pagination justify-content-center">
									<li>Totally ${totalProperty} Properties&nbsp;&nbsp;</li>
									<li>&nbsp;&nbsp;Currently ${currentPage}/${totalPage}&nbsp;&nbsp;&nbsp;&nbsp;</li>
									<li><a style="color: black; font-weight: bold"
										href="viewProperty?currentPage=${currentPage-1<1?1:currentPage-1}${searchPara}">Previous&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
									<li><a style="color: black; font-weight: bold"
										href="viewProperty?currentPage=${currentPage+1>totalPage?totalPage:currentPage+1}${searchPara}">Next</a></li>
								</ul>
							</nav>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>

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