package PomDataDrivenTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PomLoginPage 
{
@FindBy(id="Email")
private WebElement emailTextField;

@FindBy(id = "Password")
private WebElement passwordTextField;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement loginButton;

 public  PomLoginPage(WebDriver driver)//initialization always done in constructor of page class
 {
	 PageFactory.initElements(driver, this);
	 
//->initelement is ststic method in page factory, this initelement will initialize all the 
//element present in the class, this init element takes two argument(driver ref var,this)
	 
//->this keyword- wants obj address of current page class, we are assigning driver ref 
// to the page class address so that all the element initialized with driver control
	 
//->we initialize with the help of driver without it we cant initialize
//(driver.findelement) is necessary we pass driver through caller(base class)to this page class
 }
public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginButton() {
	return loginButton;
}
 
}
