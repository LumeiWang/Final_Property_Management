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

<!-- CSS -->
<link rel="stylesheet" href="css/basic_layout.css">
<link rel="stylesheet" href="css/common_style.css">
<link rel="stylesheet" href="css/jquery.fancybox-1.3.4.css" media="screen"></link>

</head>
<body>
	<form id="submitForm" name="submitForm"
		action="http://localhost:8080/Project/userList" method="get">
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">List of Users</div>
						<div id="box_center">
							<input type="text" name="email" value="${param.email}"
								placeholder="Enter email address">

							<button type="submit" name="submit">Search</button>
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table"
						style="cellspacing: 0; cellpadding: 0; width: 100%; align: center; border: 0">
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Email</th>
							<th>Phone</th>
							<th>Property ID</th>
						</tr>

						<c:forEach var="user" items="${userList}">
							<tr>
								<td>${user.ID}</td>
								<td>${user.name}</td>
								<td>${user.email}</td>
								<td>${user.phone}</td>
								<td>${user.propertyID}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						Totally ${totalUser} Users&nbsp;&nbsp;&nbsp;&nbsp;Currently
						${currentPage}/${totalPage}&nbsp;&nbsp;&nbsp;&nbsp;</div>
					<div class="ui_frt">
						<a style="color: black; font-weight: bold"
							href="userList?currentPage=${currentPage-1<1?1:currentPage-1}${searchPara}"><i>Previous</i></a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
							style="color: black; font-weight: bold"
							href="userList?currentPage=${currentPage+1>totalPage?totalPage:currentPage+1}${searchPara}"><i>Next</i></a>
					</div>
				</div>
			</div>
		</div>
	</form>
	
	<!-- JS -->
	<script src="scripts/jquery/jquery-1.7.1.js"></script>
	<script src="scripts/authority/commonAll.js"></script>
	<script src="scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
	<script src="scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>

</body>
</html>