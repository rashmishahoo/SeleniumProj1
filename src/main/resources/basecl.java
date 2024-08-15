


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class basecl {

	 public WebDriver driver;
	//browser invocation
	public WebDriver  initializeDriver() throws Exception {
	
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\folio 9480m\\selenium\\seleniumFramework\\src\\main\\java\\com\\test\\sel\\seleniumFramework\\data.properties");
		
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome") ) {
			
			
			driver = new ChromeDriver();
			
		}
	
		else {
			
			 driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}




	}


