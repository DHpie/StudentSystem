package com.xiazi.Service;
import java.sql.DriverManager;
/*
 *验证用户是否合法 
 */
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xiazi.conn.JDBCCon;
import com.xiazi.model.UserTable;

public class UserService {
	Connection connection=null;
		// 验证用户是否合法，存在用户则返回true;否则返回false
		public boolean valiUser(UserTable user) {
		 connection = (Connection) JDBCCon.getInstance().getConnection();
			try {
				PreparedStatement pstmt = (PreparedStatement) connection
						.prepareStatement("select * from usertable where username=?and password=?");
				// 给两个“？”设置值。因为username 和password是Stirng型变量，故要用到setString()
				// 前者代表是第一个参数，即第一个问号；后者代表第一个问号的值

				pstmt.setString(1, user.getUsername());     //设置查询内容
				pstmt.setString(2, user.getPassword());
	//返回结果集
				ResultSet rs = pstmt.executeQuery();
	//判断 
				if (rs.next()) {
					return true;
				} else {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return false;// 抛出异常时返回一个false值
			}
		}
}
