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
	
 <h5><a href="<%=path %>/boarddetail?title=${vo.title}">${vo.title}</a></h5> 
									
</c:forEach>



</body>
</html>