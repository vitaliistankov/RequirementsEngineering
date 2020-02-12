package uni.fmi.softengineer.models;

public class User {

	private String username;
	private String password;
	private int marks;
	private int duration;
	private String certifcation;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCertifcation() {
		return certifcation;
	}

	public void setCertifcation(String certifcation) {
		this.certifcation = certifcation;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	
	
}
