package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenereImplementation2 implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestScript is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestScript is Failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestScript Is Skipped",true);


}
}