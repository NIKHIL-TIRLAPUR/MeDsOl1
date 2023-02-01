package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {

	WebDriver ldriver;
	
	public Adminpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//span[normalize-space()='Admins']")
    WebElement admin;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
    WebElement newadmin;
	
	@FindBy(name="first_name")
    WebElement txtfirstname;
	
	@FindBy(name="last_name")
    WebElement txtlastname;
	
	@FindBy(name="email")
    WebElement txtemailid;
	
	@FindBy(name="phone")
    WebElement txtphonenum;
	
	@FindBy(name="password")
    WebElement txtpassword;
	
	@FindBy(name="password_confirmation")
    WebElement txtconpassword;
	
	@FindBy(xpath="//input[contains(@id,'adminGenderFemale')]")
    WebElement femaleradio;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-primary me-2')]")
    WebElement savebutton;
	
	public void clickonadmin()
	{
		admin.click();
	}
	
	public void clickonnewadmin()
	{
		newadmin.click();
	}
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);;
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);;
	}
	
	public void setemailid(String id)
	{
		txtemailid.sendKeys(id);
	}
	
	public void setphone(String num)
	{
		txtphonenum.sendKeys(num);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setconpassword(String cpwd)
	{
		txtconpassword.sendKeys(cpwd);
	}
	
	public void clickonfemaleradio()
	{
		femaleradio.click();
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}
	
	
	
	
	
}
