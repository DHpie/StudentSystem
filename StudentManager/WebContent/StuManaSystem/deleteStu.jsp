<%@page import="com.xiazi.model.StuInfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="StuInfo" class="com.xiazi.Service.DeleteStuValidate"></jsp:useBean>
	<%
	int id=Integer.parseInt(request.getParameter("id")) ;
 	out.print(id);
 	if(StuInfo.deleteStu(id)){
 		out.print("success");
 	}else{
 		out.print("error");
 	}
 	%>
</body>

</html>