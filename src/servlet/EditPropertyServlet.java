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

@WebServlet("/EditPropertyServlet")
public class EditPropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		Connection conn = BaseDao.getConnection();
		ResultSet rs = null;
		PreparedStatement pst = null;
		// get property information
		String propertyID = request.getParameter("propertyID");
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
		System.out.println("1");

		try {
			System.out.println("2");
			// SQL
			String updatePassword = "update Property set Name = ?, Status = ?, Bedroom = ?, Bathroom = ?, Zip = ?, Price = ?, City = ?, Address = ?, Description = ?, OwnerName = ?, OwnerEmail = ? WHERE ID = ?";

			System.out.println("3");
			if (propertyID == "" || propertyName == "" || propertyStatus == "" || String.valueOf(propertyBedroom) == ""
					|| String.valueOf(propertyBathroom) == "" || propertyZip == "" || propertyPrice == ""
					|| propertyCity == "" || propertyAddress == "" || propertyDescription == "" || ownerName == ""
					|| ownerEmail == "" || propertyID == null || propertyName == null || propertyStatus == null
					|| String.valueOf(propertyBedroom) == null || String.valueOf(propertyBathroom) == null
					|| propertyZip == null || propertyPrice == null || propertyCity == null || propertyAddress == null
					|| propertyDescription == null || ownerName == null || ownerEmail == null) {
				request.getRequestDispatcher("/EditError.jsp").forward(request, response);
			} else {
				// update the password according to the user ID
				pst = conn.prepareStatement(updatePassword);
				// put new information to the '?' in SQL
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
				pst.setString(12, propertyID);
				// execute SQL
				pst.execute();
				conn.commit();
				System.out.println("4");
				request.getRequestDispatcher("/SucEdit.jsp").forward(request, response);
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
