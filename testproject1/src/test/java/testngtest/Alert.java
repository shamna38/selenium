package testngtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.WebDriverManager;

	  public class Alert extends WebDriverManager {
		  WebDriver driver;
		  By alert = By.xpath("//*[@id=\"alert-modal\"]");
		  By javascriptalert = By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[5]/a");
		  By button = By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/button");
		  By clickMe =By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/p[4]/button");
		  By message=By.xpath("//*[@id=\"confirm-demo\"]");
		  By clickPrompt=By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/button");
		  By promptmessage=By.xpath("//*[@id=\"prompt-demo\"]");
		 
		 @Test(priority=1,enabled=true)
		  public void alertTest2() throws InterruptedException {
			 click(alert);
			 click(javascriptalert);
			 click(button);
			 Thread.sleep(2000);
			 alertcheck("accept","");
		
			 Thread.sleep(4000);
			 click(clickMe);
			 Thread.sleep(3000);
			 alertcheck("accept","");
			 
			String displayedtxtValue=getText(message);
			if(displayedtxtValue.contains("Cancel"))
			{
			Assert.assertTrue(true);
			}
			else
			{
			Assert.assertFalse(false, "Cancel not done");
			}
			 
			  }
			 
			 
		 
			  @Test(priority=2,enabled=true)
			  public void alertTest3() throws InterruptedException {
				  
				    
				  click(clickPrompt);
				  Thread.sleep(3000);
				  
				  Thread.sleep(3000);
				  alertcheck("text","Hello");

				
				  String displaytxtValue=getText(promptmessage);
				  System.out.println(displaytxtValue);
				  String check= getText(promptmessage);
		            String [] arrsplit=check.split("'");
				 if(check.contains(arrsplit[1]) ) 
							  {
						  Assert.assertTrue(true);
						  System.out.println(arrsplit[1]);
					  }
					  else {
						  Assert.assertTrue(false,"entered text not found");
					  }
				  
				   }
				 
				
				
			  
	 @BeforeTest
	  public void beforeTest() {
		  this.driver= launchBrowser("chrome","https://selenium.obsqurazone.com/index.php");
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
}
