package zMyPracticeCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoperstack 
{
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/");

	Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[text()='ROADSTER']/../../..//button[@type='button']")).click();
	driver.findElement(By.xpath("(//button[@type=\"button\"])[10]")).click();
    driver.findElement(By.id("Email")).sendKeys("akshay12@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("Amarjit123");
    Thread.sleep(5000);
    driver.findElement(By.className("MuiButton-label")).click();
    
    Thread.sleep(5000);
    TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./TakeScreenshot/"+"Shoperstack.png");
	FileHandler.copy(temp, dest);
	driver.close();
}
}
