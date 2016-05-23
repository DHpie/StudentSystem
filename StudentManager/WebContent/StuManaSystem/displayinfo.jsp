<%@page import="com.xiazi.model.StuInfo"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 使用迭代器Iterator将数据输出 -->
<!-- （1）.编写一个jsp表单，并将表单交给servlet处理 
(2).处理的servlet程序要：1.承接表单的参数；  2.新建一个数据库表实体      
（3）.在JDBC新建一个数据表实体，将数据库中的数据存入实体当中，执行指定的sql语句
（4）在servlet中用迭代器将实体中的数据输出来
（5）配置servlet的web.xml文件
 -->
	<jsp:useBean id="stuQuery" class="com.xiazi.Service.StuInfoQuery"></jsp:useBean>
	<%
	List stus=stuQuery.queryALLStu();

	Iterator iter=stus.iterator();
	%>
	<table>
		<tr>
			<td>id</td>
			<td>昵称</td>
			<td>真实姓名</td>
			<td>性别</td>
			<td>出生日期</td>
			<td>专业</td>
			<td>课程</td>
			<td>兴趣</td>
			<td>备注</td>
		</tr>
	
	<%
	int i=0;
	while(iter.hasNext()){
		StuInfo student=(StuInfo)iter.next();
	%>
		<tr <%if(i%2==0){%> bgcolor="#f0f8ff"<% } %>>
		<!-- 设置偶数行的背景 -->
			<td><%=student.getId() %></td>
			<td><%=student.getNicheng() %></td>
			<td><%=student.getTruename()%></td>
			<td><%if(student.getGender()==1) out.print("男");else out.print("女"); %></td>
			<td><%=student.getBirth()   %></td>
			<td><%=student.getMajor() %></td>
			<td><%=student.getCourses() %></td>
			<td><%=student.getHobbys() %></td>
			<td><%=student.getBz() %></td>
		</tr>
	<%
	i++;
	} 
	%>
	

	</table>
</body>
</html>