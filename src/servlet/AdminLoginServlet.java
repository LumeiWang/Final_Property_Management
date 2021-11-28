package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BaseDao;
import dao.LogDao;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		ResultSet rs = null;
		PreparedStatement pst = null;

		// get login information
		String loginEmail = request.getParameter("admin_email");
		String loginPassword = request.getParameter("admin_password");
		// SQL
		String selectPassword = "select Password from Admin where Email = ?";

		try {
			List<String> emailList = LogDao.admin_emaiList();
			// judge whether the email address is right
			if (emailList.contains(loginEmail)) {
				// put all passwords into a list
				List<String> passwordList = new ArrayList<String>();			
				// find the password according to the email				
				pst = conn.prepareStatement(selectPassword);				
				// put loginEmail to the '?' in SQL
				pst.setString(1, loginEmail);				
				rs = pst.executeQuery();
				while (rs.next()) {
					passwordList.add(rs.getString(1));
				}
				
				// judge whether the password is matched
				if (passwordList.get(0).equals(loginPassword)) {
					request.getRequestDispatcher("/Admin_index.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("/Admin_loginError.jsp").forward(request, response);
				}
			} else {
				request.getRequestDispatcher("/Admin_loginError.jsp").forward(request, response);
			}

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
