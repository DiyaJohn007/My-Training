//package Page;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//public class HomePageWebElements {
//
//  WebDriver driver;
//  
//  @FindBy(how=How.NAME,using="email")
//  WebElement emaill;
//
//  public HomePageWebElements(WebDriver driver){
//	  this.driver=driver;
//	  PageFactory.initElements(driver, this);
//	  
//  }
//  public void setEmail(String em) {
//	  emaill.sendKeys(em);
//  }
//  
//}
//
