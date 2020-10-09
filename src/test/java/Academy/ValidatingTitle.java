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

public class ValidatingTitle extends Base{

	public static Logger log = LogManager.getLogger(ValidatingTitle.class.getName());
	public WebDriver driver;
	@BeforeMethod
	public void configMethod() throws IOException, InterruptedException {
		driver = initializeDriver();
		log.info("Inside Before Method: Intialization is complete");
		
		driver.get(prop.getProperty("url"));
		log.info("Inside Before Method: Navigated to URL");
	}
	
	@Test()
	public void getTitleValidation() throws IOException, InterruptedException {
		
		LandingPage l = new LandingPage(driver);
		Thread.sleep(3000);
		Assert.assertEquals(l.getTitles().getText(), "FEATURED COURSES");
		log.info("Inside getTitleValidation Test: Successfully validated title");
	
	}
	
	
	@AfterMethod
	public void closeDown() {
		
		driver.close();
}	
	
	
	
	
	
	
	
	
	
}
