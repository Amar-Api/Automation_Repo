package zMyPracticeCode;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySet
{

    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable

        // Configure the proxy settings
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("proxyserver:port"); // e.g., "127.0.0.1:8080"
        proxy.setSslProxy("proxyserver:port");  // Optional for HTTPS

        // Set the proxy to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setProxy(proxy);

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a URL
        driver.get("https://www.example.com");

        // Perform actions
        System.out.println("Page title is: " + driver.getTitle());

        // Quit the browser
        driver.quit();
    }

}
