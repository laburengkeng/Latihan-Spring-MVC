<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Input Pegawai</title>
<style>
	.error{
		color:red;font-weight:bold; 
	}
</style>

</head>

<body>
<form:form commandName="pegawaiForm">
	
	<table>
    <tr>
        <td>Name</td>
        <td><form:input path="nama" size="30"/></td>
         <td><form:errors path="nama" cssClass="error" /></td> 
    </tr>
    <tr>
        <td><form:label path="gaji">Gaji</form:label></td>
        <td><form:input path="gaji" /></td>
    	<td><form:errors path="gaji" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
	</table>  
		
	</form:form>	

</body>
</html>