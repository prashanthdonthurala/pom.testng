package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCardObjects {
	
	
	public AddCardObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Add Card Button
	@FindBy(xpath="//div[@class='addSavedCard-addButton']")
	WebElement addcard;
	
	public void addcardbutton() {
		addcard.click();
	}
	
	//card number field
	@FindBy(xpath="//label[contains(text(),'Card Number *')]")
	WebElement number;
	
	public void cardnumber(String num) {
		
		number.sendKeys(num);
	}
	
	//card name field
	@FindBy(xpath="//label[contains(text(),'Card Name *')]")
	WebElement name;
	
    public void cardname(String nam) {
    	name.sendKeys(nam);
	}
    
    //expiry month field
    @FindBy(xpath="//label[contains(text(),'Expiry Month')]")
    WebElement month;
    
    public void expirymonth() {
    	Select s = new Select(month);
    	s.selectByIndex(9);
    }  
    
    //Expiry Year
    @FindBy(xpath="//label[contains(text(),'Expiry Year')]")
    WebElement year;
    
    public void expiryyear() {
    	Select s1 = new Select(year); 
    	s1.selectByIndex(2);
    }
    
    //save card
    @FindBy(xpath="//div[@class='savedCardsForm-submitButton']")
    WebElement save;
    
    public void savecard() {
    	save.click();
    }
}
