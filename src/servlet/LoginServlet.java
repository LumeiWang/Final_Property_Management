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
import javax.servlet.http.HttpSession;

import dao.BaseDao;
import dao.LogDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("resource")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		ResultSet rs = null;
		PreparedStatement pst = null;

		// get login information
		String loginEmail = request.getParameter("email");
		String loginPassword = request.getParameter("password");
		// SQL
		String selectPassword = "select Password from [User] where Email = ?";
		String userName = "select Name from [User] where Email = ?";
		String userID = "select ID from [User] where Email = ?";
		String userPhone = "select Phone from [User] where Email = ?";

		try {
			List<String> emailList = LogDao.emaiList();
			// judge whether the user has already registered
			if (emailList.contains(loginEmail)) {
				// put all passwords into a list
				List<String> passwordList = new ArrayList<String>();
				// put all names, IDs, and phone numbers into lists
				List<String> nameList = new ArrayList<String>();
				List<String> IDList = new ArrayList<String>();
				List<String> PhoneList = new ArrayList<String>();
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
					HttpSession session=null;
					session = request.getSession();
					session.setAttribute("userEmail",loginEmail);
					
					pst = conn.prepareStatement(userName);	
					pst.setString(1, loginEmail);				
					rs = pst.executeQuery();
					while (rs.next()) {
						nameList.add(rs.getString(1));
					}
					userName = nameList.get(0);
					session.setAttribute("userName",userName);
					
					pst = conn.prepareStatement(userID);
					pst.setString(1, loginEmail);				
					rs = pst.executeQuery();
					while (rs.next()) {
						IDList.add(rs.getString(1));
					}
					userID = IDList.get(0);
					session.setAttribute("userID",userID);
					
					pst = conn.prepareStatement(userPhone);
					pst.setString(1, loginEmail);				
					rs = pst.executeQuery();
					while (rs.next()) {
						PhoneList.add(rs.getString(1));
					}
					if (PhoneList.size() == 0) {
						userPhone = "";
						session.setAttribute("userPhone",userPhone);
					} else {
						userPhone = PhoneList.get(0);
						session.setAttribute("userPhone",userPhone);
					}					
					
					request.getRequestDispatcher("/SucLogin.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("/LoginError.jsp").forward(request, response);
				}
			} else {
				request.getRequestDispatcher("/LoginError.jsp").forward(request, response);
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
