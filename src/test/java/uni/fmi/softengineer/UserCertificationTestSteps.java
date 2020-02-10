package uni.fmi.softengineer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.models.CertificationForm;
import ui.models.ExamHomeScreen;
import uni.fmi.softengineer.models.User;

public class UserCertificationTestSteps {

	// private User user = new User();
	private ExamHomeScreen examHomeScreen;
	private CertificationForm certificationForm;

	@Given("^User is on ExamHomeScreen$") 
	public void User_is_on_ExamHomeScreen() throws Throwable {
		examHomeScreen = new ExamHomeScreen();
	}
	

	@Given("^Presses the start button$")
	public void Presses_the_start_button() throws Throwable {
		certificationForm = examHomeScreen.clickOnButton();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Given("^that the user(.*)is given to pass(.*)certification test$") public
	 * void certificationName(String username, String certification) throws
	 * Throwable { user.setUsername(username); user.setCertifcation(certification);
	 * }
	 * 
	 * @When("^(.*) got (\\d+) marks in exam") public void gotMarks(String username,
	 * float marks) throws Throwable { user.setUsername(username);
	 * user.setMarks(marks); }
	 * 
	 * @Then("^(.*) becomes as (.*)certified$") public void cerrtifiedYes(String
	 * username, String certification) throws Throwable {
	 * 
	 * assertThat(username, is(user.getUsername()));
	 * assertThat(user.getCertifcation(), equalTo("Java"));
	 * assertThat(user.getResult(), is(true)); }
	 */
}
