package javatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initialTestCase {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		String titleexpected ="Obsqura Testing";
		String titleactual = driver.getTitle();
		if(titleexpected.equals(titleactual)) {
			
			System.out.println("Test passed");
		}else {
			
			System.out.println("Test failed");
		}

		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
