package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/kumsu/OneDrive/Desktop/table.html");
	//String collection= driver.findElement(By.xpath("//td[text()='Puspa']/following-sibling::td[1]")).getText();
	//String collection= driver.findElement(By.xpath("//td[text()='Puspa']/preceding-sibling::td[1]")).getText();
	String collection= driver.findElement(By.xpath("//td[text()='Puspa']/following-sibling::td[2]")).getText();
	////td[text()='KGF']/ancestor::tbody/tr[2]/td[2] :-to take particular block
	System.out.println(collection);
}
}
