package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginObjects extends BaseClass {
	
	public LoginObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "desktop-linkButton")
	 WebElement login;
	public void loginsignup() {
		login.click();
	}
	
	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	WebElement phonenumber;
	
	public void phonenumber() 
	{
		long i = System.currentTimeMillis()/1000;
//		System.out.println(num);
		String a=String.valueOf(i);
		System.out.println(a);
		phonenumber.sendKeys(a);
	}
	
	@FindBy(xpath = "//div[@class='submitBottomOption']")
	WebElement continuebtn;
	public void continuee() 
	{
		continuebtn.click();
	}
//	driver.findElement(By.xpath("//div[contains(text(),'Log in using')]")).click();
	
	@FindBy(xpath="//div[contains(text(),'Log in using')]")
	WebElement otp;
	public void otp() {
		otp.click();
	}
	//mobile number field
	@FindBy(id = "mobileNumberPass")
	WebElement num;

	public void enterNumber(String mail) {
		num.sendKeys(mail);
	}
	
	public void clearEnterNumer() {
		num.clear();
	}
	
	//password field
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement pass;
	
	public void password(String password) {
		pass.sendKeys(password);
	}	
	
	//login button
	@FindBy(xpath="//button[text()='LOGIN']") 
	WebElement log;
	
	public void loginToMyntra() {
		log.click();
	}
}
