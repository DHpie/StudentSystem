package com.xiazi.Service;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xiazi.conn.JDBCCon;

public class DeleteStuValidate {
  Connection  connection=null;
	//	删除记录
	public Boolean deleteStu(int id){
		connection = (Connection) JDBCCon.getInstance().getConnection();
		try {
			PreparedStatement pstmt = (PreparedStatement) connection
					.prepareStatement("delete from studentinfo where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
