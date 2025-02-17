package selfstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartBuyProduct
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/search?q=iphone+15&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_2_na_na_na&as-pos=2&as-type=RECENT&suggestionId=iphone+15%7CMobiles&requestId=9a32b184-aceb-4a01-a1fb-50ba370c4e2d&as-searchtext=iphone+15&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D20000");
//		driver.findElement(By.xpath("//div[contains(@style,\"transform: translateX(47.362px);\")]"));
//		driver.findElement(By.xpath("//div[contains(@style,\"transform: translate(0px) scaleX(0.995);\")]"));
		WebElement dragElement1 = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		WebElement dragElement2 = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(dragElement1, 70, 0).perform();
		actions.dragAndDropBy(dragElement2, 112, 0).perform();
	}
}