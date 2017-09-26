<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<c:if test="${empty requestScope.list1 }">
<jsp:forward page="Book_find"></jsp:forward>
</c:if>
<body>
<table>
<tr>
		<td>书编号</td>
		<td>书名称</td>
		<td>书价格</td>
		<td>出版社</td>
		<td>书作者</td>
	</tr>
<c:forEach items="${requestScope.list1}" var="book">
		<tr>
			<td>${book.id}</td>
			<td>${book.bname}</td>
			<td>${book.price}</td>
			<td>${book.press }</td>
			<td>${book.author }</td>
			<td><a href="Book_preupdate?id=${book.id}"> 修改</a></td>
			<td><a href="Book_predelete?id=${book.id}"> 删除</a></td>
</tr>

</c:forEach>
<tr>
<td><a href="addbook.jsp">添加</a></td>
</tr>
<tr>
	<td colspan="7">
	每页${requestScope.pageSize }条记录&nbsp;共${requestScope.totalCount }条记录第${requestScope.currentPage}页共${requestScope.totalPage}页
	<c:if test="${requestScope.currentPage==1 }">
	首页&nbsp;上一页
	</c:if>
	<c:if test="${requestScope.currentPage!=1 }">
	<a href="Book_find?currentPage=1">首页</a>
	<a href="Book_find?currentPage=${requestScope.currentPage-1}">上一页</a>
	</c:if>
	<c:if test="${requestScope.currentPage==requestScope.totalPage }">
	下一页&nbsp;尾页
	</c:if>
	<c:if test="${requestScope.currentPage!=requestScope.totalPage }">
	<a href="Book_find?currentPage=${requestScope.currentPage+1}">下一页</a>
	<a href="Book_find?currentPage=${requestScope.totalPage}">尾页</a>
	
	</c:if>
	</td>
	</tr>
</table>
</body>
</html>