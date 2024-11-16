package launchthebrowser;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.StackManipulation.Size;

public class Assignment16AbhiBusLowPrice 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Hyderabad", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@type='checkbox']")).click();
		//List<WebElement> count = driver.findElements(By.tagName("h5"));
		//int busCount = count.size();
		//System.out.println("Bus Count is:" + busCount);
		System.out.println( driver.findElements(By.tagName("h5")).size());
		Thread.sleep(2000);
		
		
		List<WebElement> price = driver.findElements(By.xpath("//strong[@class='h5 fare']"));

		TreeSet<String> priceValueSet = new TreeSet<String>();

		
		for (WebElement ele : price)
		{
          System.out.println(ele.getText().replace(",","")); //adding fair from AbhiBus web site
		  
		  priceValueSet.add(ele.getText().replace(",", "")); //arranging in ascending order
		}
		
		
		System.out.println("\nMinimum Bus Fair is:");
		System.out.println(priceValueSet.last());
		System.out.println("Maximum Bus Fair is:");
		System.out.println(priceValueSet.first());
		driver.close();
		
		
		
		
		
		

//   String[] busPrice= {"1,280","1,280","880"};
//   Arrays.sort(busPrice);
//   System.out.println(Arrays.toString(busPrice));
	}
}
