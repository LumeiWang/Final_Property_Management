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
<title>Submit Your Property</title>
<!-- CSS here -->
<link rel="stylesheet" href="css/property-style.css">
<link rel="stylesheet" href="css/colors.css">
<script type="text/javascript">
	function disable() {
		document.getElementById("submit").disabled = true;
		document.getElementById("alert").innerHTML = "<br><font color='red'>Please consent the agreement to submit the property.</font>";
	}
	function enable() {
		document.getElementById("submit").disabled = false;
		document.getElementById("alert").innerHTML = "<br><font></font>";
	}
</script>
</head>
<body>
	<!-- header -->
	<%@include file="Header.jsp"%>
	<form action="http://localhost:8080/Project/addProperty" method="get">
		<!-- Subheader -->
		<div class="subheader section-padding">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<div class="breadcrumb-wrapper">
							<div class="page-title">
								<h1 class="text-theme fw-500">Submit New Property</h1>
							</div>
							<ul class="custom breadcrumb">
								<li><a href="Account.jsp">Back To My Account</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<br><br><br><br>

		<!--  Submit Property -->
		<section class="gray-simple">
			<div class="container">
				<div class="row">
					<!-- Submit Form -->
					<div class="col-lg-12 col-md-12">
						<div class="submit-page">
							<!-- Basic Information -->
							<div class="form-submit">
								<h3 style="color: black;">Basic Information *</h3>
								<div class="submit-section">
									<div class="row">
										<div class="form-group col-md-12">
											<label>Property Name (a unique name making your
												property more impressive)</label> <input type="text"
												class="form-control" name="propertyName">
										</div>

										<div class="form-group col-md-6">
											<label>Status</label> <select name="propertyStatus"
												class="form-control">
												<option>&nbsp;</option>
												<option value="Rent">For Rent</option>
												<option value="Sale">For Sale</option>
											</select>
										</div>

										<div class="form-group col-md-6">
											<label>Price (per month or full price)</label> <input type="text"
												class="form-control" placeholder="GBP" name="propertyPrice">
										</div>

										<div class="form-group col-md-6">
											<label>Bedroom</label> <select id="bedroom"
												class="form-control" name="propertyBedroom">
												<option value="">&nbsp;</option>
												<option value="1">1</option>
												<option value="2">2</option>
												<option value="3">3</option>
												<option value="4">4</option>
												<option value="5">5</option>
												<option value="5">6</option>
											</select>
										</div>

										<div class="form-group col-md-6">
											<label>Bathroom</label> <select id="bathroom"
												class="form-control" name="propertyBathroom">
												<option value="">&nbsp;</option>
												<option value="1">1</option>
												<option value="2">2</option>
												<option value="3">3</option>
												<option value="4">4</option>
												<option value="5">5</option>
												<option value="5">6</option>
											</select>
										</div>

									</div>
								</div>
							</div>

							<!-- Gallery -->
							<div class="form-submit">
								<h3 style="color: black;">Gallery</h3>
								<div class="submit-section">
									<div class="row">
										<div class="form-group col-md-12">
											<label>Upload Gallery</label>
											<form action="/upload-target"
												class="dropzone dz-clickable primary-dropzone">
												<div class="dz-default dz-message">
													<i class="ti-gallery"></i> <span>Drag & Drop To
														Change Logo</span>
												</div>
											</form>
										</div>

									</div>
								</div>
							</div>

							<!-- Location -->
							<div class="form-submit">
								<h3 style="color: black;">Location *</h3>
								<div class="submit-section">
									<div class="row">

										<div class="form-group col-md-6">
											<label>City</label> <input type="text" class="form-control"
												name="propertyCity">
										</div>

										<div class="form-group col-md-6">
											<label>Zip Code</label> <input type="text"
												class="form-control" name="propertyZip">
										</div>

										<div class="form-group col-md-6">
											<label>Address</label> <input type="text"
												class="form-control" name="propertyAddress">
										</div>

									</div>
								</div>
							</div>

							<!-- Detailed Information -->
							<div class="form-submit">
								<h3 style="color: black;">Detailed Information</h3>
								<div class="submit-section">
									<div class="row">

										<div class="form-group col-md-12">
											<label>Description *</label>
											<textarea class="form-control h-120"
												name="propertyDescription"></textarea>
										</div>

										<div class="form-group col-md-12">
											<label>Other Features</label>
											<div class="o-features">
												<ul class="no-ul-list third-row">
													<li><input id="a-1" class="checkbox-custom" name="a-1"
														type="checkbox"> <label for="a-1"
														class="checkbox-custom-label">Air Condition</label></li>
													<li><input id="a-3" class="checkbox-custom" name="a-3"
														type="checkbox"> <label for="a-3"
														class="checkbox-custom-label">Heating</label></li>
													<li><input id="a-4" class="checkbox-custom" name="a-4"
														type="checkbox"> <label for="a-4"
														class="checkbox-custom-label">Refrigerator</label></li>
													<li><input id="a-5" class="checkbox-custom" name="a-5"
														type="checkbox"> <label for="a-5"
														class="checkbox-custom-label">Microwave</label></li>
													<li><input id="a-6" class="checkbox-custom" name="a-6"
														type="checkbox"> <label for="a-6"
														class="checkbox-custom-label">Smoking Allow</label></li>
													<li><input id="a-8" class="checkbox-custom" name="a-8"
														type="checkbox"> <label for="a-8"
														class="checkbox-custom-label">Balcony</label></li>
													<li><input id="a-10" class="checkbox-custom"
														name="a-10" type="checkbox"> <label for="a-10"
														class="checkbox-custom-label">Wi-Fi</label></li>
													<li><input id="a-12" class="checkbox-custom"
														name="a-12" type="checkbox"> <label for="a-12"
														class="checkbox-custom-label">Parking</label></li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Contact Information -->
							<div class="form-submit">
								<h3 style="color: black;">Contact Information</h3>
								<div class="submit-section">
									<div class="row">

										<div class="form-group col-md-4">
											<label>Name *</label> <input type="text" class="form-control" name="ownerName">
										</div>

										<div class="form-group col-md-4">
											<label>Email *</label> <input type="text"
												class="form-control" name="ownerEmail">
										</div>
									</div>
								</div>
							</div>

							<div class="form-group col-lg-12 col-md-12">
								<label>Sign Agreement *</label>
								<ul class="no-ul-list">
									<li><input id="aj-1" class="checkbox-custom"
										type="checkbox" name="aj-1" id="consent"
										onclick="if (this.checked) {enable()} else {disable()}">
										<label for="aj-1" class="checkbox-custom-label"> I
											consent that Property Manager stores my submitted information
											for further contact. </label> <span id="alert"></span></li>
								</ul>
							</div>

							<div class="form-group col-lg-12 col-md-12">
								<input id="submit" name="submit" disabled="disabled"
									type="submit"
									style="background: #800000; color: white; border: none;"
									value="Preview & Submit">
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>

	<!-- JS here -->
	<script src="js/jquery.min.js"></script>
	<script src="js/rangeslider.js"></script>
	<script src="js/select2.min.js"></script>
	<script src="js/slick.js"></script>
	<script src="js/slider-bg.js"></script>
	<script src="js/lightbox.js"></script>
	<script src="js/imagesloaded.js"></script>

</body>
</html>