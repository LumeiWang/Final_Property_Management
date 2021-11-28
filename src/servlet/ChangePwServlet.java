package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BaseDao;

@WebServlet("/ChangePwServlet")
public class ChangePwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		ResultSet rs = null;
		PreparedStatement pst = null;
		// get user ID
		String userID = request.getSession().getAttribute("userID").toString();
		// get new password information
		String NewPw = request.getParameter("NewPw");		
		
		try {
			// SQL		
			String updatePassword = "update [User] set Password = ? WHERE ID = ?";
			// update the password according to the user ID				
			pst = conn.prepareStatement(updatePassword);				
			// put NewPw to the '?' in SQL
			pst.setString(1, NewPw);
			pst.setString(2, userID);
			// execute SQL
			pst.execute();
			conn.commit();
			request.getRequestDispatcher("/SucChange.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				BaseDao.closeAll(rs, pst, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
