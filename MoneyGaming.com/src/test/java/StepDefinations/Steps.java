package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.JoinNowPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps {


	public WebDriver driver;
	public JoinNowPage Jp;
	
	@Given("User Launch Chrome Brower")
	public void user_launch_chrome_brower() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\NewChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		Jp=new JoinNowPage(driver);
	
	}

	@When("User Opens moneygaming")
	public void user_opens_moneygaming() {
	driver.get("https://moneygaming.qa.gameaccount.com/");    
	}

	@Then("User Click on Join Now Link")
	public void user_click_on_join_now_link() throws InterruptedException {
	    Jp.Click_JoinNow();
	    Thread.sleep(3000);
	    
	}

	@Then("User Select Title Value from the dropdown")
	public void user_select_title_value_from_the_dropdown(WebElement DropDown) {
	    Jp.Select_DropDown();
	    
	}

	@Then("User Enter First Name and Surname")
	public void user_enter_first_name_and_surname(){
	    Jp.EnterFirstName();
	    Jp.EnterSurName();
	}

	@Then("User Click the Tickbox")
	public void user_click_the_tickbox() throws InterruptedException{
		
		Thread.sleep(3000);
		Jp.ClickCheckBox();
	}
	

	@When("User Click Join Now Link")
	public void user_click_join_now_link() {
	    Jp.Click_JoinNow();
	}

	@Then("Page message Should be Field is required under Date of Birth Box")
	public void page_message_should_be_field_is_required_under_date_of_birth_box(String string) {
	   if (driver.getPageSource().contains("This field is required")) {
		   driver.close();
		   Assert.assertTrue(false);}
		   
		   else {
		Assert.assertEquals("This field is required", driver.getTitle());
		}
		   
	}

	@Then("Close Brower")
	public void close_brower() {
		
		driver.quit();
		
	    
	}


	
	
	
	
}
