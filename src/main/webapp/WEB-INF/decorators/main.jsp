<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--
	Iridium by TEMPLATED
    templated.co @templatedco
    Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title><decorator:title></decorator:title></title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href='http://fonts.googleapis.com/css?family=Arimo:400,700' rel='stylesheet' type='text/css'>
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/template/iridium/js/skel.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/template/iridium/js/skel-panels.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/template/iridium/js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/template/iridium/css/skel-noscript.css" />
			<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/template/iridium/css/style.css" />
			<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/template/iridium/css/style-desktop.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
		
		<!-- Date picker -->
			<link type="text/css" href="<%=request.getContextPath()%>/resources/css2/jquery-ui.css"  
											rel="stylesheet" />	
			<script type="text/javascript" src="<%=request.getContextPath()%>/resources/css2/jquery-ui.js" >
			</script>
			
			
			<style>
				.error{
					color:red;font-weight:bold; 
				}
			</style>
		<!-- end datepicker -->
		
	</head>
	<body>

		<!-- Header -->
		<div id="header">
			<div class="container"> 
				
				<!-- Logo -->
				<div id="logo">
					<h1><a href="#">Aplikasi</a></h1>
					<span>Design by TEMPLATED</span>
				</div>
				
				<!-- Nav -->
				<nav id="nav">
					<ul>
						<li class="active"><a href="/">Home</a></li>
						<li><a href="#">Logout</a></li>
					</ul>
				</nav>
			</div>
		</div>

		<!-- Main -->
		<div id="main">
			<div class="container">
				<div class="row"> 

					<!-- Sidebar -->
					<div id="sidebar" class="4u">
						<section>
							<header>
								<h2>Menu</h2>
							</header>
							<ul class="style">
								<li><a href="/form">Input Data</a></li>
								<li><a href="/list">Daftar Pegawai</a></li>
								<li><a href="/pengajuan">Input Pengajuan</a></li>
							</ul>
						</section>
					</div>
					
					<!-- Content -->
					<div id="content" class="8u skel-cell-important">
						<section>
						
							<decorator:body></decorator:body>
							
						</section>
					</div>
					
				</div>
			</div>
		</div>
		
	
		<!-- Footer -->
		<div id="featured">
			<div class="container">
				<div class="row">
					<div class="4u">
						<h2>Aenean elementum facilisis</h2>
						<a href="#" class="image full"><img src="<%=request.getContextPath()%>/resources/template/iridium/images/pic01.jpg" alt="" /></a>
						<p>Nullam non wisi a sem semper eleifend. Donec mattis libero eget urna. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra vulputate enim.</p>
						<p><a href="#" class="button">More Details</a></p>
					</div>
					<div class="4u">
						<h2>Fusce ultrices fringilla</h2>
						<a href="#" class="image full"><img src="<%=request.getContextPath()%>/resources/template/iridium/images/pic02.jpg" alt="" /></a>
						<p>Nullam non wisi a sem semper eleifend. Donec mattis libero eget urna. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra vulputate enim.</p>
						<p><a href="#" class="button">More Details</a></p>
					</div>
					<div class="4u">
						<h2>Etiam rhoncus volutpat erat</h2>
						<a href="#" class="image full"><img src="<%=request.getContextPath()%>/resources/template/iridium/images/pic03.jpg" alt="" /></a>
						<p>Nullam non wisi a sem semper eleifend. Donec mattis libero eget urna. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra vulputate enim.</p>
						<p><a href="#" class="button">More Details</a></p>
					</div>
				</div>
			</div>
		</div>


		<!-- Footer -->
		<div id="footer">
			<div class="container">
				<div class="row">
					<div class="4u">
						<section>
							<h2>Latest Posts</h2>
							<ul class="default">
								<li><a href="#">Pellentesque lectus gravida blandit</a></li>
								<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
								<li><a href="#">Phasellus nibh pellentesque congue</a></li>
								<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
								<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
							</ul>
						</section>
					</div>
					<div class="4u">
						<section>
							<h2>Ultrices fringilla</h2>
							<ul class="default">
								<li><a href="#">Pellentesque lectus gravida blandit</a></li>
								<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
								<li><a href="#">Phasellus nibh pellentesque congue</a></li>
								<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
								<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
							</ul>
						</section>
					</div>
					<div class="4u">
						<section>
							<h2>Aenean elementum</h2>
							<ul class="default">
								<li><a href="#">Pellentesque lectus gravida blandit</a></li>
								<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
								<li><a href="#">Phasellus nibh pellentesque congue</a></li>
								<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
								<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
							</ul>
						</section>
					</div>
				</div>
			</div>
		</div>

		<!-- Copyright -->
		<div id="copyright">
			<div class="container">
				Design: <a href="http://templated.co">TEMPLATED</a> Images: <a href="http://unsplash.com">Unsplash</a> (<a href="http://unsplash.com/cc0">CC0</a>)
			</div>
		</div>
		
	</body>
</html>