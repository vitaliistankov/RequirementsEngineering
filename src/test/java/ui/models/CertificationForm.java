package ui.models;

import uni.fmi.softengineer.db.CUDB;

public class CertificationForm {

	private String username;
	private String certification;
	private int marks;
	private int duration;
	private String message;

	public static final int DURATION = 45;
	public static final int MIN_MARKS = 60;
	public static final String CERTIFICATION = "Java";

	public void addUsername(String username) {
		this.username = username;
	}

	public void addMarks(int marks) {
		this.marks = marks;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public int getDuration() {
		return duration;
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

		boolean isCertified = false;

		if (marks >= MIN_MARKS && duration <= DURATION) {
			message = new CUDB().userCertified(username);
			isCertified = true;

		} else {

			message = "Try again";

		}
		return isCertified;

	}

	public Object getMessage() {
		return message;
	}

}
