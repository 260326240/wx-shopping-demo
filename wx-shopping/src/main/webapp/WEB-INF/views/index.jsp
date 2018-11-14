<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
</head>
<body>
	<p>单表查询</p>
	<c:forEach items="${user}" var="p">
		<div>
			<tr>
				id:<td>${p.id}</td>
				名字:<td>${p.name}</td>
				年龄:<td>${p.age}</td>
			</tr>
		</div>

	</c:forEach>
</body>
</html>