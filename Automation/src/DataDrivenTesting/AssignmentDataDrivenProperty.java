package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDataDrivenProperty {
	public static void main(String[] args) throws IOException
	{
		// Step 1: craete object for FileInputStream and  loading properties file with file location
		FileInputStream fis= new FileInputStream("./testdata/webshop.properties");
		//FileInputStream obtains input bytes from a file
		
		// Step 2: create respective file type object
		Properties prop= new Properties();
		
		// Step 3: Call read method
		prop.load(fis);      //load()=>>Reads a property list (key and element pairs) from the inputbyte stream.
		String url= prop.getProperty("Url");
		
		System.out.println(url);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));	
		driver.get(url);
		
		
}
}