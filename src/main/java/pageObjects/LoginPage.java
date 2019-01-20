package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By username = By.xpath("//*[@id='content']/div/div/h2");
	By password = By.xpath("//ul[contains(@class,'navbar')]");
			

//	public LandingPage(WebDriver driver) {
//		
//		this.driver=driver;
//	}


	public WebElement getLogin()  { return driver.findElement(signin);   }
	public WebElement getUsername()  { return driver.findElement(username);    }
	public WebElement getPassword() {	return driver.findElement(password);	 }
	

}
