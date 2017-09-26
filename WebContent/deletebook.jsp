<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${requestScope.boo1 }
<form action="Book_delete" method="post">

		<input type="hidden" name="id" value="${book1.getId() }"><br/>
		书名称:<input type="text" name="bname" value="${book1.getBname() }"><br/>
		书价格:<input type="text" name="price" value="${book1.getPrice() }"><br/>
		出版社:<input type="text" name="press" value="${book1.getPress() }"><br/>
		书作者:<input type="text" name="author" value="${book1.getAuthor() }"><br/>
		<input type="submit" value="删除">
</form>
</body>
</html>