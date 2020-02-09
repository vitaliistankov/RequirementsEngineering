package uni.fmi.softengineer.db;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.softengineer.models.Toy;
import uni.fmi.softengineer.models.User;

public class DB {
	private List <User> userDb;
	private List <Toy> toyDb;
	
	public DB() {
		userDb = new ArrayList<User>();
		User user = new User();
		user.setUsername("Username");
		user.setPassword("Password");
		userDb.add(user);
				
		toyDb = new ArrayList<Toy>();
		Toy toy = new Toy();
		toy.setName("Transformer");
		toyDb.add(toy);
		
		
	}
public String login(String username, String password) {
		
		boolean userExists= userDb.stream()
				.anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
		return userExists ? "You eneterd to the system" : "Invalid data";
	}

}
