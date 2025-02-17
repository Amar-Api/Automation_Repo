package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_0015 extends BaseClass2
{
@Test(groups = "system")
public void clickOnGiftCards()
{
	driver.findElement(By.linkText("GIFT CARDS")).click();
	Reporter.log("Gift Cards Page is Displayed",true);
}
}
