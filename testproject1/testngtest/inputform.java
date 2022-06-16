package testngtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class XpathTest extends WebDriverManager {
  @Test
  public void mainMenu(int i) {
	  driver.findelement(By.xpath(""));
	  obj.mainMenu();
	  
  }
  
  
  @Test
  public void sideMenu() {
	  driver.findelement(By.xpath(""));
	  obj.sideMenu();
	  
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  this.driver =launchBrowser("chrome");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
