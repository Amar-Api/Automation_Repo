package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValueofRegister
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
	
	WebElement reg =driver.findElement(By.linkText("Register"));

	String color1 = reg.getCssValue("color");

    String fontSize = reg.getCssValue("font-size");
	String fontFamily = reg.getCssValue("font-family");
	   
	System.out.println(color1);
	System.out.println(fontSize);
	System.out.println(fontFamily);
    driver.close();

}
}












