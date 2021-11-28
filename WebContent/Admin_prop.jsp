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
		action="http://localhost:8080/Project/propertyList" method="get">
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">List of Properties</div>
						<div id="box_center">
							<input type="text" name="city" value="${param.city}"
								placeholder="Enter City or Zip"> <label
								style="color: gray;">&nbsp;Min Price</label> <select
								name="searchMin">
								<option>${param.searchMin}</option>
								<option>100</option>
								<option>500</option>
								<option>1000</option>
								<option>1500</option>
							</select> <label style="color: gray;">&nbsp;Max Price</label> <select
								name="searchMax">
								<option>${param.searchMax}</option>
								<option>500</option>
								<option>1000</option>
								<option>1500</option>
								<option>2000</option>
							</select> <label style="color: gray;">&nbsp;Bedroom</label> <select
								name="searchBed">
								<option>${param.searchBed}</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select> <label style="color: gray;">&nbsp;Bathroom</label> <select
								name="searchBath">
								<option>${param.searchBath}</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select> <label style="color: gray;">&nbsp;Sort By</label> <select
								name="searchStatus">
								<option>${param.searchStatus}</option>
								<option value="Rent">For Rent</option>
								<option value="Sale">For Sale</option>
							</select>

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
							<th>Status</th>
							<th>Bed</th>
							<th>Bath</th>
							<th>Price</th>
							<th>Address</th>
							<th>Contact</th>
							<th>Operation</th>
						</tr>

						<c:forEach var="property" items="${propertyList}">
							<tr>
								<td>${property.ID}</td>
								<td>${property.name}</td>
								<td>${property.status}</td>
								<td>${property.bedroom}</td>
								<td>${property.bathroom}</td>
								<td>${property.price}</td>
								<td>${property.address}</td>
								<td>${property.ownerEmail}</td>
								<td><a href="Admin_propertyEdit.jsp" class="edit">Edit</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						Totally ${totalProperty}
						Properties&nbsp;&nbsp;&nbsp;&nbsp;Currently
						${currentPage}/${totalPage}&nbsp;&nbsp;&nbsp;&nbsp;</div>
					<div class="ui_frt">
						<a style="color: black; font-weight: bold"
							href="propertyList?currentPage=${currentPage-1<1?1:currentPage-1}${searchPara}"><i>Previous</i></a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
							style="color: black; font-weight: bold"
							href="propertyList?currentPage=${currentPage+1>totalPage?totalPage:currentPage+1}${searchPara}"><i>Next</i></a>
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