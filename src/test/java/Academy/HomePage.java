package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
public WebDriver driver;
	@BeforeMethod
	public void configMethod() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@Test(dataProvider = "getData")
	public void navigationDemo(String username, String password) throws InterruptedException{
		
		
		LandingPage l = new LandingPage(driver);
		l.getSignin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getLogin().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getloginBtn().click();
		log.info("Inside the homepage class and it is working fine");
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = new Object[2][2];
		
		data[0][0] = "hi@dd.com";
		data[0][1] = "qwert";
		
		data[1][0] = "Hellow@dd.com";
		data[1][1] = "asdfg";
		
		//data[2][0] = "Yellow@dd.com";
		//data[2][1] = "zxcvbg";
		
		
		
		return data;
		
		
	}
	
	
	@AfterMethod
	public void closeDown() {
		
		driver.close();
}
	
	
		
	
	
}
