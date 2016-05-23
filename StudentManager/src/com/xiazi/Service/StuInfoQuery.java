package com.xiazi.Service;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xiazi.conn.JDBCCon;
import com.xiazi.model.StuInfo;

public class StuInfoQuery {
	
		// 创建建立连接的方法
		Connection connection=null;
	public List queryALLStu(){
		 connection = (Connection) JDBCCon.getInstance().getConnection();
//		List a=new ArrayList();是集合类的多态，List是接口，ArrayList是其下的一个子类Java集合类要尽量返回接口，而非实际类型
		List stus=new ArrayList();
		try{
			PreparedStatement pstmt=(PreparedStatement) connection.prepareStatement
					("select * from studentinfo");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				StuInfo stu=new StuInfo();
				stu.setId(rs.getInt(1));
				stu.setNicheng(rs.getString(2));
				stu.setTruename(rs.getString(3));
				stu.setGender(rs.getByte(4));
//				如果出生日期不为空，就将其转换成String类型
				if(rs.getDate(5)!=null){
					stu.setBirth(rs.getDate(5).toString());
				}
				stu.setMajor(rs.getString(6));
//				为kecourse hobby输出时加上分隔符 " "
				if(rs.getString(7)!=null)
					stu.setCourse(rs.getString(7).split(""));
				if(rs.getString(8)!=null)
					stu.setHobby(rs.getString(8).split(""));
				stu.setBz(rs.getString(9));
				stus.add(stu);
			}
			return stus;
		}catch(Exception e){
			e.printStackTrace();
				return null;
		}
	}
}
	
