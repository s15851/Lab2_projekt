package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	private List<User> users = new ArrayList<>(480);

	public List<User> getUserList() {
		return users;
	}

	public void setUserList(List<User> userList) {
		this.users = userList;
	}

public UserList() {
	User userAdmin = new User();
	userAdmin.setName("admin");
	userAdmin.setPassword("admin");
	userAdmin.setEmail("admin@email.com");
	userAdmin.setUserType(UserType.valueOf("ADMIN"));
	users.add(userAdmin);
	User userPremium = new User();
	userPremium.setName("premium");
	userPremium.setPassword("premium");
	userPremium.setEmail("premium@email.com");
	userPremium.setUserType(UserType.valueOf("PREMIUM"));
	users.add(userPremium);	
	User user = new User();
	user.setName("user");
	user.setPassword("user");
	user.setEmail("user@email.com");
	user.setUserType(UserType.valueOf("REGULAR"));
	users.add(user);
	}

public List<User> getusers() {
	return users;
}

public void setusers(List<User> users) {
	this.users = users;
}
}

