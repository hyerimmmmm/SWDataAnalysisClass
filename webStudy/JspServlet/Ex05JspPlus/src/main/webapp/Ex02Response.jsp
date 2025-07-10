<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>학점 확인 프로그램</h3>
	<%
	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	int avg = (java + web + iot + android) / 4; 
	
	out.print("<table>");
	out.print("<tr><td>이름</td><td>" + name + "</td><tr>");
	out.print("<tr><td>Java 점수</td><td>" + java + "</td><tr>");
	out.print("<tr><td>Web 점수</td><td>" + web + "</td><tr>");
	out.print("<tr><td>IoT 점수</td><td>" + iot + "</td><tr>");
	out.print("<tr><td>Android 점수</td><td>" + android + "</td><tr>");
	out.print("<tr><td>평균 점수</td><td>" + avg + "</td><tr>");
	out.print("<tr><td>학점</td><td>");
	
	if (avg >= 95) {
		out.print("A+");
	} else if (avg >= 90) {
		out.print("A");
	} else if (avg >= 85) {
		out.print("B+");
	} else if (avg >= 80) {
		out.print("B");
	} else {
		out.print("F");
	}
	
	out.print("</td><tr>");
	out.print("<table>");
	%>
</body>
</html>