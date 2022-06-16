package testngtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.WebDriverManager;

public class popupwindow {
	public class PopupWindow extends WebDriverManager {
		WebDriver driver;

		@Test(priority = 1, enabled = true)
		public void popupTest() throws InterruptedException {
		WebElement click1 = driver.findElement(By.linkText("Click Here"));
		click1.click();
		Thread.sleep(3000);
		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
		String ChildWindow = i1.next();

		if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

		// Switching to Child window
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

		driver.findElement(By.name("btnLogin")).click();

		// Closing the Child Window.
		driver.close();
		}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
		}

		@BeforeTest
		public void beforeTest() {
		this.driver = launchBrowser("chrome", "http://demo.guru99.com/popup.php");
		}

		@AfterTest
		public void afterTest() {
		driver.close();
		}}}

		

