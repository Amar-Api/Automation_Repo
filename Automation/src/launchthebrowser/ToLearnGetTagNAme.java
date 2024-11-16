package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagNAme 
{
public static void main(String[] args)
{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
String tagname= driver.findElement(By.linkText("Register")).getTagName();
 System.out.println(tagname);
 driver.close();
}

}