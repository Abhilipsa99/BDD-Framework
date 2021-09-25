package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage2 {
	
	public WebDriver driver;
	public LandingPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	By viewDetails = By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[2]/div[2]/button");
	By text = By.xpath("//*[@id=\'store-details\']/h1");
	
	
	By helpTest = By.xpath("//*[@id=\"content\"]/div[1]/h1");
	By payment = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[5]/a");
	By paymentText = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/span");
	
	By decorText = By.xpath("//*[@id=\"content\"]/h1");
	By festiveLights = By.cssSelector("img[alt='Festive Lights Design']");
	
	By invalidSearch = By.xpath("//*[@id=\"search-results\"]/div[3]");
	
	By item = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[29]");
	By addWishList = By.cssSelector("#search-results > div:nth-child(3) > ul > li:nth-child(29) > div > div.wishproduct.dwishblock.authentication_popup.login-link > span.icofont.icofont-heart_outline_thick.dwishicon.authentication_popup.login-link");
	
	By selectCard = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[2]");
	By choose = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[2]/div/div/button");
	
	By amount = By.xpath("//input[@id='ip_2251506436']");
	By month = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[1]");
	By date = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[2]");
	By next = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button");
	By recipient = By .xpath("//input[@id='ip_4036288348']");
	By email = By.xpath("//input[@id='ip_137656023']");
	By from = By.xpath("//*[@id=\"ip_1082986083\"]");
	By mail = By.xpath("//*[@id=\"ip_4081352456\"]");
	By num = By.xpath("//*[@id=\"ip_2121573464\"]");
	By confirm = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[3]/form/button");
	
	By orderNo = By.xpath("//input[@id='ip_379403698']");
	By phoneNo = By.xpath("//*[@id=\"ip_394711104\"]");
	By submit = By.cssSelector("#app-container > div > main > section > form.awunb > button");
	
	By pageVerify = By.xpath("//*[@id=\"content\"]/h1");
	By email2 = By.xpath("//input[@id='email_id']");
	By subscribe = By.xpath("//input[@value='SUBSCRIBE']");
	
	public WebElement getStoreDetails() {
		return driver.findElement(viewDetails);
	}
	
	public WebElement getTitle() {
		return driver.findElement(text);
	}
	
	public WebElement TextValidate() {
		return driver.findElement(helpTest);
	}
	public WebElement payment() {
		return driver.findElement(payment);
	}
	public WebElement paymentValidate() {
		return driver.findElement(paymentText);
	}
	public WebElement getDecorTitle() {
		return driver.findElement(decorText);
	}
	public WebElement festiveLights() {
		return driver.findElement(festiveLights);
	}
	
	public WebElement getSearchText() {
		return driver.findElement(invalidSearch);
	}
	public WebElement getItem() {
		return driver.findElement(item);
	}
	public WebElement AddToWishList() {
		return driver.findElement(addWishList);
	}
	public WebElement selectCard() {
		return driver.findElement(selectCard);
	}
	public WebElement choose() {
		return driver.findElement(choose);
	}
	public WebElement enterAmount() {
		return driver.findElement(amount);
	}
	public WebElement selectMonth() {
		return driver.findElement(month);
	}
	public WebElement selectDate() {
		return driver.findElement(date);
	}
	public WebElement clickNext() {
		return driver.findElement(next);
	}
	public WebElement recipientName() {
		return driver.findElement(recipient);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement fromName() {
		return driver.findElement(from);
	}
	public WebElement getMail() {
		return driver.findElement(mail);
	}
	public WebElement getNum() {
		return driver.findElement(num);
	}
	public WebElement confirm() {
		return driver.findElement(confirm);
	}
	public WebElement getOrderNo( ) {
		return driver.findElement(orderNo);
	}
	
	public WebElement getPhoneNo() {
		return driver.findElement(phoneNo);
	}
	public WebElement Submit() {
		return driver.findElement(submit);
	}
	public WebElement verify() {
		return driver.findElement(pageVerify);
	}
	
	public WebElement EmailCustomerStories() {
		return driver.findElement(email2);
	}
	public WebElement subscribe() {
		return driver.findElement(subscribe);
	}
}
