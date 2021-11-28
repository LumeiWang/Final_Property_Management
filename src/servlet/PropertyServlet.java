package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BaseDao;

@WebServlet("/PropertyServlet")
public class PropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		PreparedStatement pst = null;

		// get property information
		String propertyName = request.getParameter("propertyName");
		String propertyStatus = request.getParameter("propertyStatus");
		String propertyBedroom = request.getParameter("propertyBedroom");
		String propertyBathroom = request.getParameter("propertyBathroom");
		String propertyZip = request.getParameter("propertyZip");
		String propertyPrice = request.getParameter("propertyPrice");
		String propertyCity = request.getParameter("propertyCity");
		String propertyAddress = request.getParameter("propertyAddress");
		String propertyDescription = request.getParameter("propertyDescription");
		String ownerName = request.getParameter("ownerName");
		String ownerEmail = request.getParameter("ownerEmail");
		

		if (propertyName == "" || propertyStatus == "" || String.valueOf(propertyBedroom) == ""
				|| String.valueOf(propertyBathroom) == "" || propertyZip == "" || propertyPrice == ""
				|| propertyCity == "" || propertyAddress == "" || propertyDescription == "" || ownerName == ""
				|| ownerEmail == "" || propertyName == null || propertyStatus == null
				|| String.valueOf(propertyBedroom) == null || String.valueOf(propertyBathroom) == null
				|| propertyZip == null || propertyPrice == null || propertyCity == null || propertyAddress == null
				|| propertyDescription == null || ownerName == null || ownerEmail == null) {
			request.getRequestDispatcher("/AddError.jsp").forward(request, response);
		} else {
			String insert = "insert into Property values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try {
				pst = conn.prepareStatement(insert);
				// set PreparedStatement arguments
				pst.setString(1, propertyName);
				pst.setString(2, propertyStatus);
				pst.setString(3, propertyBedroom);
				pst.setString(4, propertyBathroom);
				pst.setString(5, propertyZip);
				pst.setString(6, propertyPrice);
				pst.setString(7, propertyCity);
				pst.setString(8, propertyAddress);
				pst.setString(9, propertyDescription);
				pst.setString(10, ownerName);
				pst.setString(11, ownerEmail);
				// execute SQL
				pst.execute();
				conn.commit();
				// redirect
				request.getRequestDispatcher("/SucAdd.jsp").forward(request, response);
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
}
