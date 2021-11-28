package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	static {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";		
		try {
			Class.forName(driverName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=final";
		String userName = "sa";
		String userPwd = "123456";
		try {
			conn = DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("Successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print("Fail！");
		}
		return conn;	
	}
	
	public static int execute(String sql, Object[] params) throws SQLException {
		int count= 0;
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement(sql);			
			for(int i=0; i<params.length; i++) {
				pst.setObject(i+1, params[i]);
			}				
			count = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pst, conn);
		}		
		return count;
	}
	
	public static void closeAll(ResultSet rs, PreparedStatement pst, Connection conn) throws SQLException {
		try {
			if (rs != null) {
			}
			rs.close();

			if (pst != null) {
				pst.close();
			}

			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
