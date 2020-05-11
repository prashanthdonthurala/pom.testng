package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyPersonalCareObjects extends BaseClass {
	Actions a;
	
	//personal care and grooming link
	@FindBy(xpath="//a[contains(text(),'Personal Care & Grooming')]")
	WebElement personal;	
	
	public void personalpage() {
		personal.click();
	}
	
	public MyPersonalCareObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//perform on product
	@FindBy(xpath="//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[contains(@class,'row-base')]/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[1]/a[1]/div[1]/div[1]")
	WebElement item;
	
	public void product() {
		a = new Actions(driver);
		a.moveToElement(item).perform();
	}
	
	//add to bag
			@FindBy(xpath="//li[1]//div[4]//span[1]//span[1]")
			WebElement bagbtn;
			
			public void bag() {
				bagbtn.click();
			}
			
			//product size
			@FindBy(xpath="//div[@class='product-sizeDisplayDiv product-showSizeDisplayDiv']//button[@class='product-sizeButton'][contains(text(),'Onesize')]")
			WebElement itemsize;
			
			public void size() {
				itemsize.click();
			}
}
