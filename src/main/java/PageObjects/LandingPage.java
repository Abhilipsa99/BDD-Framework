package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	By login = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg");
	By selectLogin = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > ul > li:nth-child(1) > a");
	
	By study = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/span");
	By laptopTables = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/div/div/ul/li[1]/ul/li[4]/a");
	
	By navBar = By.xpath("//*[@id=\'topnav_wrapper\']");
	By Text = By.xpath("//*[@id=\"content\"]/div[3]/div/div[1]");
	By popUp = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	
	By stores = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	
	By trackOrder = By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[2]/a");
	
	By search = By.xpath("//input[@id='search']");
	
	By help = By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a");
	By helpBox = By.xpath("//input[@id='help-center-search-input']");
	
	By cashback = By.xpath("//*[@id=\"head-alert\"]/div/div/a/strong");
	
	By stories = By.cssSelector("#home > div.container > div.footer_wrapper.row.clearfix > div.center.testimonial-module > div.text-center.view-all > a");
	
	By decor = By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(6) > h4");
	
	By giftCard = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement selectLogin() {
		return driver.findElement(selectLogin);
	}
	
	public WebElement getStudyItem() {
		return driver.findElement(study);
	}
	
	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}
	
	public WebElement getLaptopTables() {
		return driver.findElement(laptopTables);
	}
	
	public WebElement getTitle() {
		return driver.findElement(Text);
	}
	
	public WebElement closePopUp() {
		return driver.findElement(popUp);
	}
	
	public WebElement getStores() {
		return driver.findElement(stores);
	}
	
	public WebElement getTrackDetails() {
		return driver.findElement(trackOrder);
	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement getHelp() {
		return driver.findElement(help);
	}
	
	public WebElement Problem() {
		return driver.findElement(helpBox);
	}
	
	public WebElement getCashBackDetails() {
		return driver.findElement(cashback);
	}
	
	public WebElement getCustomerStories() {
		return driver.findElement(stories);
	}
	
	public WebElement getDecor() {
		return driver.findElement(decor);
	}
	
	public WebElement clickGiftCards() {
		return driver.findElement(giftCard);
	}



}
