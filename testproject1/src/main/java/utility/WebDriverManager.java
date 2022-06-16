package utility;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.common.io.Files;


public class WebDriverManager {
	public static WebDriver driver;
	public WebDriver launchBrowser (String browser,String url) {
		String browser1= browser.toLowerCase();
	
		switch (browser1) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "F:\\selenium\\IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver","F:\\selenium\\msedgedriver.exe");
			driver=new EdgeDriver();
			break;
			
		default:
			System.out.println("browser : " + browser+ " is invalid");
			
		}
	
		//driver.get("https://selenium.obsqurazone.com/index.php");
	

			driver.get(url);
			driver.manage().window().maximize();
			return driver;
			}
			public WebDriver implicitWait (int a) {
			driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
			return driver;
			}
			public WebDriver implicitWait (long a) {
				driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
				return driver;
	
		
			}
			
	public WebDriver getdriver() {		
		return  WebDriverManager.driver;
	}
public void click(By value) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(value).click();
		}

		public String getText(By value) throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(value).getText();}
		
		
		public WebElement menuList(int i) throws InterruptedException {
			
			return driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li["+i+"]/a"));
		}
public WebElement sideList(String a) throws InterruptedException {
			
	return driver.findElement(By.xpath("//*[contains(text(),'"+a+"')]"));

		}
		
public void alertcheck(String option,String text)
		{
		Alert objalert =driver.switchTo().alert();
		if(option.equals("dismiss"))
		{
		objalert.dismiss();
		}
		if(option.equals("accept"))
		{
		objalert.accept();
		}
		if(option.equals("text"))
		{
		objalert.sendKeys(text);
		objalert.accept();
		}
		}
public void Screenshot() throws IOException
{
	 

	String finaldate=java.time.Clock.systemUTC().instant().toString().replace(":", "_");
	
	TakesScreenshot scrShot = ((TakesScreenshot) driver);

	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

	File DestFile = new File("F:\\Screenshots\\ test"+finaldate+".png");

	Files.copy(SrcFile, DestFile);
}



public void highlightelement(By value) {

      WebElement ele = driver.findElement(value);
      JavascriptExecutor js = (JavascriptExecutor) driver;
//use executeScript() method and pass the arguments
//Here i pass values based on css style. Yellow background color with solid red color border.
      js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
}

}
		
		
