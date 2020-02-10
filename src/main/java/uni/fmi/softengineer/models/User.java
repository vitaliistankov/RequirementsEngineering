package uni.fmi.softengineer.models;

public class User {

	private String username;
	private String password;
	private String certifcation;
	private float marks;

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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public boolean getResult() {
		if (this.marks < 60) {

			return false;
		} else {
			return true;
		}

	}
}
