package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraCreditTopup {
	
	//Amount button
	@FindBy(xpath="//div[@class='topupWithoutCoupon-selectionAmount']//div[1]//span[1]")
	WebElement amountbtn;
	
	public void amount() {
		amountbtn.click();
	}
	
	public MyntraCreditTopup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='topupWithoutCoupon-topUpButton']")
	WebElement topupbtn;
	
	public void topUp() {
		topupbtn.click();
	}
}
