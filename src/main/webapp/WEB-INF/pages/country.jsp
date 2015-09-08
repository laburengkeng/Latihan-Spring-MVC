<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>

	<form:form  commandName="costumerForm" method="POST" action="hasil">
		<table>
				<tr>
					<td>
					<form:select path="country" >
           			 <form:options items="${countryList}" />
        			</form:select>
        			
        			</td>
				</tr>
				<tr>
					<td> <input type="submit" value="kirim"> </td>
				</tr>
		</table>
	</form:form>
	
</body>
</html>