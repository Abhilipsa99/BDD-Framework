package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childWindow {
	
	public WebDriver driver;
	public childWindow(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By festiveLightText = By.cssSelector("#content > h1");
	
	
	
	public WebElement getPageText() {
		return driver.findElement(festiveLightText);
	}
	
	

}
