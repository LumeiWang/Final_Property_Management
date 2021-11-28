package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BaseDao;
import dao.LogDao;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		// get username
		String userName = request.getParameter("username");
		// get email address
		String email = request.getParameter("email");
		// get password
		String password = request.getParameter("password");
		// get phone number
		String phone = request.getParameter("phone");
		
		try {
			// list of users
			List<String> userList = LogDao.emaiList();
			if (userName == "" || email == "" || password == "") {
				request.getRequestDispatcher("/RegisterError.jsp").forward(request, response);
			} else {
				if (userList.contains(email)) {
					request.getRequestDispatcher("/RegisterError.jsp").forward(request, response);
				} else {
					if (phone == "") {
						String insert = "insert into [User](Name,Email,Password,Status) values(?,?,?,0)";
						try {
							pst = conn.prepareStatement(insert);
							// set PreparedStatement arguments
							pst.setString(1, userName);
							pst.setString(2, email);
							pst.setString(3, password);
							// execute SQL
							pst.execute();
							conn.commit();
							request.getRequestDispatcher("/SucRegister.jsp").forward(request, response);						
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} else {
						String insert = "insert into [User](Name,Email,Phone,Password,Status) values(?,?,?,?,0)";
						try {
							pst = conn.prepareStatement(insert);
							// set PreparedStatement arguments
							pst.setString(1, userName);
							pst.setString(2, email);
							pst.setString(3, phone);
							pst.setString(4, password);
							// execute SQL
							pst.execute();
							conn.commit();
							request.getRequestDispatcher("/SucRegister.jsp").forward(request, response);						
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
