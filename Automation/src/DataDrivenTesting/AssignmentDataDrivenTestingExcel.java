package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDataDrivenTestingExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
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
    
    WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	
	
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(conformpassword);
	
	
}
}
