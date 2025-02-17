package miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopsLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement addToCartLink;



	public HomePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}
	
	
    public WebElement getDesktopsLink() {
		return desktopsLink;
	}



	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
	public WebElement getAddToCartLink() {
		return addToCartLink;
	}
	
	
	
	
}
