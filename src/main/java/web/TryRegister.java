package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserList;
import model.UserType;

@WebServlet("/try_register")
public class TryRegister extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	HttpSession session = request.getSession();		
    	UserList userList = new UserList();
    	userList = (UserList) session.getAttribute("userList");
    	List<User> users = userList.getUserList();
    	User user = new User();
    	user.setName(request.getParameter("name"));
    	user.setEmail(request.getParameter("email"));
    	user.setPassword(request.getParameter("password"));
    	user.setUserType(UserType.REGULAR);
    	users.add(user);
    	response.sendRedirect("login.jsp");
	}
}

