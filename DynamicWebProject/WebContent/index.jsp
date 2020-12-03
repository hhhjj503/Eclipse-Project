<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dynamic Web Project</title>
</head>
<body>
<h1>Dynamic Web Project</h1>
<p>JSP 웹 프로젝트를 실행합니다</p>
<%
out.println("랜덤값 ㅣ " + Math.random());
%>
</body>
</html>