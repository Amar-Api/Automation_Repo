package JavaScriptExecutor;

import java.time.Duration;

import org.bouncycastle.cert.crmf.jcajce.JceAsymmetricValueDecryptorGenerator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowscrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		
		  js.executeScript("window.scrollTo(0,500)"); 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,-500)"); 
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,500)"); 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,-500)");
		 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll till bottom of web page
		
	      Thread.sleep(3000);
		  js.executeScript("history.go()"); // refresh web page
		 
		 	}
}
