package ui.models;

import uni.fmi.softengineer.db.CUDB;
import uni.fmi.softengineer.models.User;

public class CertificationForm {

	private String username;
	private int marks;
	private int duration;
	private String message;
	
	//User user = new User();

	public static final int DURATION = 45;
	public static final int MIN_MARKS = 60;
	

	public void addUsername(String username) {
		this.username = username;
	}

	public void addMarks(int marks) {
		this.marks = marks;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public boolean passExam() {

		boolean isPassed = false;

		if (marks >= MIN_MARKS && duration <= DURATION) {
			message = new CUDB().userCertified(username);
			isPassed = true;

		} else {

			message = "You should meet the requirements to pass the exam!";

		}
		return isPassed;

	}
	
	

	public Object getMessage() {
		return message;
	}

}
