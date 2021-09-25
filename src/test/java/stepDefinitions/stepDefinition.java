package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.base;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import PageObjects.LandingPage;
import PageObjects.LandingPage2;
import PageObjects.LoginPage;
import PageObjects.childWindow;

@RunWith(Cucumber.class)
public class stepDefinition extends base{
	
	 public static Logger log = LogManager.getLogger(base.class.getName());
	
	 
	 @Given("^Initialize the browser with chrome$")
	 public void initialize_the_browser_with_chrome() throws Throwable {
		 driver = initializeDriver();
		 driver.manage().window().maximize();
		 log.info("Driver is initialized");
		 		
	    }

	 @When("^User enters emailAddress and password and click on log in$")
	    public void user_enters_emailaddress_and_password_and_click_on_log_in() throws Throwable {
		 	
			LoginPage lp = new LoginPage(driver);
			prop = new Properties();
			FileInputStream fis = new FileInputStream(".\\data.properties");
			prop.load(fis);
			String email = prop.getProperty("emailAddress");
			String password = prop.getProperty("password");
			lp.getEmail().sendKeys(email);
			lp.getPassword().sendKeys(password);
			lp.getLogin().click();
	    }

	    @Then("^Verify that user is successfully logged in$")
	    public void verify_that_user_is_successfully_logged_in() throws Throwable {
	        log.error("Invalid Details! Unable to login");
	    }

	    @And("^Navigate to url site$")
	    public void navigate_to_url_site() throws Throwable {
	    	driver.get(prop.getProperty("url"));
	        log.info("Navigated to Home Page");
	    }

	    @And("^Click on Login icon in home page to land on Secure sign in page$")
	    public void click_on_login_icon_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getLogin().click();
			l.selectLogin().click();
			Thread.sleep(2000L);
			
			log.info("Navigated to Login Page");
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
			driver = null;
			
