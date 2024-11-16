package DataDrivenTesting;

import static org.testng.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	//step1: Create object for FileInputStream
	
	FileInputStream fis= new FileInputStream("./testdata/REGTESTDATA.xlsx");
	
	//Step2: create respective file type object
	
	Workbook workbook= WorkbookFactory.create(fis);
	
	//step3: Call read method.
	
	String url= workbook.getSheet("TESTDATA1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	
	String username= workbook.getSheet("TESTDATA1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(username);
	
	String password= workbook.getSheet("TESTDATA1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(password);
	
	double price= workbook.getSheet("TESTDATA1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
	
	boolean status= workbook.getSheet("TESTDATA1").getRow(1).getCell(4).getBooleanCellValue();
	System.out.println(status);
	
	LocalDateTime date= workbook.getSheet("TESTDATA1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	System.out.println(date);
	
	
	//SEPARATELY PRINTED
	Month month= date.getMonth();
	System.out.println(month);
	int day= date.getDayOfMonth();
	System.out.println(day);
	int year= date.getYear();
	System.out.println(year);
	int dayofyear= date.getDayOfYear();
	System.out.println(dayofyear);
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	
	
}
}
