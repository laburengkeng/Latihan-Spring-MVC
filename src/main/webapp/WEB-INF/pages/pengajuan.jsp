<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pengajuan Pinjaman</title>

<link type="text/css" href='<c:url value="/resources/css2/jquery-ui.css" />' 
								rel="stylesheet" />	
<script type="text/javascript" src="<c:url value="/resources/css2/external/jquery/jquery.js" />" >
</script>
<script type="text/javascript" src="<c:url value="/resources/css2/jquery-ui.js" />" >
</script>

<script type="text/javascript">
	$(function(){

		// Datepicker
		$('input[name=waktu_pengajuan]').datepicker({
			dateFormat: "yy-mm-dd"
		});
		
	});
</script>
<style>
	.error{
		color:red;font-weight:bold; 
	}
</style>

</head>
<body>

	<h1>Form Pengajuan Pinjaman</h1>

	<form:form modelAttribute="pengajuanForm">
		<table>
			<tr>
				<td>Pegawai</td>
				<td><form:select path="pemohon" >
           			 <form:options items="${pegawaiList}" 
           			 	itemValue="id" itemLabel="nama"/>
        			</form:select>
        			
        		</td>
        		<td><form:errors path="pemohon" cssClass="error"></form:errors> </td>
			</tr>
			<tr>
				<td>Tanggal Pengajuan</td>
				<td><form:input path="waktu_pengajuan"/></td>
				<td><form:errors path="waktu_pengajuan" cssClass="error"></form:errors> </td>
			</tr>
			<tr>
				<td>Nilai Pengajuan</td>
				<td><form:input path="nilai"/></td>
				<td><form:errors path="nilai" cssClass="error"></form:errors> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="simpan" /></td>
			</tr>
		</table>
	</form:form>	

</body>
</html>