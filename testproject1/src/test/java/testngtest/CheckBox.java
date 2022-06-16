package testngtest;

import org.testng.annotations.Test;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBox extends WebDriverManager {
	WebDriver driver;
  @Test (priority=1,enabled=true)
  public void checkBoxclick() throws InterruptedException {
	  WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		inputForm.click();
		Thread.sleep(3000);
		
		 WebElement checkBoxDemo= driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a"));
			checkBoxDemo.click();
			Thread.sleep(3000);
			WebElement checkBoxDemoInput= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/label"));
			checkBoxDemoInput.click();
			Thread.sleep(3000);
			  WebElement message=driver.findElement(By.xpath("//*[@id=\"message-one\"]"));
			  message.getText();
			 
			  String check= message.getText();
            String [] arrsplit=check.split("-");
		 if(check.contains(arrsplit[0]) ) 
					  {
				  Assert.assertTrue(true);
				  System.out.println(arrsplit[0]);
			  }
			  else {
				  Assert.assertTrue(false,"entered text not found");
			  } }
	  
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  this.driver= launchBrowser("chrome","https://selenium.obsqurazone.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
