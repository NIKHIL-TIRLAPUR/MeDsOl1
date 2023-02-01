package com.medsol.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.medsol.utilities.Readconfig;

public class Baseclass {

	Readconfig config= new Readconfig();
	
	public String baseurl=config.getapplicationurl();
	public String username=config.getusername();
	public String password=config.getpassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", config.getChromepath());
		driver= new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", config.getFirefoxpath());
			driver= new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", config.getIEpath());
			driver= new InternetExplorerDriver();
		}
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
