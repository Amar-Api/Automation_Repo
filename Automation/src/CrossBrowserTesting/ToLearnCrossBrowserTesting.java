package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToLearnCrossBrowserTesting 
{
public WebDriver driver;

//@Parameters("Browser")    //=========>>>1)  it work from suite files
@Test


public void launch(@Optional("chrome") String browsername)  // to execute CrossBrowserTesting direct 
                                                             // from here we use @Optional("chrome"), from it
// we pass different different browser name like firefox,edge etc in place of "chrome"



//public void launch(String browsername)  //========>>>2)   it run from suite

 {
	if( browsername.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if (browsername.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	else if (browsername.equals("edge"))
	{
	 driver= new EdgeDriver();	
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
}
}
