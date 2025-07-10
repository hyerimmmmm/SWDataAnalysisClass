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
	String user = request.getParameter("user");
	out.print("<h1>" + user + "님 로그인 성공</h1>");
	%>
	
</body>
</html>