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
	<form action="Ex02Response.jsp" method="GET">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Java 점수</td>
				<td><input type="text" name="java"></td>
			</tr>
			<tr>
				<td>Web 점수</td>
				<td><input type="text" name="web"></td>
			</tr>
			<tr>
				<td>IoT 점수</td>
				<td><input type="text" name="iot"></td>
			</tr>
			<tr>
				<td>Android 점수</td>
				<td><input type="text" name="android"></td>
			</tr>
			<tr align="right">
				<td colspan="2"><input type="submit" value="학점확인"></td>
			</tr>
		</table>
	</form>
</body>
</html>