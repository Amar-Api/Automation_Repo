package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClassSkillrary 
{
 public WebDriver driver;
 public Properties prop;
 
    @BeforeTest
    public void fetchData() throws IOException
    {
    	//property file
    	FileInputStream fis= new FileInputStream("./testdata/skillraryData.properties");
    	prop=new Properties();
    	prop.load(fis);
    }
    
    
    @BeforeClass
    public void launchBrowser()
    {
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	String url= prop.getProperty("Url");
    	driver.get(url);
    }
	
    
    @BeforeMethod
    public void login()
    {
    	String username = prop.getProperty("Username");
    	String password= prop.getProperty("Password");
    	
    	driver.findElement(By.linkText("LOGIN")).click();
    	driver.findElement(By.id("email")).sendKeys(username);
    	driver.findElement(By.id("password")).sendKeys(password);
    	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    	
    }
    
    
    @AfterMethod
    public void logout()
    {
    	driver.findElement(By.xpath("//span[contains(text(),'SkillRary Admin')]")).click();
    	driver.findElement(By.linkText("Sign out")).click();
    }
    
    
    @AfterClass
    public void closeBrowser()
    {
    	driver.quit();
    }
    
}

