package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class NavigationBarValidation extends Base{
	public static Logger log = LogManager.getLogger(NavigationBarValidation.class.getName());
	public WebDriver driver;
	@BeforeMethod
	public void configMethod() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test()
	public void getTitleValidation() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.isNavBarVisible().isDisplayed());
		log.info("inside navigation bar validation test and it is visible");
		
	}
	
	
	
	
	@AfterMethod
	public void closeDown() {
		
		driver.close();
}	
}
