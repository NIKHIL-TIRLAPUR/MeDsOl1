package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[contains(@class,'btn btn-success me-2 mb-3 mb-xl-0')]")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	WebElement loginbuttonsubmit;
	
	public void clickonlogin() {
		loginbutton.click();
	}
	
	public void setemail(String userid) {
		txtemail.sendKeys(userid);
		
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickonloginsubmit() {
		loginbuttonsubmit.click();
	}
	
	
	
	
	
	
}
