package com.xiazi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiazi.Service.AddStuValidate;
import com.xiazi.model.StuInfo;


public class inputStuInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inputStuInfoServlet() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nicheng=request.getParameter("nicehng");
		String truename=request.getParameter("truename");
		byte gender=Byte.parseByte(request.getParameter("gender"));
		String birth=request.getParameter("birth");
		String major=request.getParameter("major");
		String[] course=request.getParameterValues("course");
		String[] hobby=request.getParameterValues("hobby");
		String bz=request.getParameter("bz");
		
		StuInfo stu=new StuInfo();
		stu.setNicheng(nicheng);
		stu.setTruename(truename);
		stu.setGender(gender);
		stu.setBirth(birth);
		stu.setMajor(major);
		stu.setCourse(course);
		stu.setHobby(hobby);
		stu.setBz(bz);
//	插入不成功，，总是跳转到 else的条件按下	
		if(new AddStuValidate().addStu(stu)){
			response.sendRedirect(request.getContextPath()+"/StuManaSystem/inputStuInfo_success.jsp");
		}else {
//			JOptionPane.showMessageDialog(null, "填写信息不正确！");
			response.sendRedirect(request.getContextPath()+"/StuManaSystem/inputStuInfo.jsp");
		}
				
		
	}

}
