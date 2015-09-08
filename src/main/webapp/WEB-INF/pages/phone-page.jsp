<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Phone Page</title>
</head>
<body>
	
		<form:form method="POST" commandName="smartphone" action="phone-result">
			<table>
				<tr>
					<td><form:select path="phone" items="${phonesMap}"></form:select>
				</tr>
				<tr>
					<td> <input type="submit" value="kirim"> </td>
				</tr>
			</table>
		</form:form>
		
</body>
</html>