<%@page import="java.util.Random"%>
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
	<p>랜덤 뽑기 결과</p>
	<%
	String title = request.getParameter("title");
	String[] items = request.getParameterValues("item");
	Random ran = new Random();
	int ranNum = ran.nextInt(items.length);
	
	out.print(title);
	out.print("<br>");
	for(int i = 0; i <= ranNum; i++) {
		if (i == ranNum) {
			out.print(items[i]);
		}
	}
	%>
</body>
</html>