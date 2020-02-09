import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.models.Gui;
import ui.models.RegisterWindow;

public class UserRegisterTestSteps {
	
RegisterWindow window = new RegisterWindow();
	
	@Given("^User will push registartion button$")
	public void user_will_push_registartion_button() throws Throwable {
		
		window.clickRegisterButton();
	   
	}

	@Given("^registration form will show$")
	public void registration_form_will_show() throws Throwable {
		
		assertTrue(window.IsRegisterFormVisible());
	   
	}

	@When("^User will enter invalid name \"([^\"]*)\"$")
	public void user_will_enter_invalid_name(String username) throws Throwable {
		
		window.addUsername(username);
	   
	}

	@Then("^Will see a message \"([^\"]*)\"$")
	public void will_see_a_message(String arg1) throws Throwable {
		
		assertEquals(arg1, window.getStateMessage());
	  
	}
	
	@When("^User will enter invalid password \"([^\"]*)\"$")
	public void user_will_enter_invalid_password(String password) throws Throwable {
		
		window.addPassword(password);
	

}

}
