<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = (String)session.getAttribute("id");
	if(id == null) {
		// 로그인 안했으면 로그인 폼으로 보내기
		response.sendRedirect("Ex03LoginFrom.html");
	}
	%>
	
	<h2><%= id %>님의 마이페이지 입니다!</h2>
	<a href="Ex03Main.jsp">마이페이지</a>
	<a href="Ex03Logout">로그아웃</a>
</body>
</html>