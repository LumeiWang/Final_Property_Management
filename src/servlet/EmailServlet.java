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
import entity.Email;

@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		 
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		ResultSet rs = null;
		PreparedStatement pst = null;
		// get user email
		String email = request.getParameter("email");
		Email newEmail = new Email();
		
		try {
			// SQL		
			String selectPassword = "select Password from [User] where Email = ?";
			// put all passwords into a list
			List<String> passwordList = new ArrayList<String>();
			// select the password according to the user ID				
			pst = conn.prepareStatement(selectPassword);				
			// put NewPw to the '?' in SQL
			pst.setString(1, email);
			rs = pst.executeQuery();
			while (rs.next()) {
				passwordList.add(rs.getString(1));
			}
			
			if (passwordList.size() == 0) {
				// if there is no record of the email address
				request.getRequestDispatcher("/ForgetError.jsp").forward(request, response);
			} else {
				String password = passwordList.get(0);
				//set receiver and the message
				newEmail.sendMail(email, "Information from Property Manager: your password is "+password);
				request.getRequestDispatcher("/SucForget.jsp").forward(request, response);
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
