package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTestScriptDDTandPOM 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		// Step 1: craete object for FileInputStream and  loading properties file with file location
				FileInputStream fis= new FileInputStream("./testdata/webshop.properties");
				//FileInputStream obtains input bytes from a file
				
				// Step 2: create respective file type object
				Properties prop= new Properties();
				
				// Step 3: Call read method
				prop.load(fis);      //load()=>>Reads a property list (key and element pairs) from the inputbyte stream.
				String url= prop.getProperty("url");
				
				System.out.println(url);
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));	
				driver.get(url);
				
		
	    AssignmentWelcome  wp= new  AssignmentWelcome(driver); //WelcomePage  // getRegisterLink is a nonstatic method, so call using objrefvar 
		                                         // pageClass object Creation
		wp.getRegisterlink().click(); //calling getter method of register element
		
	     AssignmentRegister rp= new AssignmentRegister(driver); //Loginpage
		
	     
	     
	     FileInputStream fs=new FileInputStream("C:\\Users\\kumsu\\git\\repository3\\Automation\\testdata\\amardata.xlsx");
	 	Workbook wk= WorkbookFactory.create(fs);
	 	String firstname= wk.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	 	String lastname= wk.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	 	String email= wk.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	 	String password= wk.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	 	String conformpassword= wk.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	 	
	     
	 	System.out.println(firstname);
	    System.out.println(lastname);
	    System.out.println(email);
	    System.out.println(password);
	    System.out.println(conformpassword);
	    
	 	
	 	rp.getMaleradiobutton().click();
	 	rp.getFnametextfield().sendKeys(firstname);// for fetching element from POM
	 	Thread.sleep(2000);
	 	rp.getLnametextfield().sendKeys(lastname);
	 	Thread.sleep(2000);
	 	rp.getEmailtextfield().sendKeys(email);
	 	Thread.sleep(2000);
	 	//driver.findElement(By.id("Password")).sendKeys(password);
	 	rp.getPasswordtextfield().sendKeys(password);
	 	Thread.sleep(2000);
	 	//driver.findElement(By.id("ConfirmPassword")).sendKeys(conformpassword);
	 	rp.getCnfmpasswordtextfield().sendKeys(conformpassword);
	 	Thread.sleep(2000);
	 	//driver.findElement(By.id("register-button")).click();
	 	rp.getRegisterbutton().click();
	 	
	 	
	 	String actualText= rp.getResultfield().getText();
	 	if (actualText.equals("Your registration completed")) {
	 		System.out.println("user Registration Successfull");
			
		} else {
			System.out.println("User Failed to Register");

		}
		
}
}