package TestNg ;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestNg.BaseClass2;

public class TC_0013 extends BaseClass2
{
	@Test(groups = "smoke")
	public void clickOnComputer()
	{
	driver.findElement(By.linkText("COMPUTERS")).click();
		Reporter.log("Computer Page is Displayed",true);
	}
	

}
