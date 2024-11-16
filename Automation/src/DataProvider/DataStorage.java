package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage
{
	 @DataProvider
	   public String[][] loginData()
	{
		       String data[][]= {
				{"admin","admin"},
				{"ad","admin"},
				{"admin","adm"},
				{"ad","ad"},
		      };
		       
		return data;
		       
	 }
	 
	 @DataProvider
	 public String[][] ragisterData()
	   {
		 String registerData[][]= {
				 
				 { "John", "Smith","john123@gmail.com","john@1234","john@1234"},
				 {"Gohn", "Smith","gohn123@gmail.com","gohn@1234","gohn@1234"},
				 {"Kohn", "Smith","kohn123@gmail.com","kohn@1234","kohn@1234"},
				 {"Aohn", "Smith","aohn123@gmail.com","aohn@1234","aohn@1234"}
		 };
		 
		return registerData;
		 
	   }
	
}
