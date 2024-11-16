package SelectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TOoLearnSingleSelect
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");	
    WebElement monthDropdown= driver.findElement(By.id("month"));
    
    
	Select monthSelect=new Select(monthDropdown);
	//monthSelect.selectByIndex(5);
	//monthSelect.selectByValue("5");
	monthSelect.selectByVisibleText("Jun");
	
	
	
    WebElement yearDropdown= driver.findElement(By.id("year"));
	Select yearSelect= new Select(yearDropdown);
	//yearSelect.selectByVisibleText("1995");
    yearSelect.selectByIndex(5);
   // System.out.println(yearSelect.isMultiple()); //it is use only for multi select in single 
    // select it return false;
}
}
