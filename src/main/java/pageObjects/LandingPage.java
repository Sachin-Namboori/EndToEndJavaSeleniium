package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
//global variable
	public WebDriver driver;
	//public constructor
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	private By signin =  By.xpath("//span[contains(text(),'Login')]");
	private By title = By.xpath("//h2[text()='Featured Courses']");
	private By navBarValidation = By.xpath("//div[@role='navigation']");
	
	
	public WebElement getSignin() {
		
		return driver.findElement(signin);
	}
	
	public WebElement getTitles() {
		return driver.findElement(title);
	}
	
	public WebElement isNavBarVisible() {
		
		return driver.findElement(navBarValidation);
	}
	
}
