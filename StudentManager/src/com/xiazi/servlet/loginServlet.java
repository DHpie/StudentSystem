package com.xiazi.servlet;
/*
 * servlet要在web.xml中进行配置
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.xiazi.Service.UserService;
import com.xiazi.model.UserTable;

public class loginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");


		System.out.println("用户名：===>" + username);
		System.out.println("密码：====>" + password);
	
	//	创建一个登录用户实例，并将表单控件传来的值赋给该实例
	UserTable user=new UserTable();
		user.setUsername(username);
		user.setPassword(password);
		

		//		判断用户是否合法，并进行处理   

 		try {
//				调用其他包的方法，要先创建该类的实例，再去调用该类的该方法 ，例如下面的:new UserService()实例化该类，在调用valiUser()方法
		if(new UserService().valiUser(user)){				
				resp.sendRedirect(req.getContextPath()+"/StuManaSystem/main.jsp");
			}else{
				resp.sendRedirect(req.getContextPath()+"/StuManaSystem/login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
		
	}
	
}
