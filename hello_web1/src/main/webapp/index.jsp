<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		box-sizing: border-box;
		margin :0;
		pause: 0;
	}
	
	body{
		font-family: Arial, sans-serif;
	}
	header{
		background-color:  #555;
		color: white;
		font-size: 30px;
		padding: 30px;
		text-align: center;	
	}
	
	section{
		display: flex;
	}
	
	nav{
		flex: 1;
		background-color: #ffe0b2ff;
		padding: 20px;
	}
	
	nav ul{
		list-style: none;
		padding: 0;
	}
	
	article{
		flex: 3;
		padding: 20px;
	}
	footer {
		background-color: #555;
		color: white;
		padding: 30px;
		text-align: center;
	}
	article{
		background-color: #ccc;
	}
	
	
	
	a:link {
	color: black;
	text-decoration: none;
	
}
a:visited {
	color: black;
	text-decoration: none;
	
}
a:hover {
	color: black;
	text-decoration: underline;
}
	
	
</style>
</head>
<body>
	<header>
		<h2>First JSP Web</h2>
	</header>

	<section>
		<nav>
			<ul>
				<li>홈</li>
				<li>구독화면</li>
				<li>추천화면</li>
			</ul>
		</nav>
		<article>
			<p>Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's s tandard
				dummy text ever since the 1500s, when an unknown print er took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged. It was popularised in
				the 1960s with the release of Letraset sheets containing Lorem Ipsum
				passages, and more recently with desktop publishing software like
				Ald us PageMaker including versions of Lorem Ipsum.</p>
		</article>
	</section>

	<footer><span>Footer</span></footer>
</body>
</html>