package miniProject;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementation extends BaseClass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Script Passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
	String timestamp= LocalDateTime.now().toString().replace(":", "_");
	
	Reporter.log("Test Script Failed",true);
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File temp= ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./TakeScreenshot/"+timestamp+"miniproj.png");
	
	try {
		org.openqa.selenium.io.FileHandler.copy(temp,dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Script Skipped",true);
	}

}
