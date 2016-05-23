<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<!-- 插入记录的步骤：  
（1）.编写一个jsp表单，并将表单交给servlet处理 
(2).处理的servlet程序要：1.承接表单的参数；  2.新建一个数据库表实体    3.将承接的表单数据传给数据库实体     
（3）.用JDBC将数据库实体中的数据传入数据库中，执行指定的sql语句
（4）在servlet中做出插入判断：成功，或失败的不同跳转
（5）配置servlet的web.xml文件-->
<form action="<%=request.getContextPath() %>/inputStuInfoServlet" method="post" >
		<table width="462" height="495" bgcolor="#cococo">
			<tr>
				<th align="center" bgcolor="green" colspan="2"><font size="8" color="white">学生信息录入</font></th>
			</tr>
			<tr>
				<td height="44">昵称:</td>	
			  <td><input type="text" height="28px" size="23"  name="nicheng"></td>
			</tr>
			<tr>
				<td height="44">真实姓名:</td>	
			  <td><input type="text" size="23" name="truename"></td>
			</tr>
			<tr>
				<td height="44">性别</td>	
				<td>
					<input type="radio" name="gender" checked value="1">男
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="gender" value="0">女
				</td>
			</tr>
			<tr>
				<td height="44">出生日期</td>	
			  <td><input type="text" size="23" name="birth"></td>
			</tr>
			<tr>
				<td height="44">所学专业</td>	
				<td>
				<select name="major">
					<option>物联网工程</option>
					<option>通信工程</option>
					<option>计算机科学与技术</option>
				</select>
				</td>
			</tr>
			<tr>
				<td height="44">所学课程</td>	
				<td>
					<select size="4" multiple="multiple" name="course">
					<option>数据结构</option>
					<option>Java</option>
					<option>C语言</option>
					<option>操作系统</option>
					<option>Python</option>
					<option>Go</option>
				</select>
				</td>
			</tr>
			<tr>
				<td height="44">兴趣</td>	
				<td>
					<input type="checkbox" name="hobby" value="music">听音乐
					<input type="checkbox" name="hobby" value="book">看小说
					<input type="checkbox" name="hobby" value="net">上网
				</td>
			</tr>
			<tr>
				<td height="44" name="bz">备注</td>	
			  <td>
			  	<textarea rows="6" cols="20"></textarea>
			  </td>
			</tr>
			<tr>
				<td height="44" align="center"  colspan="2">
					<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="重置">
				</td>				
			</tr>
		</table>
	</form>
</center>
</body>
</html>