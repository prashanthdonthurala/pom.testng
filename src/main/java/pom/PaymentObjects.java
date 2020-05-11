package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PaymentObjects extends BaseClass {
	
	//cvv number
	@FindBy(xpath="//input[@id='cvvcard0']")
	WebElement cvvnum;
	
	public void cvv(String cvv) {
		cvvnum.sendKeys(cvv);
	}
	
	public PaymentObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='action-savedinstrument']")
	WebElement paybtn;
	
	public void paynow() {
		paybtn.click();
	}
	
}
