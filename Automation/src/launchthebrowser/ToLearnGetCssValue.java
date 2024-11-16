package launchthebrowser;

import org.bouncycastle.asn1.cmp.ErrorMsgContent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	//String color= driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
	//System.out.println(color);
	
	//other way to do the same...........//@
	
   WebElement errorMsg =driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
   
   String color = errorMsg.getCssValue("color");
   String fontSize = errorMsg.getCssValue("font-size");
   String fontFamily = errorMsg.getCssValue("font-family");
   
   System.out.println(color);
   System.out.println(fontSize);
   System.out.println(fontFamily);
   driver.close();
}
}


