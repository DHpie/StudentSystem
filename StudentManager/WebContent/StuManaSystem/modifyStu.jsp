<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 //request.getParameter()方法，获取的是一个String型的数据，对于intt型的id需要强制转换
 	int id=Integer.parseInt(request.getParameter("id")) ;
 	out.print(id);
 %>
</body>
</html>