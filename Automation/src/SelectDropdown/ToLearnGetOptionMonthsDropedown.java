package SelectDropdown;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptionMonthsDropedown 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
	WebElement monthDropdown= driver.findElement(By.id("month"));
	
	Select monthSelect = new Select(monthDropdown);
	

	List<WebElement> allOptions=monthSelect.getOptions();
	System.out.println(allOptions.size());
	
	for (WebElement ele: allOptions) 
	{
		monthSelect.selectByVisibleText(ele.getText());
		Thread.sleep(1000);
		if (ele.isSelected())
		{
			System.out.println(ele.getText() +":::::::=>Selected");
		}
	    
	}
	
	// Using for loop.....
	
	/* for (int i = 0; i < allOptions.size(); i++)
	 {
		monthSelect.selectByIndex(i);
		
		String text= allOptions.get(i).getText();
	monthSelect.selectByVisibleText(text);
	} */
	
}
}
