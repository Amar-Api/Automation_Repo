package miniProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomDataDrivenTestng.PomLoginPage;

public class BaseClass {

	public static WebDriver driver;
	public FileUtility fUtil = new FileUtility();

	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	public BookPage bp;

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String url = fUtil.getDataFromProperty("url");
		driver.get(url);
	}

	@BeforeMethod

	public void logIn() throws IOException {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		lp = new LoginPage(driver);
		// LoginPage lp= new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
	    lp.getLoginButton().click();
	}

	@AfterMethod

	public void logOut() {
		hp = new HomePage(driver);
		hp.getLogoutButton().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

}
