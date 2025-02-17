//package zMyPracticeCode;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Iterator;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import GenericUtility.BaseClass;
//import Objectrepositary.RegistrationPage1;
//import net.bytebuddy.asm.Advice.Argument;
//
//public class CompanyCode extends BaseClass
//{
//	
//
//	
//
//	@Test
//
//	       public void register() throws IOException, InterruptedException {
//
//			rp = new RegistrationPage1(driver);
//			// JavascriptExecutor js=(JavascriptExecutor) driver;
//			// js.executeScript("Argument[0].", k);
//
//			rp.getRegisterNameTextField().sendKeys(futil.getDataFromProperties("Name"));
//			;
//
//			rp.getRegisterEmailTextField().sendKeys(futil.getDataFromProperties("Email"));
//
//			rp.getRegisterPasswordTextField().sendKeys(futil.getDataFromProperties("Password"));
//
//			rp.getSelectCountry().click();
//
//			Thread.sleep(2000);
//
//			
//			WebElement sk = rp.getSearchCountryName();
//			sk.sendKeys(futil.getDataFromProperties("Search"));
//
//			Actions act = new Actions(driver);
//			act.keyDown(Keys.ARROW_DOWN).perform();
//			Thread.sleep(1000);
//			act.keyDown(Keys.ARROW_DOWN).perform();
//			Thread.sleep(1000);
//			act.keyDown(Keys.ENTER).perform();
//			
//			 rp.getPhoneNumberTextfield().sendKeys(futil.getDataFromProperties("PhoneNumber"));
//			 
//			 Thread.sleep(3000);
//			 
//			 
//		      
//			 
//			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//			 
//			 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(rp.getRecaptcha()));
//			
//			   WebElement robot = wait.until(ExpectedConditions.elementToBeClickable(rp.getIamnotrobot()));
//			   robot.click();
//			 
//			
//			 }
//
//			
//
//		}
//}
