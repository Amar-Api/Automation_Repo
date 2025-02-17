package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentWelcome 
{
//Declaration
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	//initialization
	public AssignmentWelcome(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }

	
	//getter
	
	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	
	
}
