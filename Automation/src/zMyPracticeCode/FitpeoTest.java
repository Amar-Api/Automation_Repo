//package zMyPracticeCode;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import BaseClass.BaseClass1;
//import pom.RevenueCalculator;
//
//public class FitpeoTest extends BaseClass1 {
//
//	@Test
//
//	public void Fitpeo() throws InterruptedException {
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		RevenueCalculator rc = new RevenueCalculator(driver);
//		rc.getRevenuelink().click();
//
//		Actions ac = new Actions(driver);
//		ac.scrollToElement(rc.getSlider()).perform();
//
//		js.executeScript("arguments[0].scrollIntoView(false)", rc.getSlider());
//		// task 4
//		// WebElement revenueCalculatorSlider =
//		// driver.findElement(By.cssSelector("input[type=\"range\"]"));
//		for (;;) {
//			if (rc.getRevenuecalculaterslider().getAttribute("value").contains("820"))
//				break;
//			else
//				rc.getRevenuecalculaterslider().sendKeys(Keys.ARROW_RIGHT);
//		}
//		// task 5
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].value='560'", rc.getRevenuecalculaterscheckbox());
//
//		// Task 6
//
//		if (rc.getRevenuecalculaterscheckbox().getAttribute("value").contains("560")) {
//			Reporter.log("Text field value and slider value are same", true);
//		} else {
//			Reporter.log("Text field value and slider value are not same ", true);
//		}
//		// wait.until(ExpectedConditions.attributeToBe(rc.getAdjustslider(),
//		// "type=\"range\"", "820"));
//
//		int[] cpt = { 99091, 99453, 99454, 99474 };
//		for (int valueCPT : cpt) // task 7
//		{
//
//			rc.getCheckbox().click();
//
//		}
//	}
//
//}
//
//
