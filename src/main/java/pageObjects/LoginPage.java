package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
//global variable
	public WebDriver driver;
	//public constructor
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By email =  By.xpath("//input[@id='user_email']");
	By password =  By.xpath("//input[@id='user_password']");
	By loginBtn =  By.xpath("//input[@name='commit']");
	
	
	public WebElement getLogin() {
		
		return driver.findElement(email);
	}
	
public WebElement getPassword() {
		
		return driver.findElement(password);
	}

public WebElement getloginBtn() {
	
	return driver.findElement(loginBtn);
}
	
	
}
