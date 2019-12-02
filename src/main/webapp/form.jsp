<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Product Entry</title>
</head>
<body>

	<form:form id="loginForm" modelAttribute="mv1" action="confirm"
		method="post">
		
		<table align="center">
			<tr>
				<td><form:label path="name">Name: </form:label></td>
				<td><form:input path="name" name="name" id="name" />
				</td>
			</tr>
			<tr>
				<td><form:label path="product">Product : </form:label></td>
				<td><form:input path="product" name="product"
						id="product" /></td>
			</tr>
			<tr>
				<td><form:label path="capacity">Capacity :</form:label></td>
				<td><form:input path="capacity" name="capacity"
						id="capacity" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="save">Save</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>
