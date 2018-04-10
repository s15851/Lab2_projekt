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

@WebServlet("/change_type")
public class ChangeType extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	HttpSession session = request.getSession();	
    	UserList userList = new UserList();
    	userList = (UserList) session.getAttribute("userList");
    	List<User> users = userList.getUserList();
		for (int i = 0; i < users.size(); i++) {	
			if(request.getParameter(users.get(i).getName()) != null){
				if(users.get(i).getUserType() == UserType.REGULAR) {
					users.get(i).setUserType(UserType.PREMIUM); 
					}
				else if(users.get(i).getUserType() == UserType.PREMIUM) {
					users.get(i).setUserType(UserType.REGULAR);
				}
			}
		}			  	
    	response.sendRedirect("add_premium.jsp");
	}
}

