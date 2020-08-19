package com.orbitz.stepDefs;



import org.junit.Assert;

import com.orbitz.pages.HomePage;
import com.orbitz.utilities.BrowserUtilities;
import com.orbitz.utilities.ConfigReader;
import com.orbitz.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinitions {

	@Given("I am on home page")
	public void iAmOnHomePage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@Given("I click on Account button")
	public void iClickOnAccountButton() {
	   HomePage hp = new HomePage();
	   hp.accountButton.click();
	}

	@Given("I click on Sign In button")
	public void iClickOnSignInButton() {
		HomePage hp = new HomePage();
		hp.signInButton.click();
	}

	@When("I type in random username and no password")
	public void iTypeInRandomUsernameAndNoPassword() {
		HomePage hp = new HomePage();
		BrowserUtilities.waitFor(5);
		hp.emailInputField.sendKeys("catboo@hotmail.com");
		
	}

	@When("I click on Sign In button again")
	public void iClickOnSignInButtonAgain() {
		HomePage hp = new HomePage();
		hp.accSignInButton.click();
	}
	
	@Then("I should see an error message")
	public void iShouldSeeAnErrorMessage() {
		HomePage hp = new HomePage();
		BrowserUtilities.waitFor(5);
	    String expectedMessage = "Please enter a password";
	    String actualMessage = hp.passErrorMessage.getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    
	}
	
	
	
	
	
}
