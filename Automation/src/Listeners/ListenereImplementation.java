package Listeners;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenereImplementation extends BaseClass implements ITestListener
{

//	@Override
//	public void onTestFailure(ITestResult result) 
//	{
//     
//		Reporter.log("Test Script is Failed", true);
//
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		Reporter.log("Test Script Is PAssed", true);
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		
//		Reporter.log("Test Script is Skipped",true);
//	}
//	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println(driver);
		String methodName = result.getName(); // result.getNAme()--give current Method Nmae..
		//String timeStamp= LocalDateTime.now().toString().replace(":", "_");
				
				
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		//File dest= new File("./TakeScreenshot/"+methodName+timeStamp+".png");
		File dest= new File("./TakeScreenshot/Listner.png");
		try {
			FileHandler.copy(temp, dest);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	
    
}
