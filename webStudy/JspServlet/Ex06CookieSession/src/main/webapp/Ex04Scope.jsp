<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
	스코프(Scope) : 데이터를 저장할 수 있는 범위
	1. Page Scope
		- 현재 JSP 파일 안에서만
	2. Request Scope
		- 현재 요청이 끝날 때까지
		- forward를 사용해서는 다른 JSP 파일로 전달가능
	3. Session Scope
		- 세션이 살아있는 동안(브라우저)
	4. Application Scope
		- 서버 전체가 공유
		- 서버가 켜져 있는 동안 다같이 공유
		
	범위 : 페이지 < 리퀘스트 < 세션 < 어플리케이션
	-->
	<%
	// 페이지
	pageContext.setAttribute("test", "page");
	// 리퀘스트
	request.setAttribute("test", "request");
	// 세션
	session.setAttribute("test", "session");
	// 어플리케이션
	application.setAttribute("test", "application");
	
	// 리퀘스트 살리기
	RequestDispatcher dp = request.getRequestDispatcher("Ex04ScopeCheck.jsp");
	dp.forward(request, response);
	%>
	
	<p> 저장된 스코프 값 확인해보기 </p>
	<p>page scope : <%= pageContext.getAttribute("test") %></p>
	<p>request scope : <%= request.getAttribute("test") %></p>
	<p>session scope : <%= session.getAttribute("test") %></p>
	<p>application scope : <%= application.getAttribute("test") %></p>
	
	<a href="Ex04ScopeCheck.jsp">다른페이지로 이동</a>
</body>
</html>