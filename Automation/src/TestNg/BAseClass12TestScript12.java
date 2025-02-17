package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BAseClass12TestScript12 extends BaseClass12

{
@Test
public void clickOnBook()
{
	driver.findElement(By.partialLinkText("BOOKS")).click();
	String actualTitle= driver.getTitle();
	
	if (actualTitle.equals("Demo Web Shop. Books"))
	{
	 Reporter.log("Book Page Is displayed",true);	
	 
	}else {
		Reporter.log("Book Page is Not displayed",true);
	}
}
}
