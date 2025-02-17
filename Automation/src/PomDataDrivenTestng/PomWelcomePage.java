package PomDataDrivenTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class PomWelcomePage 
{
@FindBy(linkText = "Log in")
private WebElement loginLink;

@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement shoppingCartLink;

public PomWelcomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}


}
