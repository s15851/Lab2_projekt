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

@WebFilter("try_register")
public class TryRegisterFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();

		if(request.getParameter("password").equals(request.getParameter("confirm_password"))==false) {
			response.getWriter().print("Passwords are not matching");
			response.getWriter().print(request.getParameter("password"));
			response.getWriter().print(request.getParameter("confirm_password"));
			response.getWriter().print(String.valueOf(request.getParameter("confirm_password")));
			response.getWriter().print(String.valueOf(request.getParameter("password")));			
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
			if(request.getParameter("name").equals(users.get(i).getName()) == true) {
				response.getWriter().print("User " + request.getParameter("name") + " already exists");				
				return;
			}			
		}
		
		chain.doFilter(request, response);
		}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
