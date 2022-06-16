package testngtest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class titleVerfication extends WebDriverManager {
	
	WebDriver driver;
  @Test(priority=1,enabled=true)
  public void titlecheck() {
	  String titleexpected ="Obsqura Testing";
		String titleactual = driver.getTitle();
		/*if(titleexpected.equals(titleactual)) {
			
			System.out.println("Test passed");
		}else {
			
			System.out.println("Testfailed");
		}*/
		Assert.assertEquals(titleactual, titleexpected);
		System.out.println("passed title check");
  }
  
  @Test(priority=2)
  public void urlcheck() {
	  String urlexpected ="https://selenium.obsqurazone.com/index.php";
		String urlactual = driver.getCurrentUrl();
		/*if(urlexpected.equals(urlactual)) {
			
			System.out.println("Test passed for url");
		}else {
			
			System.out.println("Test failed for url");
		}*/
		SoftAssert objassert=new SoftAssert();
		objassert.assertEquals(urlactual, urlexpected);
		objassert.assertAll();
		System.out.println("passed url check");
		
		
  }
  
  @Parameters({"Browser","Url"})
  @BeforeTest
  public void beforeTest(String Browser, String Url) {	  
		
//	 this.driver= launchBrowser("chrome","https://selenium.obsqurazone.com/index.php");
	  
	  this.driver= launchBrowser(Browser,Url);
  }

//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
