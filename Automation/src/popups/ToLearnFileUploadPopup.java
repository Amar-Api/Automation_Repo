package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnFileUploadPopup 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://www.freshersworld.com/user/register?src=homeheader");
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\TestingEngg Notes\\5_6208348232498545190.pdf");
}
}
;