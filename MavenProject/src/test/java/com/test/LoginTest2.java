package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest2 {
	
	WebDriver driver=null;
	
	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");	
			
		LoginPage lp=new LoginPage(driver);
		DashboardPage dp=lp.validLogin();
		
		UserPage up=dp.clickUser();
		}}
		
		
//		lp.loginToApplication("kiran@gmail.com", "123456");
//		
//		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
//	}
//	@Test
//	public void verifyHeader(){
//		
//		//	System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
//		  //  driver=new ChromeDriver();
//		//	driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");	
//		//LoginPage lp=new LoginPage(driver);
//		
//	//	lp.loginToApplication("kiran@gmail.com", "123456");
//		DashboardPage dp = new DashboardPage(driver);
//		boolean value=dp.verifyHeader();
//		Assert.assertTrue(value);
//	}
//
//}
