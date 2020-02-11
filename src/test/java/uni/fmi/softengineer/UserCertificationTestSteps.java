package uni.fmi.softengineer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
	private User user;

	@Given("^User is on ExamHomeScreen$")
	public void User_is_on_ExamHomeScreen() throws Throwable {
		examHomeScreen = new ExamHomeScreen();
	}

	@Given("^Presses the start button$")
	public void Presses_the_start_button() throws Throwable {
		certificationForm = examHomeScreen.clickOnButton();

	}

	@Given("^Timer is started$")
	public void Timer_is_started() throws Throwable {
		assertNotNull(certificationForm);

	}

	@When("^Passes exam within requred duration$")
	public void Passes_exam_within_requred_duration() throws Throwable {
		certificationForm.setDuration(10);
	}

	@When("^Passes exam getting requred number of marks$")
	public void Passes_exam_getting_requred_number_of_marks() throws Throwable {
		certificationForm.setMarks(100);
	}
	
	@When("^Not passes exam within requred duration$")
	public void Not_passes_exam_within_requred_duration() throws Throwable {
		certificationForm.setDuration(100);
	}
	
	@When("^Not passes exam within requred number of marks$")
	public void Not_passes_exam_within_requred_number_of_marks() throws Throwable {
		certificationForm.setMarks(5);
	}
	
	/*
	 * @Then("^Shows a message \"([^\"]*)\"$") public void Shows_a_message(String
	 * expectedMessage) throws Throwable { assertEquals(expectedMessage,
	 * certificationForm.getMessage());
	 * 
	 * }
	 */
	

	

	// @When("^Passes exam within duration")

	/*
	 * @When("^(.*) got (\\d+) marks in exam") public void gotMarks(String username,
	 * float marks) throws Throwable { user.setUsername(username);
	 * user.setMarks(marks);
	 * 
	 * }
	 */

	/*
	 * @Then("^(.*) becomes as (.*)certified$") public void cerrtifiedYes(String
	 * username, String certification) throws Throwable { assertThat(username,
	 * is(user.getUsername())); assertThat(user.getCertifcation(), equalTo("Java"));
	 * assertThat(user.getResults(), is(true)); }
	 */

}
