<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS -->
<link rel="stylesheet" href="css/basic_layout.css">
<link rel="stylesheet" href="css/common_style.css">
<link rel="stylesheet" href="css/themify-icons.css">
</head>
<body>
<form id="submitForm" name="submitForm" action="http://localhost:8080/Project/editProperty" method="post">
	<input type="hidden" name="fyID" value="14458625716623" id="fyID"/>
	<div id="container">
		<div id="nav_links">
			<span>Currently: Data&nbsp;>&nbsp;Property Information&nbsp;>&nbsp;Edit Property</span>
		</div>
		<div class="ui_content">
			<table  style="cellspacing:0;cellpadding:0;width:100%;align:left;border:0">
				<tr>
					<td class="ui_text_rt">Property ID</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyID" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Property Name</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyName" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt" width="80">Property Status</td>
					<td class="ui_text_lt">
						<select name="propertyStatus"class="ui_select01">
                            <option></option>
                            <option value="Rent">For Rent</option>
                            <option value="Sale">For Sale</option>
                        </select>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Price (per month or full price)</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyPrice" placeholder="£" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt" width="80">Bedroom</td>
					<td class="ui_text_lt">
						<select name="propertyBedroom"class="ui_select01">
                            <option></option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                        </select>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt" width="80">Bathroom</td>
					<td class="ui_text_lt">
						<select name="propertyBathroom"class="ui_select01">
                            <option></option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                        </select>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">City</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyCity" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Zip Code</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyZip" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Address</td>
					<td class="ui_text_lt">
						<input type="text" name="propertyAddress" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Description</td>
					<td class="ui_text_lt">
						<textarea name="propertyDescription" class="ui_input_txt03"></textarea>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Contact Name</td>
					<td class="ui_text_lt">
						<input type="text" name="ownerName" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">Contact Email</td>
					<td class="ui_text_lt">
						<input type="text" name="ownerEmail" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<button id="submitbutton" type="submit" class="ui_input_btn01">Submit</button>
						&nbsp;<a href="propertyList" id="cancelbutton" type="button" class="ui_input_btn01">Cancel</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
	
	
	<!-- JS -->
	<script src="js/jquery-1.7.1.js"></script>
	<script src="js/commonAll.js"></script>
	<script src="js/jquery-1.4.4.min.js"></script>
	<script src="js/WdatePicker.js" defer="defer"></script>

</body>
</html>