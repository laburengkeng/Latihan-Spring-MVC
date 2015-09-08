<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form:form commandName="pegawaiForm" action="/tesspringweb/addpegawai">
   <table>
    <tr>
        <td><form:label path="nama">Name</form:label></td>
        <td><form:input path="nama" /></td>
    </tr>
    <tr>
        <td><form:label path="gaji">Gaji</form:label></td>
        <td><form:input path="gaji" /></td>
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