package ui.models;

public class RegisterForm {
	
	private String password;
	private String username;
	private boolean isDataSubmitted;

	public void addPassword(String password) {
		this.password= password;
		
	}

	public boolean show() {
		
		return true;
	}

	public void addUsername(String username) {
		this.username = username;
		
	}

	public String getSubmitMessage() {
		
		return isDataSubmitted ? "Bravo!!!" : "The data is not valid";
	}

}
