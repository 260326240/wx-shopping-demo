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
<p>分页查询</p>
	<c:forEach items="${page.getRecords()}" var="p">
		<div>
			<tr>
				id:<td>${p.id}</td>
				名字:<td>${p.name}</td>
				年龄:<td>${p.age}</td>
			</tr>
		</div>

	</c:forEach>
			默认页:${page.getCurrent()}
			当前总分页数:${page.getPages()}
			总页数:${page.getSize()}
			总条数:${page.getTotal()}
</body>
</html>