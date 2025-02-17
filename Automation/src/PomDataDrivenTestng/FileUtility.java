package PomDataDrivenTestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility
{
public String getDataFromProperty(String key) throws IOException

{
	FileInputStream fis= new FileInputStream("./testdata/webshop.properties");
	Properties prop= new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	
}

public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex) 
		throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream("./testdata/BOOKS.xlsx");
	Workbook wk= WorkbookFactory.create(fis);
	return wk.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
}
}
