package PomDataDrivenTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomePage {

	@FindBy(linkText = "Log out")  //declearation
	private WebElement logoutButtonElement;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLinksElement;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLinksElement;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCadrLink;
	
	

	public PomHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogoutButtonElement() {
		return logoutButtonElement;
	}

	public WebElement getBookLinksElement() {
		return bookLinksElement;
	}

	public WebElement getComputerLinksElement() {
		return computerLinksElement;
	}
	
	public WebElement getGiftCadrLink() {
		return giftCadrLink;
	}
	
}
