package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LogInPage 
{

	//1 DECLARATION
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(name="Password")
	private WebElement passwordTextField;
	
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	
	
	//2 INITIALIZATION  (Only Once)
	public  LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3 Getter method
	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}
	
	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}
	
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
}

