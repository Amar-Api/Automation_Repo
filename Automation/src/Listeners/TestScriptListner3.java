package Listeners;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


@Listeners(ListnerImplementation3.class)
public class TestScriptListner3 
{
@Test
 public void login()
{
	Reporter.log("Open Browser",true);
	Reporter.log("NAvigate to URl",true);
	Reporter.log("Click on Login Link",true);
	Reporter.log("Enter Valid Credential",true);
	Reporter.log("click on login link",true);
}
}
