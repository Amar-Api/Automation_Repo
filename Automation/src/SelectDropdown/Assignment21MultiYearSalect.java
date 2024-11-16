package SelectDropdown;

import java.nio.channels.Channels;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.StackManipulation.Size;

public class Assignment21MultiYearSalect 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
    WebElement yearDropdown= driver.findElement(By.id("year"));
    
    
    Select yearSelect= new Select(yearDropdown);
    
    List<WebElement> allOptions= yearSelect.getOptions();
    System.out.println("Total Years is::::-->"+allOptions.size());
    
    
  
 /*    for (int i = 0; i < allOptions.size(); i++)
	 {
		yearSelect.selectByIndex(i);
		
		String text= allOptions.get(i).getText();
	yearSelect.selectByVisibleText(text);
	System.out.println(text);
	} 
    System.out.println("last option in year dropdown is:" +allOptions.get(allOptions.size()-1).getText());
 */
   
    for (WebElement ele : allOptions)
    {
    	
		yearSelect.selectByVisibleText(ele.getText());
    
     if (ele.isSelected()) 
        {
    	 System.out.println(ele.getText() +":::::::=>Selected");
    	 
	    }
    }
 System.out.println("last option in year dropdown is:" +allOptions.get(allOptions.size()-1).getText());
   
  }
 }


