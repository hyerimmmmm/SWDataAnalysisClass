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
	String site = request.getParameter("site");
	String url = "";
	
	switch(site) {
	case "naver":
		url = "https://www.naver.com";
		break;
	case "daum":
		url = "https://www.daum.net/";
		break;
	case "google":
		url = "https://www.google.co.kr/?client=safari&channel=ipad_bm";
		break;
	}
	
	response.sendRedirect(url);
	%>
</body>
</html>