package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	//@Parameters("Browser")
	@BeforeTest
	public void bc_config()
	{
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
			//WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	@AfterTest
	public void ac_config()
	{
		driver.close();
	}

	
	
}
