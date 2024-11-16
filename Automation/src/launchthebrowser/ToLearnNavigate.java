package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    Thread.sleep(3000);
    driver.navigate().refresh();
	
}
}
