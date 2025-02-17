package miniProject;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnersImplementation.class)
public class TestScript3 extends BaseClass
{
	@Test
	public void addToCart()
	{
		hp=new HomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");
		hp.getAddToCartLink().click();
		 
		 
	}
   
}
