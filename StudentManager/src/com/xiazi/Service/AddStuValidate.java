package com.xiazi.Service;

/*
 * 将学生信息插入数据库
 */
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.apache.catalina.User;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xiazi.conn.JDBCCon;
import com.xiazi.model.StuInfo;
import com.xiazi.model.UserTable;

public class AddStuValidate {
	Connection connection=null;

	// 验证用户是否合法，存在用户则返回true;否则返回false
	public boolean addStu(StuInfo stu) {
		connection = (Connection) JDBCCon.getInstance().getConnection();
		try {
			PreparedStatement pstmt = (PreparedStatement) connection
					.prepareStatement("insert into studentinfo(nicheng,truename,gender,birth,major,course,hobby,bz)"
							+ "values(?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, stu.getNicheng());
			pstmt.setString(2, stu.getTruename());
			pstmt.setByte(3, stu.getGender());
			pstmt.setString(4, stu.getBirth());
			pstmt.setString(5, stu.getMajor());
			pstmt.setString(6, stu.getCourses());
			pstmt.setString(7, stu.getHobbys());
			pstmt.setString(8, stu.getBz());
//执行更新
			pstmt.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;// 抛出异常时返回一个false值
		}
	}


}
