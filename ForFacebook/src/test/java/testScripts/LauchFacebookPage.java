package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.IPathConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LauchFacebookPage extends BaseClass {

	@Test
	public static void main() {
		
		driver.get(IPathConstant.facebookurl);
		String at=driver.getTitle();
		String et="Facebook – log in or sign up";
		Assert.assertEquals(et, at);
	}
	
	
}
