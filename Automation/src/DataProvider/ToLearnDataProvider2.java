package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider2 
{
	
	@DataProvider
	public String[][] dataSender()
	
	{
		String [][] data= {{"admin","admin"},
				           {"admin","ad"},
				           {"ad","admin"},
				           {"ad","ad"}};
		return data;
	}
	
	
@Test(dataProvider = "dataSender")
public void loigin(String[] cred)

{
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://demoapp.skillrary.com/login.php?type=login");
    driver.findElement(By.id("email")).sendKeys(cred[0]);
    driver.findElement(By.id("password")).sendKeys(cred[1]);
    driver.quit();
    
    
}
}
