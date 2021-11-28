<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Search</title>
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
	<div class="header-area">
		<div class="main-header">
			<div class="header-bottom">
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-xxl-8 col-xl-10 col-lg-11">
							<!-- form -->
							<form action="/Project/viewProperty" class="search-box" method="get">
								<div class="input-form">
									<input type="text" name="city" value="${param.city}" placeholder="City or Zip">
									<!-- icon -->
									<div class="icon">
										<i class="ti-search"></i>
									</div>
								</div> 
								<div class="select-form">
									<div class="select-items">
										<label style="color:gray;">&nbsp;Min Price</label> <select name="searchMin">
											<option>${param.searchMin}</option>
											<option>100</option>
											<option>500</option>
											<option>1000</option>
											<option>1500</option>
										</select>
									</div>
								</div>
								
								<div class="select-form">
									<div class="select-items">
										<label style="color:gray;">&nbsp;Max Price</label> <select name="searchMax">
											<option>${param.searchMax}</option>
											<option>500</option>
											<option>1000</option>
											<option>1500</option>
											<option>2000</option>
										</select>
									</div>
								</div>

								<div class="select-form">
									<div class="select-items">
										<label style="color:gray;">&nbsp;Bedroom</label> <select name="searchBed">
											<option>${param.searchBed}</option>
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
										</select>
									</div>
								</div>

								<div class="select-form">
									<div class="select-items">
										<label style="color:gray;">&nbsp;Bathroom</label> <select name="searchBath">
											<option>${param.searchBath}</option>
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
										</select>
									</div>
								</div>
								
								<div class="select-form">
									<div class="select-items">
										<label style="color:gray;">&nbsp;Sort By</label> <select name="searchStatus">
											<option>${param.searchStatus}</option>
											<option value="Rent">For Rent</option>
											<option value="Sale">For Sale</option>
										</select>
									</div>
								</div>
								
								<div class="search-form">
									<button type="submit" name="submit">Search</button>
								</div>
							</form>
							<!-- End Form -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- JS here -->
	<script src="js/modernizr-3.5.0.min.js"></script>
	<script src="js/jquery-1.12.4.min.js"></script>
	<script src="js/popper.min.js"></script>
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
	<script src="js/bootstrap.min.js"></script>

</body>
</html>