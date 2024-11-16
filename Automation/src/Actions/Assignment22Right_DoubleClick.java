package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment22Right_DoubleClick 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.linkText("Right Click")).click();
	
	Actions act= new Actions(driver);
	WebElement rightClick= driver.findElement(By.id("btn30"));
	act.contextClick(rightClick).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	String succesMsg1= driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
	System.out.println("Captured Successful Messages is::::==>\n");
	System.out.println("1. Are you satisfied with the registration process?\n"+succesMsg1);
	
	
	WebElement msgColor1 =driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']"));
	String color1 =msgColor1.getCssValue("color");
	System.out.println("Captured Colour:::>"+color1);
	
	
	WebElement rightClick1= driver.findElement(By.id("btn31"));
	act.contextClick(rightClick1).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	String succesMsg2= driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
	System.out.println();
	System.out.println("2. Do you have any concerns about our registration process?\n"+succesMsg2);
	
	
	WebElement msgColor2 =driver.findElement(By.xpath("(//span[text()= 'You selected \"Yes\"'])[2]"));
	String color2 =msgColor2.getCssValue("color");
	System.out.println("Captured colour:::>"+color2);
	
	
	WebElement rightClick2= driver.findElement(By.id("btn32"));
	act.contextClick(rightClick2).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='1']")).click();
	String succesMsg3= driver.findElement(By.xpath("//span[text()='You selected \"1\"']")).getText();
	System.out.println();
	System.out.println("3. Rate us on the scale of 1 to 5\n"+succesMsg3);
	
	

    WebElement msgColor3 =driver.findElement(By.xpath("//span[text()='You selected \"1\"']"));
    String color3 =msgColor3.getCssValue("color");
    System.out.println("Captured colour:::>"+color3);
    
    driver.close();

	
}
}
