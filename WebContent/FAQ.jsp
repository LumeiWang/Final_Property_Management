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
<title>FAQs</title>

<!-- CSS here -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/colors.css">
<link rel="stylesheet" href="css/style.css">
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


	<!-- content begin -->
	<!-- Subheader -->
	<div class="subheader section-padding">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="breadcrumb-wrapper">
						<div class="page-title">
							<h1 class="text-theme fw-500">FAQs</h1>
						</div>
						<ul class="custom breadcrumb">
							<li><a href="index.jsp">Back To Homepage</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Start Faqs -->
	<section class="section-padding">
		<div class="container">
			<div class="section-header">
				<div class="section-heading">
					<h4 class="text-custom-blue">How can we help you?</h4>
					<h6 style="color:#808080">Find your queries below. If you have more questions, contact us without hesitation!</h6>
				</div>
			</div>
			<br>
			<section class="bg-light">
				<div class="container">
					<div class="row">
						<div class="col-lg-10 col-md-12 col-sm-12">
							<div class="block-header">
								<ul class="nav nav-tabs customize-tab" id="myTab" role="tablist">
									<li class="nav-item" style="color:black;background:grey"><a class="nav-link active"
										id="general-tab" data-bs-toggle="tab" href="#general"
										role="tab" aria-controls="general" aria-selected="true">General</a>
									</li>

									<li class="nav-item" style="color:black;background:grey"><a class="nav-link" id="payment-tab"
										data-bs-toggle="tab" href="#payment" role="tab"
										aria-controls="payment" aria-selected="false">Payment</a></li>

									<li class="nav-item" style="color:black;background:grey"><a class="nav-link" id="upgrade-tab"
										data-bs-toggle="tab" href="#upgrade" role="tab"
										aria-controls="upgrade" aria-selected="false">Upgrade</a></li>
								</ul>
							</div>
							<div class="tab-content" id="myTabContent">
								<!-- general Query -->
								<div class="tab-pane fade show active" id="general"
									role="tabpanel" aria-labelledby="general-tab">
									<div class="accordion" id="generalac">

										<div class="card">
											<div class="card-header" id="headingOne">
												<h2 class="mb-0">
													<button class="btn btn-link" type="button"
														data-bs-toggle="collapse" data-bs-target="#collapseOne"
														aria-expanded="true" aria-controls="collapseOne">
														How To Install Rikada Theme?</button>
												</h2>
											</div>
											<div id="collapseOne" class="collapse show"
												aria-labelledby="headingOne" data-bs-parent="#generalac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>

										<div class="card">
											<div class="card-header" id="headingTwo">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse" data-bs-target="#collapseTwo"
														aria-expanded="false" aria-controls="collapseTwo">
														What is main Requirements For Rikada?</button>
												</h2>
											</div>
											<div id="collapseTwo" class="collapse"
												aria-labelledby="headingTwo" data-bs-parent="#generalac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>

										<div class="card">
											<div class="card-header" id="headingThree">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse" data-bs-target="#collapseThree"
														aria-expanded="false" aria-controls="collapseThree">
														Why Choose Rikada Theme?</button>
												</h2>
											</div>
											<div id="collapseThree" class="collapse"
												aria-labelledby="headingThree" data-bs-parent="#generalac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- general Query -->
								<div class="tab-pane fade" id="payment" role="tabpanel"
									aria-labelledby="payment-tab">

									<div class="accordion" id="paymentac">
										<div class="card">
											<div class="card-header" id="headingOne1">
												<h2 class="mb-0">
													<button class="btn btn-link" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#paymentcollapse" aria-expanded="true"
														aria-controls="paymentcollapse">May I Request For
														Refund?</button>
												</h2>
											</div>

											<div id="paymentcollapse" class="collapse show"
												aria-labelledby="headingOne1" data-bs-parent="#paymentac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-header" id="headingTwo1">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#paymentcollapseTwo" aria-expanded="false"
														aria-controls="paymentcollapseTwo">May I Get Any
														Offer in Future?</button>
												</h2>
											</div>
											<div id="paymentcollapseTwo" class="collapse"
												aria-labelledby="headingTwo1" data-bs-parent="#paymentac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-header" id="headingThree1">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#paymentcollapseThree"
														aria-expanded="false" aria-controls="paymentcollapseThree">
														How Much Time It will Take For refund?</button>
												</h2>
											</div>
											<div id="paymentcollapseThree" class="collapse"
												aria-labelledby="headingThree1" data-bs-parent="#paymentac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
									</div>

								</div>

								<!-- general Query -->
								<div class="tab-pane fade" id="upgrade" role="tabpanel"
									aria-labelledby="upgrade-tab">

									<div class="accordion" id="upgradeac">
										<div class="card">
											<div class="card-header" id="headingOne2">
												<h2 class="mb-0">
													<button class="btn btn-link" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#upgradecollapseOne" aria-expanded="true"
														aria-controls="upgradecollapseOne">How To Upgrade
														Rikada Theme?</button>
												</h2>
											</div>

											<div id="upgradecollapseOne" class="collapse show"
												aria-labelledby="headingOne2" data-bs-parent="#upgradeac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-header" id="headingTwo2">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#upgradecollapseTwo" aria-expanded="false"
														aria-controls="upgradecollapseTwo">Rikada
														available for WordPress Version?</button>
												</h2>
											</div>
											<div id="upgradecollapseTwo" class="collapse"
												aria-labelledby="headingTwo2" data-bs-parent="#upgradeac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-header" id="headingThree2">
												<h2 class="mb-0">
													<button class="btn btn-link collapsed" type="button"
														data-bs-toggle="collapse"
														data-bs-target="#upgradecollapseThree"
														aria-expanded="false" aria-controls="upgradecollapseThree">
														Why We need to upgrade Rikada?</button>
												</h2>
											</div>
											<div id="upgradecollapseThree" class="collapse"
												aria-labelledby="headingThree2" data-bs-parent="#upgradeac">
												<div class="card-body">
													<p class="ac-para">Anim pariatur cliche reprehenderit,
														enim eiusmod high life accusamus terry richardson ad
														squid. 3 wolf moon officia aute, non cupidatat skateboard
														dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
														Brunch 3 wolf moon tempor, sunt aliqua put a bird on it
														squid single-origin coffee nulla assumenda shoreditch et.
														Nihil anim keffiyeh helvetica, craft beer labore wes
														anderson cred nesciunt sapiente ea proident. Ad vegan
														excepteur butcher vice lomo. Leggings occaecat craft beer
														farm-to-table, raw denim aesthetic synth nesciunt you
														probably haven't heard of them accusamus labore
														sustainable VHS.</p>
												</div>
											</div>
										</div>
									</div>

								</div>

							</div>

						</div>

					</div>
				</div>
			</section>
		</div>
	</section>
	<br>
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