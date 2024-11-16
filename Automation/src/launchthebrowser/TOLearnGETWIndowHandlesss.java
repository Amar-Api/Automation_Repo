package launchthebrowser;

import java.util.Set;

import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOLearnGETWIndowHandlesss
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	Thread.sleep(5000);
	driver.findElement(By.id("browserButton3")).click();
	 Set<String> allWindowIds = driver.getWindowHandles();
	 System.out.println("allWindowIds");
	 for(String id: allWindowIds)
	 {
		 System.out.println(id);

	 }	
}
}
