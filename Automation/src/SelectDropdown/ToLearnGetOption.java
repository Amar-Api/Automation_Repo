package SelectDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement priceListBox= driver.findElement(By.id("cars"));
	Select priceSelect = new Select(priceListBox);
	
	List<WebElement> allOptions=priceSelect.getOptions();
	System.out.println(allOptions.size());
	
	for (WebElement ele: allOptions) 
	{
		System.out.println(ele.getText());
	}
}
}
