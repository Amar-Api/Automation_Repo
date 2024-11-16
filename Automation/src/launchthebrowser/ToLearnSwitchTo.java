package launchthebrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String>allwindowIds=driver.getWindowHandles();
		
	 for(String id:allwindowIds)
	 {
		System.out.println(id);
		driver.switchTo().window(id);
		driver.close();
	}

}
}
