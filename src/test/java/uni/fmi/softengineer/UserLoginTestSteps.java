package uni.fmi.softengineer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.models.Gui;
import ui.models.LoginForm;

public class UserLoginTestSteps {

	private Gui gui;
	private LoginForm loginForm;

	@Given("^User is on gui$")
	public void User_is_on_gui() throws Throwable {
		gui = new Gui();

	}

	@Given("^Presses the login button$")
	public void Presses_the_login_button() throws Throwable {
		loginForm = gui.clickOnButton();

	}

	@Given("^Login pop up opens$")
	public void Login_popup_opens() throws Throwable {
		assertNotNull(loginForm);

	}

	@When("^Enters a valid username$")
	public void Enters_a_valid_username() throws Throwable {
		loginForm.addUsername("Username");

	}

	@When("^Enters a valid password$")
	public void Enters_a_valid_password() throws Throwable {
		loginForm.addPassword("Password");

	}

	@When("^Presses on the login button$")
	public void Presses_on_the_login_button() throws Throwable {
		loginForm.login();

	}

	@Then("^Shows a message \"([^\"]*)\"$")
	public void Shows_a_message(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginForm.getMessage());

	}

	@When("^Enters an invalid username$$")
	public void Enters_an_invalid_username() throws Throwable {
		loginForm.addUsername("Rwlfgdghgodh");

	}

	@When("^Enters an invalid password$")
	public void Enters_an_invalid_password() throws Throwable {
		loginForm.addPassword("dsfnjngkfdgdf");

	}

}
