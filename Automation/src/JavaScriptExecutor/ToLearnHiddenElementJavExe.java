package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class ToLearnHiddenElementJavExe 
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/reg");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement FirstTextField = driver.findElement(By.xpath("//input[@type='text'][1]"));
		js.executeScript("arguments[0].value='Amarjit'", FirstTextField);
		Thread.sleep(3000);
		WebElement genderTextField = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='Have a Good Day!!!'", genderTextField);
	}
}
