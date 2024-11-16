package launchthebrowser;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyselfPractice
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dunzo.com/bangalore");
	Thread.sleep(3000);
	//driver.findElement(By.linkText("Search")).click();
	driver.findElement(By.xpath("//p[text()='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search for item ')]")).sendKeys("mango");
}

}
