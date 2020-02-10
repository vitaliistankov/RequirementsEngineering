package uni.fmi.softengineer.db;

import java.util.ArrayList;
import java.util.List;
import uni.fmi.softengineer.models.User;

public class DB {
	private List<User> userDb;

	public DB() {
		userDb = new ArrayList<User>();
		User user = new User();
		user.setUsername("Username");
		user.setPassword("Password");
		userDb.add(user);

	}

	public String login(String username, String password) {

		boolean userExists = userDb.stream()
				.anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
		return userExists ? "You have logged into the system" : "Invalid data";
	}

}
