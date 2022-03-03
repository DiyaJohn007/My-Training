package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import Page.HomePageWebElements;

public class Home extends BaseClass{
	
	
	@Test(description="To verify Current URL and Expected URL")
	public void titleCheck() throws InterruptedException {
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://buffalocart.com/demo/crm/index.php/signin" );
	    Thread.sleep(5000);
	}
//	@Test(description="email verify")
//public void emailCheck() {
//	HomePageWebElements ele= new HomePageWebElements(driver);
//		ele.setEmail("hai");
//	}
	
}
