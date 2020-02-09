package ui.models;

import uni.fmi.softengineer.db.DB;

public class LoginForm {
	
	private String username;
	private String password;
	private String message;

	public void addUsername(String username) {
		this.username=username;
	}

	public void addPassword(String password) {
		this.password=password;
		
	}

	public void login() {
		boolean isUsernameValid= null!=username && !"".equals(username);
		boolean isPasswordValid= null!=password && !"".equals(password);
		
		if(isUsernameValid && isPasswordValid) {
			message= new DB().login(username,password);
			
		}else {
			message= "Please fill up all obligatory fields";
		}
		
	}

	public Object getMessage() {
		return message;
	}


}
