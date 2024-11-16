package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment30UploadFile
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	
	
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	Actions act= new Actions(driver);
	Thread.sleep(3000);
	act.scrollByAmount(0, 350).perform();
	driver.findElement(By.className("main-2")).click();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\TestingEngg Notes\\✨❣️.pdf");
}
}
