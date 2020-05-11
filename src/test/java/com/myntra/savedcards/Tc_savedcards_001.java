package com.myntra.savedcards;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.AddCardObjects;
import pom.HomeObjects;
import pom.LoginObjects;


public class Tc_savedcards_001 extends BaseClass {
	
	 HomeObjects h;
	 LoginObjects l;
	 AddCardObjects ad;
	 WebDriver driver;
	
	@Test
	public void addCard() throws InterruptedException, EncryptedDocumentException, IOException {
		
		WebDriver driver=BaseClass.openBrowser("chrome");
		
	    h = new HomeObjects(driver);
		
		h.profile();
		
		l = new LoginObjects(driver);
		l.loginsignup();
		
		l.phonenumber();
		l.continuee();
		Thread.sleep(3000);
		l.otp();
		Thread.sleep(2000);
		l.clearEnterNumer();
		
    	String mail = getExcelData("F:\\loginurl.xlsx.xlsx", "Sheet1", 1, 0);
		
		l.enterNumber(mail);
		
		String password = getExcelData("F:\\loginurl.xlsx.xlsx","Sheet1", 1, 1);
		l.password(password);
		Thread.sleep(2000);
		
		l.loginToMyntra();
	    Thread.sleep(5000);
	    
	    h.profile();
	    h.savedcards();
	    ad = new AddCardObjects(driver);
	    ad.addcardbutton();
	    Thread.sleep(3000);
	    String num = getExcelData1("F:\\loginurl.xlsx.xlsx", "Sheet1", 1, 2);
	    ad.cardnumber(num);
	    String nam = getExcelData("F:\\loginurl.xlsx.xlsx", "Sheet1", 1, 3);
	    ad.cardname(nam);
	    Thread.sleep(2000);
	    ad.expirymonth();
	    ad.expiryyear();
	    ad.savecard();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    BaseClass.closeBrowser();
	    
	    
	}


}
