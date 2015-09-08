<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>
<h1>Daftar Pegawai</h1>
<form method="get">
	Nama <input type="text" name="nama"/> <input type="submit"  value="cari" />
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nama</th>
				<th>Gaji</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach var="p" items="${pegawaiList}">
			<tr>
				<td><c:out value="${p.id}"></c:out> </td>
				<td><c:out value="${p.nama }"></c:out></td>
				<td><c:out value="${p.gaji }"></c:out></td>
				<td>
					<a href="form?id=${p.id }">Edit</a>
					<a href="delete?id=${p.id }">Hapus</a>
				</td>
			</tr> 
		 </c:forEach>
		</tbody>
		
	</table>
	
	
</form>
</body>
</html>