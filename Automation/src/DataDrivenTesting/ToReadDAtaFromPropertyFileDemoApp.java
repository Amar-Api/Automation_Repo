package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToReadDAtaFromPropertyFileDemoApp 
{
private static final CharSequence Email = null; 
private static final CharSequence Password = null;

public static void main(String[] args) throws IOException 
{
	// Step 1: craete object for FileInputStream
		FileInputStream fis= new FileInputStream("./testdata/commondata.properties");
		
		// Step 2: create respective file type object
		Properties prop= new Properties();
		
		// Step 3: Call read method
		prop.load(fis);
		String url= prop.getProperty("Url");
		String email= prop.getProperty("Email");
		String password= prop.getProperty("Password");
		
		System.out.println(url);
		System.out.println(password);
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));	
		
		
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
}
