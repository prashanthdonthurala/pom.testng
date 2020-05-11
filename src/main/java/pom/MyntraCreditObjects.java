package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyntraCreditObjects extends BaseClass {
	//myntracredit button
		@FindBy(xpath="//div[contains(text(),'Myntra Credit')]")
		 WebElement myntracredit;
		
		public void myntracreditbtn() {
			myntracredit.click();
		}
		
		public MyntraCreditObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//top up
		@FindBy(xpath="//div[contains(text(),'Top Up')]")
		WebElement tp;
		
		public void topup() {
			tp.click();
		}
		
		//terms& condtions
		@FindBy(xpath="//div[@class='myntracredit-leftButton']")
		WebElement tc;
		
		public void tclink() {
			tc.click();
		}
		
		//faqs
		@FindBy(xpath="//div[@class='myntracredit-rightButton']")
		WebElement faq;
		
		public void faqlink() {
			faq.click();
		}
}
