package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenereImplementation2.class)
public class TestScript3 
{
	@Test

	public void login() {
		Reporter.log("Open the browser", true);
		Reporter.log("Navigate To Url", true);
		Reporter.log("Click on login", true);
		Reporter.log("Enter Valid Credentials", true);
		Reporter.log("Click on Login Button", true);
		//Assert.assertEquals(true, true);
		//Assert.assertEquals(true, false);
}
}