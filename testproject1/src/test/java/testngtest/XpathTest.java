package testngtest;

import org.testng.annotations.Test;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class XpathTest extends WebDriverManager {
	WebDriver driver;
	 
	
  @Test
  public void xpathCheck() throws InterruptedException {
	  
	  menuList(2).click();
	  Thread.sleep(3000);
	  sideList("Checkbox Demo").click();
	  Thread.sleep(3000);
	  
  }
	 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  this.driver= launchBrowser("CHrome","https://selenium.obsqurazone.com/index.php");
	   }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
