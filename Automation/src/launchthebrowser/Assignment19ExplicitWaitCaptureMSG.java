package launchthebrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment19ExplicitWaitCaptureMSG 
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']")).click();

driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();


WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
String msg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='The product has been added to your ']"))).getText();

System.out.println("Pop Up Message is:"+" " +msg);
Thread.sleep(4000);
driver.findElement(By.linkText("Log in")).click();

}
}
