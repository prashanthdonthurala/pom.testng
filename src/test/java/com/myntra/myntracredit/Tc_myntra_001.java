package com.myntra.myntracredit;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.HomeObjects;
import pom.LoginObjects;
import pom.MyntraCreditObjects;
import pom.MyntraCreditTopup;

public class Tc_myntra_001 extends BaseClass{
	 HomeObjects h;
	 LoginObjects l;
	 MyntraCreditObjects m;
	 MyntraCreditTopup mt;
	 WebDriver driver;
	
	@Test
	public void credit() throws InterruptedException, EncryptedDocumentException, IOException {
		
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
	    
	    m = new MyntraCreditObjects(driver);
	    m.myntracreditbtn();
	    m.topup();
	    Thread.sleep(2000);
	    mt = new MyntraCreditTopup(driver);
	    mt.amount();
	    mt.topUp();
	    Thread.sleep(5000);
	    String actual = driver.getTitle();
	    System.out.println(actual);
	    String exp = "PAYMENT";
	    Assert.assertEquals(actual, exp);
//	    Reporter.log("credit successful", true);
	    BaseClass.closeBrowser();
	    
}
}
