package cars2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MercedesBenz
{
@Test(groups = "system")
public void launch()
{
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.mercedes-benz.com/en/");
	Reporter.log("mercedes-benz launched succesfully", true);
}
}
