

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppHomePage {
	WebDriver driver;
	

	public AppHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@id ='search-courses']")
	WebElement searchbox;
	
	

	public WebElement search() {
		// TODO Auto-generated method stub
		return searchbox;
	}
	
}
