package pagefactoryelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='collapsibleNavbar']/ul/li[2]/a")
	public WebElement inputform;

	@FindBy(id = "single-input-field")
	public WebElement enterMessage;

}
