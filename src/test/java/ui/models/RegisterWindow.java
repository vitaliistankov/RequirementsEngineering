package ui.models;

public class RegisterWindow {
	
	RegisterForm registerForm;
	private String errorMessage;

	public boolean clickRegisterButton() {
		
		return true;
	}

	public boolean IsRegisterFormVisible() {
		registerForm=new RegisterForm();
		return registerForm.show();
	}
	
	public void addUsername(String username) {
		if(username.length()<=3) {
			errorMessage = "invalid username!";
		}else {
			registerForm.addUsername(username);
		}
	}
	
	public String getStateMessage() {
		
		return errorMessage !=null ? errorMessage : registerForm.getSubmitMessage();
		
	}
	
	public void addPassword(String password) {
		
		if (password.length()<=3) {
			errorMessage = "Invalid password!";
		}else {
			registerForm.addPassword(password);
		}
		
	}


}
