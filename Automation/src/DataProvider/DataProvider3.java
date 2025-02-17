package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {
	// @DataProvider(parallel = true)
//	public String[][] dataSender()
//	
//	{
//		String [][] data= {{"abhis1234@gmail.com","abhis@1234"},
//				           {"abhis1234@gmail.com","abhis@12"},
//				           {"his1234@gmail.com","abhis@1234"},
//				           {"his1234@gmail.com","abhi"}};
//		return data;
//	}

	@Test(dataProviderClass = DataStoregeClass.class, dataProvider = "dataSender") // here dataSender storing all values of
																				// string[][]data;
	public void loigin(String[] cred) throws InterruptedException // in string[] we are passing one
	// single single value so, we are taking 1D array

// dataProviderClass = DataStorage.class:= fetching data from DAtaStorage Class
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
