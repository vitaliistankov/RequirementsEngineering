package uni.fmi.softengineer.db;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.softengineer.models.User;

public class CUDB {
	
	
		private List<User> certifiedUserDb;

		public CUDB() {
			certifiedUserDb = new ArrayList<User>();
			User user = new User();
			user.setMarks(60);
			user.setCertifcation("Java");
			certifiedUserDb.add(user);

		}

		public String userCertified(String username) {

			boolean userExists = certifiedUserDb.stream()
					.anyMatch(user -> user.getUsername().equals(username));
			return userExists ? "You have certified" : "Try again";
		}

}
