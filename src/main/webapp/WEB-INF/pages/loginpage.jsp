<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN FORM</title>
</head>
<body>
	<h1>LOGIN BRO</h1>
	
	<c:if test="${'fail' eq param.auth}">
        <div style="color:red">
                Login Failed!!!<br />
                Reason : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
         </div>
    </c:if>
	
	<form action="<%=request.getContextPath()%>/login" method="post">
	 
	<table>
		<tr>
			<td>Username</td>
			<td>&nbsp;:&nbsp;</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td>&nbsp;:&nbsp;</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td><input type="submit" name="submit" value="Masuk" /></td>
		</tr>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		
	</table>
	</form>
</body>
</html>