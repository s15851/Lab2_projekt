package web.filters;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserList;

@WebFilter("try_login")
public class TryLoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();

		if(session.getAttribute("currentUser")!=null) {
			chain.doFilter(request, response);
			return;
		}
		
		UserList userList = new UserList();
		if(session.getAttribute("userList")==null) {
			session.setAttribute("userList", userList);
		}
		else {
			userList = (UserList) session.getAttribute("userList");
		}
		
		List<User> users = userList.getUserList();
		for (int i = 0; i < users.size(); i++) {
			if(request.getParameter("name").equals(users.get(i).getName()) == true &&
			   request.getParameter("password").equals(users.get(i).getPassword()) == true) {
				session.setAttribute("currentUser", users.get(i));
				chain.doFilter(request, response);
				return;
			}
		}
		
		response.getWriter().print("Login failed");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
