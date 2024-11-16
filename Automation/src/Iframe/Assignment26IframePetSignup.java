package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment26IframePetSignup
{
public static void main(String[] args) throws InterruptedException
{
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   
   
   driver.get("https://petdiseasealerts.org/forecast-map/#/");
   
    driver.switchTo().frame(1);
   //driver.switchTo().frame("map-instance-62920");
  //WebElement framElement= driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
 // driver.switchTo().frame(framElement);
   
    driver.findElement(By.id("region-27")).click();
   
   Thread.sleep(2000); 
   driver.switchTo().parentFrame();
   
   driver.findElement(By.xpath("//a[text()='Sign up']")).click();
   
   driver.findElement(By.id("user")).sendKeys("Amar263@gmail.com",Keys.ENTER);
   Thread.sleep(1000);
   driver.findElement(By.id("pass")).sendKeys("Amar123456",Keys.ENTER);
   Thread.sleep(1000);
   driver.findElement(By.id("cpass")).sendKeys("Amar123456",Keys.ENTER);
   Thread.sleep(1000);
   driver.findElement(By.id("firstName")).sendKeys("Amarjit",Keys.ENTER);
   Thread.sleep(1000);
   driver.findElement(By.id("lastName")).sendKeys("Kumar",Keys.ENTER);
   Thread.sleep(1000);
   driver.findElement(By.id("phone")).sendKeys("9678654406",Keys.ENTER);
   Thread.sleep(2000);
   
   
   WebElement dropDown = driver.findElement(By.id("user-type"));
   Select dropSelect= new Select(dropDown);
   dropSelect.selectByValue("3");
  
   
   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//button[@value='Register']")).click();
   String msg= driver.findElement(By.xpath("//b[text()='Thank you for registering!']")).getText();
  
   System.out.println("Message After Registration Page is:"+" " +msg);
   
   //String msg1= driver.findElement(By.xpath("//a[text()='Already have an account? ']")).getText();
  // System.out.println("if You Try 2nd time With Same Details" +msg1);
   
   
}
}
