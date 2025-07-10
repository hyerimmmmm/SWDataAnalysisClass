<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>랜덤 당첨 게임</h1>
	<p>랜덤 뽑기</p>
	<form action="Ex03RandomOutput.jsp" mathod="GET">
		주제: <input type="text" name="title">
		<br>
		<%
		int count = Integer.parseInt(request.getParameter("count"));
		for (int i = 0; i < count; i++) {
			out.print("아이템: <input type=\"text\" name=\"item\"><br>");
		}
		%>
		<input type="submit" value="랜덤뽑기">
	</form>
</body>
</html>