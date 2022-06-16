package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.WebDriverManager;

public class DropDown extends WebDriverManager {
	WebDriver driver;

	@Test
	public void dropdown() throws InterruptedException {
	WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	inputForm.click();
	Thread.sleep(3000);
	WebElement selectinput = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
	selectinput.click();
	Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.id("single-input-field"));
	Select objdrop = new Select(dropdown);
	// objdrop.selectByValue("Green");
	// Thread.sleep(3000);
	// objdrop.selectByVisibleText("Yellow");
	// Thread.sleep(3000);
	/*for(int i=1 ; i<=4 ; i++) {
	objdrop.selectByIndex(i);
	Thread.sleep(3000);
	}*/
	int arr[]= {1,2,3};
	for(int i:arr) {
		objdrop.selectByIndex(i);
		Thread.sleep(3000);
		
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

