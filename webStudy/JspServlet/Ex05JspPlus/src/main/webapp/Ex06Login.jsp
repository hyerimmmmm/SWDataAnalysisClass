<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 받아온 ID/PW 값을 변수에 저장하고, id = smart, pw = 123 둘 다 일치하면 -->
	<!-- Ex06LoginSuccess 파일로 이동하고 -->
	<!-- 일치하지 않으면 Ex06LoginFail로 이동 -->
	
	<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals("smart") && pw.equals("123")) {
		response.sendRedirect("Ex06LoginSuccess.jsp?user=" + id);
		
	} else {
		response.sendRedirect("Ex06LoginFail.jsp");		
	}
	%>
</body>
</html>