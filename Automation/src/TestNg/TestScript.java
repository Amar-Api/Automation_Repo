package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
  @Test
  public void clickOnBook()
 {
	driver.findElement(By.partialLinkText("BOOKS")).click();
	String actualTitle= driver.getTitle();
	String expectedTitleString= workbook.getSheet("Books").getRow(1).getCell(0).getStringCellValue();
	if (actualTitle.equals(expectedTitleString))
	{
		Reporter.log("Books Page is Displayed",true);
	}
	else 
	{
		Reporter.log("Books Page is Not Displayed",true);
	}
}
}
