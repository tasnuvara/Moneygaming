package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JoinNowPage {

	public WebDriver ldriver;
	
	public JoinNowPage(WebDriver rdriver) {
		
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[2]/div[1]/div[2]/div[1]/a[2]")
	WebElement lnkJoinNow;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	WebElement dDown;
	
	@FindBy(xpath="//*[@id=\"forename\"]")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id=\"signupForm\"]/fieldset[1]/input[2]")
	WebElement SurName;
	
	@FindBy(xpath="//*[@id=\"checkbox\"]")
	WebElement ChkBox;
	
	
	public void Click_JoinNow() {
		
		lnkJoinNow.click();}
		
		
	public void Select_DropDown() {
		Select select =new Select(dDown);
	    select.selectByIndex(0);
			dDown.click();
		}
	public void EnterFirstName() {
		
	FirstName.clear();
	FirstName.sendKeys("Tasnuva");
		}

	public void EnterSurName() {
		
		SurName.clear();
		SurName.sendKeys("Rahman");
		}
	public void ClickCheckBox() {
		
		ChkBox.click();
	}
}
