package zMyPracticeCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTheElements {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://money.rediff.com/gainers");

		// number of rows
		List<WebElement> totalNumberOfRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Toatal number of rows = " + totalNumberOfRows.size());

		// number of columns
		List<WebElement> totalNumberOfColumns = driver
				.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("Toatal number of columns = " + totalNumberOfColumns.size());

		for (int i = 0; i <= totalNumberOfRows.size(); i++) {
			for (WebElement column : totalNumberOfColumns) {
				String colName = column.getText();

				// System.out.print(colName + "\t" + "\t" + "\t" + "\t");
				if (colName.contains("Company")) {
					System.out.print(colName + "\t" + "\t" + "\t" + "\t");

				} else if (colName.contains("Group")) {
					System.out.print(colName + "\t" + "\t" + "\t");

				}

				else if (colName.contains("Prev Close (Rs)")) {
					System.out.print(colName + "\t" + "\t" + "\t");

				} else if (colName.contains("Current Price (Rs)")) {
					System.out.print(colName + "\t" + "\t" + "\t");

				} else if (colName.contains("% Change")) {
					System.out.print(colName + "\t" + "\t" + "\t");

				} else if (colName.contains("Trade on Dhan")) {
					System.out.print(colName);

				}

			}

			System.out.println();
			System.out.println();

			for (int j = 1; j <= totalNumberOfRows.size(); j++) {
				for (int k = 1; k <= totalNumberOfColumns.size(); k++) {
					List<WebElement> data = driver
							.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + j + "]/td[" + k + "]"));
					for (WebElement names : data) {
						String all = names.getText();
						if (all.length() >= 8 && all.length() <= 15) {
							System.out.printf(all + "\t" + "\t" + "\t");
						} else if (all.length() <= 8) {
							System.out.printf(all + "\t" + "\t" + "\t" + "\t");

						} else {
							System.out.printf(all + "\t" + "\t");

						}

					}

				}
				System.out.println();
			}

		}

		driver.manage().window().minimize();
		driver.quit();
	}

}
