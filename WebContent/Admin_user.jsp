<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System Management</title>
<!-- CSS -->
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/account-style.css">
<link rel="stylesheet" href="css/themify-icons.css">

<script type="text/javascript">
	// Logout
	function logout() {
		if (confirm("Are you sure to log out?")) {
			window.location.href = "Admin_login.jsp";
		}
	}

	// current date
	function getDate01() {
		var time = new Date();
		var myYear = time.getFullYear();
		var myMonth = time.getMonth() + 1;
		var myDay = time.getDate();
		if (myMonth < 10) {
			myMonth = "0" + myMonth;
		}
		document.getElementById("day").innerHTML = myYear + "." + myMonth + "."
				+ myDay;
	}
</script>
</head>
<body onload="getDate01()">
	<div id="top">
		<div id="top_logo">
			<img alt="logo" src="images/logo.png" width="274" height="49"
				style="vertical-align: middle;">
		</div>
		<div id="top_links">
			<div id="top_op">
				<ul>
					<li><i class="ti-user"></i> <span>admin</span></li>

					<li><i class="ti-timer"></i> <span id="day"></span></li>
				</ul>
			</div>
			<div id="top_close" style="right: 15px">
				<a href="javascript:void(0);" onclick="logout();" target="_parent">
					<i class="ti-power-off">&nbsp;Logout</i>
				</a>
			</div>
		</div>
	</div>
	<!-- side menu -->
	<div id="side">
		<div id="left_menu">
			<ul id="TabPage2" style="height: 200px; margin-top: 50px;">
				<li id="left_tab1" class="selected" title="Data"><a href="Admin_index.jsp"><i class="ti-server"></i></a></li>
				<li id="left_tab2" title="Advertisement"><a href="Admin_advertisement.jsp" style="text-decoration:none;color:black"><i class="ti-check-box"></i></a></li>
			</ul>
		</div>
		<div id="left_menu_cnt">
			<div id="nav_module">
				<img src="images/top.png" width="210" height="50" />
			</div>
			<div id="nav_resource">
				<a href="Admin_user.jsp" style="text-decoration:none;color:black;position:absolute;left:30px;top:70px"><i>User Information</i></a>
				<a href="Admin_property.jsp" style="text-decoration:none;color:black;position:absolute;left:30px;top:120px"><i>Property Information</i></a>
			</div>
		</div>
	</div>
	
	<div id="top_nav">
	 	<span id="here_area">Currently: Data&nbsp;>&nbsp;User Information</span>
	</div>
	
    <div id="main">
      	<iframe name="right" id="rightMain" src="userList" style="frameborder:no;scrolling:auto;width:100%;height:100%;allowtransparency:true">
      	</iframe>
    </div>

	<!-- JS -->
	<script src="js/jquery-1.7.1.js"></script>
	<script src="js/commonAll.js"></script>
</body>
</html>
