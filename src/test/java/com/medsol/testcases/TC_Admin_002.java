package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Adminpage;
import com.medsol.pageobject.Loginpage;

public class TC_Admin_002 extends Baseclass
{
	@Test
	public void Admintest() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	Adminpage ad= new Adminpage(driver)	;
		ad.clickonadmin();

		Thread.sleep(2000);
		ad.clickonnewadmin();
		Thread.sleep(2000);
		ad.setfirstname("pavan");
		ad.setlastname("Kumar");
		ad.setemailid("pavankumar@gmail.com");
		ad.setphone("8907060504");
		ad.setpassword("Pavan@123");
		ad.setconpassword("Pavan@123");
		ad.clickonfemaleradio();
		ad.clickonsave();
		Thread.sleep(3000);	
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
