package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnCopyPaste
{
public static void main(String[] args)
{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://demowebshop.tricentis.com/register");
	   
	   WebElement firstNameTF= driver.findElement(By.id("FirstName"));
	   
	   Actions act= new Actions(driver);
	   act.sendKeys(firstNameTF, "John").perform();
	   
	   act.keyDown(Keys.CONTROL).keyDown("a").perform();
	   act.keyUp(Keys.CONTROL).keyUp("a").perform();
	   
	   act.keyDown(Keys.CONTROL).keyDown("c").perform();
	   act.keyUp(Keys.CONTROL).keyUp("c").perform();
	   
	   act.keyDown(Keys.TAB).perform();
	   act.keyUp(Keys.TAB).perform();
	   
	   act.keyDown(Keys.CONTROL).keyDown("v").perform();
	   act.keyUp(Keys.CONTROL).keyUp("v").perform();
	   
	   act.keyDown(Keys.TAB).perform();
	   act.keyUp(Keys.TAB).perform();
	   
	   
	   act.keyDown(Keys.CONTROL).keyDown("v").perform();
	   act.keyUp(Keys.CONTROL).keyUp("v").perform();
}
}
