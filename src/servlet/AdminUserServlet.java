package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;
import entity.User;

@WebServlet("/AdminUserServlet")
public class AdminUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int currentPage = 1; // current page
			int perPage = 5; // number of properties on each page

			// get the required page
			String cPage = request.getParameter("currentPage");

			// get the search keyword
			String email = request.getParameter("email");

			if (cPage != null) {
				currentPage = Integer.parseInt(cPage);
			}

			int array[] = UserDao.totalPage(perPage, email);

			// get all users
			ArrayList<User> list = UserDao.searchAll(currentPage, perPage, email);

			// put the list to the request
			request.setAttribute("userList", list);
			request.setAttribute("totalUser", array[0]);
			request.setAttribute("totalPage", array[1]);
			request.setAttribute("currentPage", currentPage);

			if (email != null) {
				request.setAttribute("searchPara", "&email=" + email);
			}

			// redirect
			request.getRequestDispatcher("Admin_userList.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
