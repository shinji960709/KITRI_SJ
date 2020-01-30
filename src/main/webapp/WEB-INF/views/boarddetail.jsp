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

<c:forEach items="${list }" var="vo">
	
 <h5>${vo.title}</h5> 
 <h5>${vo.id}</h5> 
 <h5>${vo.click}</h5> 
 <h5>${vo.num}</h5> 
 <h5>${vo.text}</h5> 
 <h5>${vo.time}</h5> 
  <h5>${vo}</h5> 

</c:forEach>

<form action="<%=path %>/boardupdate" method="post">
<input type="submit" value="수정">
</form>

<form action="<%=path %>/boarddelete?seq=${vo.seq}" method="post">
<input type="submit" value="삭제">
</form>

</body>
</html>