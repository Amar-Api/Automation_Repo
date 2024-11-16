package SelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetFirstSelectedOption
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement priceListBox= driver.findElement(By.id("cars"));
	Select priceSelect = new Select(priceListBox);
	priceSelect.selectByIndex(2);
	priceSelect.selectByIndex(0);
	priceSelect.selectByIndex(1);
	
	WebElement selectedOption= priceSelect.getFirstSelectedOption();
	System.out.println(selectedOption.getText());
	
	
	List<WebElement>  allSelectedOption= priceSelect.getAllSelectedOptions();
	System.out.println(allSelectedOption.size());
	for (WebElement webElement : allSelectedOption) 
	{
		System.out.println(webElement.getText());
	}
}
}
