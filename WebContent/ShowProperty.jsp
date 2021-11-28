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
<title>View Properties</title>
</head>
<body>
	<!-- Header -->
	<%@include file="Header.jsp"%>

	<!-- Search -->
	<%@include file="Search.jsp"%>

	<!-- list of properties -->
	<%@include file="PropertyList.jsp"%>

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
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script src="js/swiper.min.js"></script>
	<script src="js/infobox.min.js"></script>
	<script src="js/markerclusterer.js"></script>
	<script src="js/custom-maps.js"></script>
	<script src="js/custom.js"></script>

</body>
</html>