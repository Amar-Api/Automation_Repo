package miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
  @FindBy(id = "products-orderby")
  private WebElement sortByDropdown;
  
  
  public BookPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }


public WebElement getSortByDropdown() {
	return sortByDropdown;
}



  
  
}
