package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WelcomePage
{
    
	//DECLARATION
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	
	@FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginlink;
	
	
	// INITIALIZATION  (Only Once)
	  public WelcomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
	  }
	
	  // GETTERS
	  public WebElement getRegisterlink()  //getRegisterlink is nonstatic method, so call it using ORV in TestScript
	  {
		  return registerlink;
	  }
	
	  public WebElement getLoginlink()
	  {
		  return loginlink;
	  }
	

}

