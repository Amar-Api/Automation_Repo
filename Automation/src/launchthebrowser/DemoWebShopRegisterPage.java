package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegisterPage 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("Amarjit");
	Thread.sleep(2000);
	driver.findElement(By.id("LastName")).sendKeys("Kumar");
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("amar1234@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("Amar1234");
	Thread.sleep(2000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Amar1234");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(4000);
	driver.close();
}
}
