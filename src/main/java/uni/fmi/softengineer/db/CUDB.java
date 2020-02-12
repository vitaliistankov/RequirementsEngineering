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
			user.setDuration(45);
			//user.setCertifcation("Java");
			certifiedUserDb.add(user);

		}

		public String userCertified(String username) {

			boolean userCertified = certifiedUserDb.stream()
					.anyMatch(user -> user.getUsername().equals(username));
			return userCertified ? "You have been certified" : "You should pass the exam to get certified";
		}

}