			log.info("Driver is closed successfully");
	    }
	    
	    @When("^the user clicks on view details of Mumbai Bandra Store$")
	    public void the_user_clicks_on_view_details_of_mumbaibandra_store() throws Throwable {
	    	LandingPage2 lp2 = new LandingPage2(driver);
			lp2.getStoreDetails().click();
	    }

	    @Then("^the detailed address of Bandra store is displayed along with google map$")
	    public void the_detailed_address_of_bandra_store_is_displayed_along_with_google_map() throws Throwable {
	    	LandingPage2 lp2 = new LandingPage2(driver);
	    	Assert.assertEquals(lp2.getTitle().getText(), "Urban Ladder Experience Centre - Bandra");
			
			log.info("Navigated to Urban Ladder Bandra Store page");
	    }

	    @And("^Click on stores$")
	    public void click_on_stores() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			/*Thread.sleep(1000L);
			l.closePopUp().click();*/
			l.getStores().click();
			log.info("Navigated to Stores page");
	    }
	    
	    @When("^the user clicks on Help$")
	    public void the_user_clicks_on_help() throws Throwable {
	    	LandingPage l =new LandingPage(driver);
			l.getHelp().click();
	    }

	    @Then("^then user should land on help page$")
	    public void then_user_should_land_on_help_page() throws Throwable {
	    	LandingPage2 lp = new LandingPage2(driver);
	        Assert.assertEquals(lp.TextValidate().getText(), "Help Center");
	        log.info("Successfully Landed on Help Page");
	    }

	    
	    @And("^clicks on Payments$")
	    public void clicks_on_payments() throws Throwable {
	        LandingPage2 lp = new LandingPage2(driver);
	        lp.payment().click();
	        Assert.assertEquals(lp.paymentValidate().getText(), "Payments");
	    }
	    
	    @When("^the user clicks on Decor$")
	    public void the_user_clicks_on_decor() throws Throwable {
	    	 LandingPage l =new LandingPage(driver);
	    	Thread.sleep(2000L);
	    	l.closePopUp();
	        l.getDecor().click();
	    }

	    @Then("^the user should land on decor page$")
	    public void the_user_should_land_on_decor_page() throws Throwable {
	    	LandingPage2 lp = new LandingPage2(driver);
	        Assert.assertEquals(lp.getDecorTitle().getText(), "Home Decor");
	    }

	    @And("^click on festive lights and verify festive lights page is open$")
	    public void click_on_festive_lights_and_verify_festive_lights_page_is_open() throws Throwable {
	    	LandingPage2 lp = new LandingPage2(driver);
	        lp.festiveLights().click();
	        Set<String> ids = driver.getWindowHandles();
			Iterator <String> it = ids.iterator();
			String parentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
			childWindow cw = new childWindow(driver);
			System.out.println("Moved to child window successfully");
			log.info("Moved to child window successfully");
			
			Assert.assertEquals(cw.getPageText().getText(), "Festive Lights");
			driver.switchTo().window(parentId);
			System.out.println("Switched back to parent window");
			log.info("Switched back to parent window");
	    }
	    
	    @When("^the user enters an invalid search item$")
	    public void the_user_enters_an_invalid_search_item() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.Search().click();
			String searchItem = prop.getProperty("searchItemInvalid");
			l.Search().sendKeys(searchItem);
			l.Search().sendKeys(Keys.ENTER);
	    }

	    @Then("^the page should display No Products Found$")
	    public void the_page_should_display_no_products_found() throws Throwable {
	        LandingPage2 lp = new LandingPage2(driver);
	        Assert.assertEquals(lp.getSearchText().getText(), "No products found");
	        System.out.println("No Products Found");
	        log.info("No products found! Search for a valid product");
	    }
	    
	    @When("^the user search a valid item$")
	    public void the_user_search_a_valid_item() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.Search().click();
			String searchItem = prop.getProperty("searchItemValid");
			l.Search().sendKeys(searchItem);
			l.Search().sendKeys(Keys.ENTER);
	    }

	    @Then("^the item should be added to wishlist$")
	    public void the_item_should_be_added_to_wishlist() throws Throwable {
	    	log.info("Successfully added to wishlist");
	    }

	    @And("^add it to the wishlist$")
	    public void add_it_to_the_wishlist() throws Throwable {
	    	LandingPage2 lp = new LandingPage2(driver);
			Actions a = new Actions(driver);
			a.moveToElement(lp.getItem());
			a.moveToElement(lp.AddToWishList()).click().build().perform();
	    }
	    
	    @When("^the user clicks on giftcards$")
	    public void the_user_clicks_on_giftcards() throws Throwable {
	        LandingPage l = new LandingPage(driver);
	        l.clickGiftCards().click();
	    }

	    @Then("^the user lands on giftcard page and selects House warming$")
	    public void the_user_lands_on_giftcard_page_and_selects_house_warming() throws Throwable {
	    	LandingPage2 lp = new LandingPage2(driver);
			Actions a = new Actions(driver);
			a.moveToElement(lp.selectCard());
			a.moveToElement(lp.choose()).click().build().perform();
			log.info("Selected the desired card");
	    }
	    @And("^fill the details and click on send$")
	    public void fill_the_details_and_click_on_send() throws Throwable {
	       LandingPage2 lp = new LandingPage2(driver);
	       String amount = prop.getProperty("amount");
	       lp.enterAmount().sendKeys(amount);
	       lp.selectMonth().click();
	       lp.selectMonth().sendKeys(Keys.DOWN);
	       lp.selectMonth().sendKeys(Keys.ENTER);
	       lp.selectDate().click();
	       lp.selectMonth().sendKeys(Keys.DOWN);
	       lp.selectMonth().sendKeys(Keys.DOWN);
	       lp.selectMonth().sendKeys(Keys.ENTER);
	       lp.clickNext().click();
	       
	       String recipientName = prop.getProperty("recipientName");
	       String recipientEmail = prop.getProperty("recipientEmail");
	       lp.recipientName().sendKeys(recipientName);
	       lp.getEmail().sendKeys(recipientEmail);
	       
	       String name = prop.getProperty("sender");
	       lp.fromName().sendKeys(name);
	       
	       String email = prop.getProperty("emailAddress");
	       lp.getMail().sendKeys(email);
	       
	       String num = prop.getProperty("phoneNum");
	       lp.getNum().sendKeys(num);
	       lp.confirm().click();
	       
	       log.info("Successfully sent the card");
	    }
	    
	    @When("^the user clicks on track orders$")
	    public void the_user_clicks_on_track_orders() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getTrackDetails().click();
			
			log.info("Navigated to track order page for filling the order details");

	    }

	    @Then("^the user is navigated to the page to fill order details$")
	    public void the_user_is_navigated_to_the_page_to_fill_order_details() throws Throwable {
	    	LandingPage2 lp2 = new LandingPage2(driver);
	    	String orderNo = prop.getProperty("orderNo");
			String phNo = prop.getProperty("phoneNum");
			lp2.getOrderNo().sendKeys(orderNo);
			lp2.getPhoneNo().sendKeys(phNo);
	    }

	    @And("^click on submit$")
	    public void click_on_submit() throws Throwable {
	        LandingPage2 lp = new LandingPage2(driver);
	        lp.Submit().click();
	    }
	    
	    @When("^the user clicks on view customer stories$")
	    public void the_user_clicks_on_view_customer_stories() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getCustomerStories().click();
	    }

	    @Then("^the user can view all the stories and can subscribe by giving email$")
	    public void the_user_can_view_all_the_stories_and_can_subscribe_by_giving_email() throws Throwable {
	        LandingPage2 lp = new LandingPage2(driver);
	        Assert.assertEquals(lp.verify().getText(),"Customer Stories");
	        String email = prop.getProperty("subscribeEmail");
			lp.EmailCustomerStories().sendKeys(email);
			lp.subscribe().click();
			
			log.info("Subscribed Successfully");
	    }
	    
	    @When("^user is on home page the page should diplay expected text$")
	    public void user_is_on_home_page_the_page_should_diplay_expected_text() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			
			log.error("An error occured : Unable to get the expected text");
			Assert.assertEquals(l.getTitle().getText(), "Explore Our Furniture Range1");
					
	    }






	}
	
	

