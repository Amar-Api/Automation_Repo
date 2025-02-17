package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_0012 extends BaseClass2 {
	@Test(groups = "smoke")
	public void clickOnBook() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("Books page is Displayed", true);
		
		driver.findElement(By.linkText("COMPUTERS")).click();
		Reporter.log("computer page is Displayed", true);
	}

//@Test
//public void clickOnComputer()
//{
//	driver.findElement(By.linkText("COMPUTERS")).click();
//	Reporter.log("Computer Page is Displayed",true);
//}
}
