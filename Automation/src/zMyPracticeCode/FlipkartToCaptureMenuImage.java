//package zMyPracticeCode;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.openqa.selenium.Utils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FlipkartToCaptureMenuImage 
//{
//
//
//	public static void main(String[] args) throws IOException {
//	String timestamp = LocalDateTime.now().toString().replace(":", "-");
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//   driver.get("https://www.flipkart.com");
//	List<WebElement> image = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/a//img"));
//	List<WebElement> tagname = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/a//span/span"));
//	List<WebElement> image1 = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/div//img"));
//	List<WebElement> tagname1 = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/div//span/span"));
//	
//	for (int i=0; i<=image.size()-1; i++) {
//		    WebElement screenshot = image.get(i);
//		    String textelement = tagname.get(i).getText();
//			File tempScreenShot =screenshot.getScreenshotAs(OutputType.FILE);
//			File logo = new File("./TakeScreenshot/"+textelement+timestamp+".png");
//		//	FileUtils.copyFile(tempScreenShot, logo);
//	}	
//	for (int i=0; i<=image1.size()-1; i++) {
//	    WebElement screenshot = image1.get(i);
//	    String textelement = tagname1.get(i).getText();
//		File tempScreenShot =screenshot.getScreenshotAs(OutputType.FILE);
//		File logo = new File("./TakeScreenshot/"+textelement+timestamp+".png");
//	//	FileUtils.copyFile(tempScreenShot, logo);
//}	
//	driver.manage().window().minimize();
//	driver.quit();
//	}
//
//}
//
