<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>FowardEnd</h1>
	
	<%
	// request.getAttribute는 attribute를 object 형태로 가져오기 때문에 String으로 형변환을 해야 
	String message = (String)request.getAttribute("name");
	%>
	
		<h2><%= message %></h2>
</body>
</html>