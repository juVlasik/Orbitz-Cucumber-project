package com.orbitz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orbitz.utilities.Driver;



public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath = "//button[@id='header-account-menu']")
	public WebElement accountButton;
	
	@FindBy (id = "header-account-signin-button")
	public WebElement signInButton;
	
	@FindBy (id = "login-form-email-label")
	public WebElement emailInputField;
	
	@FindBy (xpath = "//input[@id='gss-signin-password']")
	public WebElement passwordInputField;
	
	@FindBy (xpath = "(//button[@class='btn-primary btn-action gss-col-12'])[2]")
	public WebElement accSignInButton;
	
	@FindBy (xpath = "//p[@id='signInPasswordErrorMessage']")
	public WebElement passErrorMessage;
	
	
}
