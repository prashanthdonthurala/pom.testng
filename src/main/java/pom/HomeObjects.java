package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public  class HomeObjects extends BaseClass	{
	
	Actions a;
	@FindBy(xpath="//span[contains(text(),'Profile')]")
	WebElement pf;
	
	public void profile() {
		a = new Actions(driver);
		a.moveToElement(pf).perform();
	}
	
	public HomeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Saved cards
	@FindBy(xpath="//div[contains(text(),'Saved Cards')]")
	WebElement card;
	
	public void savedcards() {
		card.click();
	}
	}