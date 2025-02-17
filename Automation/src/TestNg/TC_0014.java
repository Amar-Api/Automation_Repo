package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_0014 extends BaseClass2
{
@Test(groups = "system")
public void clickOnElectronics()
{
	driver.findElement(By.linkText("ELECTRONICS")).click();
	Reporter.log("Electronics Page is Displayed",true);
}

}
