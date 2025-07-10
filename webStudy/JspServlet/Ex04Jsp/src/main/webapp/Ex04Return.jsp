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
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int num3 = 0;
	String math = request.getParameter("math");

	if(math.equals("plus")) {	
		num3 = num1 + num2;
		out.print(num1 + "+" + num2 + "=");
	} else if(math.equals("minus")) {
		num3 = num1 - num2;
		out.print(num1 + "-" + num2 + "=");
	} else if(math.equals("times")) {
		num3 = num1 * num2;
		out.print(num1 + "*" + num2 + "=");
	} else if(math.equals("devide")) {
		out.print(num1 + "/" + num2 + "=");
		num3 = num1 * num2;
	}
	%>
	
	<%= num3 %>
</body>
</html>