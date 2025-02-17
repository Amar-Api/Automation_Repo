package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStoregeClass {
	@DataProvider(parallel = true)
	public String[][] dataSender()

	{
		String[][] data = { { "abhis1234@gmail.com", "abhis@1234" }, { "abhis1234@gmail.com", "abhis@12" },
				{ "his1234@gmail.com", "abhis@1234" }, { "his1234@gmail.com", "abhi" } };
		return data;
	}

}
