package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement goodRadioButton =driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
    
	System.out.println("=======Before Checking=======");
    System.out.println(goodRadioButton.isSelected());
    Thread.sleep(3000);
    goodRadioButton.click();
    
    System.out.println("=======After Checking=======");
    System.out.println(goodRadioButton.isSelected());
    driver.close();
}

}

