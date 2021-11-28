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
<title>My Account</title>
<!-- CSS here -->
<link rel="stylesheet" href="css/account-style.css">
<script type="text/javascript">	
	function check() {		
		var password = document.getElementById("npw").value;
    	var repassword = document.getElementById("renpw").value;

    	if(password == repassword) {
       		document.getElementById("alert").innerHTML="<br><font></font>";
    		document.getElementById("change").disabled = false;    			
		}else {
			document.getElementById("alert").innerHTML="<br><font color='red'>Different Passwords!</font>";
	    	document.getElementById("change").disabled = true; 
		} 
	}
</script>
</head>
<body>
<%
String userEmail = request.getSession().getAttribute("userEmail").toString();
String userID = request.getSession().getAttribute("userID").toString();
String userName = request.getSession().getAttribute("userName").toString();
String userPhone = request.getSession().getAttribute("userPhone").toString();
%>
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
										<li class="active"><a href="Account.jsp"><i class="ti-user"></i>My Profile</a></li>
										<li><a href="Liked.jsp"><i class="ti-heart"></i>Liked Properties</a></li>
										<li><a href="MyProperty.jsp"><i class="ti-layers"></i>My Properties</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-9 col-md-12">
					<div class="dashboard-wraper">

						<!-- Basic Information -->
						<div class="form-submit">
							<table class="property-table-wrap responsive-table bkmark">
								<tbody>
									<tr>
										<th><i class="fa fa-file-text"></i>My Account</th>
										<th></th>
									</tr>
								</tbody>
							</table>
							<br>
							<!-- Account Details -->
							<div class="submit-section">
								<table>
									<tbody>
										<tr>
											<th style="font-size:20px;font-weight:400px"><i></i>Account Details</th>
											<th></th>
										</tr>
									</tbody>
								</table>
								<br>
								<div class="row">
									<div class="form-group col-md-6">
										<label style="color: #696969">Unique ID</label>
										<h4 style="color: black">${sessionScope.userID}</h4>
									</div>								

									<div class="form-group col-md-6">
										<label style="color: #696969">Name</label>
										<h4 style="color: black">${sessionScope.userName}</h4>
									</div>
									
									<div class="form-group col-md-6">
										<label style="color: #696969">Email Address</label>
										<h4 style="color: black">${sessionScope.userEmail}</h4>
									</div>
									
									<div class="form-group col-md-6">
										<label style="color: #696969">Phone Number</label>
										<h4 style="color: black">${sessionScope.userPhone}</h4>
									</div>
								</div>
							</div>
						</div>						
						<br>
						<!-- Change Password -->
						<form action="http://localhost:8080/Project/changePw" method="post">
						<div class="form-submit">
							<table>
								<tbody>
									<tr>
										<th style="font-size:20px;font-weight:400px"><i></i>Change Password</th>
										<th></th>
									</tr>
								</tbody>
							</table>
							<br>
							<div class="submit-section">
								<div class="row">								

									<div class="form-group col-md-6">
										<label>New Password</label>
										<input type="password" class="form-control" id="npw" name="NewPw" onkeyup="check()">
										<span id="alert"></span>
									</div>

									<div class="form-group col-md-6">
										<label>Confirm password</label>
										<input type="password" class="form-control" id="renpw" name="repeatNPw" onkeyup="check()">
										
									</div>

									<div class="form-group col-lg-12 col-md-12">
										<button type="submit" id="change" style="background: #800000; color: white; border: none;">
											Save Changes
										</button>
									</div>

								</div>
							</div>
						</div>
						</form>

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