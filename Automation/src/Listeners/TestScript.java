package Listeners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenereImplementation.class)
public class TestScript {
	@Test

	public void login() {
		Reporter.log("Launch the browser", true);
		Reporter.log("Navigate To Url", true);
		Reporter.log("Click on login", true);
		Reporter.log("Enter Valid Credentials", true);
		Reporter.log("Click on Login Button", true);
		//Assert.assertEquals(true, true);
		Assert.assertEquals(true, false);

	}
}
