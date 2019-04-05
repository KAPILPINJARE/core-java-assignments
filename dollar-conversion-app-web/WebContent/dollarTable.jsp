<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Dollar Converter</h2>
	<table>
		<thead>
			<tr>
				<th>Dollar</th>
				<th>Rupees</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" begin="1" end="50" step="1">
				<tr>
					<td>${i}</td>
					<td>${i*value}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>