package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation3  implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script Passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script is Failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script Skipped",true);
	}

}
