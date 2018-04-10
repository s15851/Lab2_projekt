package web.filters;

import java.io.IOException;

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
import model.UserType;

@WebFilter("premium")
public class PremiumFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();

		if(session.getAttribute("currentUser")==null) {			
			response.getWriter().print("You are not logged");
			return;
		}

		User user = (User) session.getAttribute("currentUser");
		if (user.getUserType() == UserType.valueOf("PREMIUM") || 
		    user.getUserType() == UserType.valueOf("ADMIN")) {
			chain.doFilter(request, response);
		}
		else {
			response.getWriter().print("You are not authorized for this site");
		}	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
