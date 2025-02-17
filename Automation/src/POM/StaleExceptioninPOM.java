package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleExceptioninPOM {

	//declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTF;
	
	
	//Initiallization
	public StaleExceptioninPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getter
	
	public WebElement getSearchTF() {
		return searchTF;
	}
	
	
	
}
