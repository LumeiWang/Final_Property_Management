package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.User;

public class UserDao {
	public static int[] totalPage(int perPage, String email) throws SQLException {
		// initialize 0 user and 1 page
		int array[] = { 0, 1 };
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			String select = "";
			if (email == "" || email == null) {
				select = "select count(*) from [User]";
				pst = conn.prepareStatement(select);

			} else {

				select = "select count(*) from [User] where Email like CONCAT('%', ?, '%')";
				pst = conn.prepareStatement(select);
				pst.setString(1, email);
			}

			rs = pst.executeQuery();

			while (rs.next()) {
				array[0] = rs.getInt(1);
				if (array[0] == 0) {
					array[1] = 1;
				} else {
					if (array[0] % perPage == 0) {
						array[1] = array[0] / perPage;
					} else {
						array[1] = array[0] / perPage + 1;
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}
		return array;
	}

	// search from the database
	public static ArrayList<User> searchAll(int currentPage, int perPage, String email) throws SQLException {
		ArrayList<User> list = new ArrayList<User>();
		// get connection with the database
		ResultSet rs = null;
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		try {
			String select = "";

			if (email == "" || email == null) {
				select = "select top (?) * from [User] where ID not in (select top (?) ID from [User])";
				pst = conn.prepareStatement(select);
				pst.setInt(1, perPage);
				pst.setInt(2, (currentPage - 1) * perPage);
			} else {
				select = "select top (?) * from [User] where (Email like CONCAT('%', ?, '%')) and ID not in (select top (?) ID from [User])";
				pst = conn.prepareStatement(select);
				pst.setInt(1, perPage);
				pst.setString(2, email);
				pst.setInt(3, (currentPage - 1) * perPage);
			}

			rs = pst.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("ID"), rs.getString("Name"), rs.getString("Email"),
						rs.getString("Password"), rs.getString("Phone"), rs.getInt("PropertyID"), rs.getInt("Status"));
				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pst, conn);
		}

		return list;
	}
}
