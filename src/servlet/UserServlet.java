package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        
        int userID = Integer.parseInt(request.getParameter("userID"));
        String userName = request.getParameter("userName");
        String userEmial = request.getParameter("userEmial");
        String userPassword = request.getParameter("userPassword");
        String userPhone = request.getParameter("userPhone");
        int userPropertyID = Integer.parseInt(request.getParameter("userPropertyID"));
        
        User user = new User(userID, userName, userEmial, userPassword, userPhone,userPropertyID, 0);
	}

}
