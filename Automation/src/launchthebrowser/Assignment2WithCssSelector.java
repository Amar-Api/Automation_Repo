package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2WithCssSelector
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://demowebshop.tricentis.com");
	Thread.sleep(2000);
	driver.findElement(By.className("ico-login")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("abhinavanand099@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("abhinavanand");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	Thread.sleep(2000);
	driver.close();

}
}
