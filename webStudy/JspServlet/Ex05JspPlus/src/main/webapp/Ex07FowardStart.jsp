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
	Redirect와 Forward의 차이
	
	Redirect
	- 클라이언트에게 다시 페이지를 '요청'하는 방식으로 동작
	- URL 주소에 변화 O
	- 새로운 request, response 객체 생성
	- 데이터를 전달하기 힘들다(전달하고 싶으면 url 파라미터를 추가하는 방식)
	
	Forward
	- 서버끼리 요청을 '전달'하는 방식으로 동작
	- URL 주소에 변화 X
	- 같은 request, response 객체 사용 가능
	- 데이터 전달 가능
		- request.setAttribute()
	-->
	<h1>FowardStart</h1>
	<%
	// 데이터 전달
	request.setAttribute("name", "miri");
	
	// 페이지 재요청
	RequestDispatcher dp = request.getRequestDispatcher("Ex07FowardEnd.jsp");
	
	// 페이지 이동(요청, 응답 객체를 같이 보냄)
	dp.forward(request, response);
	%>
</body>
</html>