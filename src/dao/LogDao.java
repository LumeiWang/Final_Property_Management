package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LogDao {
	// get all email addresses in the database
	public static List<String> emaiList() throws SQLException {
		List<String> emaiList = new ArrayList<String>();
		// get connection with the database
		ResultSet rs = null;
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		try {
			String selectEmail = "select Email from [User]";
			pst = conn.prepareStatement(selectEmail);
			rs = pst.executeQuery();

			while (rs.next()) {
				emaiList.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}

		return emaiList;
	}

	// get the admin's email address in the database
	public static List<String> admin_emaiList() throws SQLException {
		List<String> emaiList = new ArrayList<String>();
		// get connection with the database
		ResultSet rs = null;
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		try {
			String selectEmail = "select Email from Admin";
			pst = conn.prepareStatement(selectEmail);
			rs = pst.executeQuery();

			while (rs.next()) {
				emaiList.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}

		return emaiList;
	}
}
