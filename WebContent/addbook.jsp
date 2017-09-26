<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Book_add" method="post">
		<input type="hidden" name="id"><br/>
		书名称:<input type="text" name="bname"><br/>
		书价格:<input type="text" name="price"><br/>
		出版社:<input type="text" name="press"><br/>
		书作者:<input type="text" name="author"><br/>
		<input type="submit" value="添加">
</form>
</body>
</html>