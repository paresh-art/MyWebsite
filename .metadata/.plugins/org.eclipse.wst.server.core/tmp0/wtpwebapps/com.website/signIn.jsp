<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Sign in Page</title>
</head>
<body>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
 %>
	<div class="container mt-5 border border-dark">
		<h1 class="mx-auto text-center">Sign in</h1>
		<form action="signin" class="mt-4" method="post">
			<div class="row">
				<div class="col-lg-6 col-md-8 col-sm-12 mx-auto text-light">
					<input type="text" class="form-control" placeholder="Email address"
						name="email">
				</div>
			</div>

			<div class="row mt-2">
				<div class="col-lg-6 col-md-8 col-sm-12 mx-auto text-light">
					<input type="password" class="form-control" placeholder="password"
						name="password">
				</div>
			</div>
			<br>
			<div class="row mb-3">
				<div class="col-lg-6 col-md-8 col-sm-12 mx-auto text-light">
					<button class="btn btn-primary " type="submit">Sign in</button>
					<a href="signup.jsp" class="btn btn-link offset-7 text-dark">Register new user</a>
				</div>

			</div>
		</form>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->



</body>
</html>