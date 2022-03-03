package Test;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public Properties properties;

	public WebDriver initializeDriver() throws IOException {
		
		properties = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\config\\properties\\config.properties";
		FileInputStream fileInput = new FileInputStream(path);
		properties.load(fileInput);
		
		String browserName = properties.getProperty("browser");
		System.out.println("Browser is" + browserName);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			String chromepath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeMethod
	public void setUpTest() throws InterruptedException, IOException {
		System.out.println("before method");
		driver = initializeDriver();
		driver.get(properties.getProperty("url"));

		Thread.sleep(5000);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
		driver.quit();
	}

}

