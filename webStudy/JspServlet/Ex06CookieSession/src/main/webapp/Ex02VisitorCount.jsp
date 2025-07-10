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
	// 클라이언트가 보내준 모든 쿠키 목록을 가져옴
	Cookie[] cookies = request.getCookies();
	
	int count = 0;
	// 쿠키 배열을 하나씩 반복하면서 쿠키 이름이 visitCount인 쿠키 찾기
	for(Cookie c : cookies) {
		// visitCount를 찾으면, 그 값을 찾아서 저장
		if(c.getName().equals("visitCount")) {
			count = Integer.parseInt(c.getValue());
		}
	}
	
	// 가져온 기존 방문 횟수에 1을 추가
	count++;
	
	Cookie visit = new Cookie("visitCount", String.valueOf(count));
	visit.setMaxAge(10);
	response.addCookie(visit);
	%>
	<h2>당신은 이 페이지를 <%= count %> 번 방문했습니다</h2>
</body>
</html>