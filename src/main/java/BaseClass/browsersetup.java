package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsersetup {

	protected static WebDriver driver;
	
	public static WebDriver setup(String browsername, String url){
		if(browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else 
			if(browsername.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		}else 
			if(browsername.equalsIgnoreCase("ie")){
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
