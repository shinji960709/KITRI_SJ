<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	
});

</script>
</head>
<body>

<h1>게시글 작성</h1>
<form action="<%=path %>/boardwrite" method ="post">
제목 <input type = text name="title"><br>
내용<input type = text name="text"><br>
작성자<input type = text name="id"><br>
암호<input type = text name="textpw"><br>
<input type=submit value="작성완료">

</form>

</body>
</html>