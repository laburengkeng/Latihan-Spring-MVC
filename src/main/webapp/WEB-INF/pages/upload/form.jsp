<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload File</title>
</head>
<body>
<h1>Form Upload</h1>
	
	<form method="post" enctype="multipart/form-data">
		<table border="0">
			<tr>
				<td>Pilih File</td>
				<td><input type="file" name="fileUpload" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Upload" /></td>
			</tr>
		</table>
	</form>
</body>
</html>