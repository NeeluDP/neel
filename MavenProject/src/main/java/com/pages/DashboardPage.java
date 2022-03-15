package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
WebDriver dpdriver;
	
	public DashboardPage(WebDriver driver){
		
		this.dpdriver=driver;
		PageFactory.initElements(driver, this);
	}
//	public WebElement getHeader(){
//		return dpdriver.findElement(By.xpath("//h1"));
//		
//	}
	
	@FindBy(xpath="//h1")
	WebElement header;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a")
	WebElement UserBtn;
	
	public boolean verifyHeader(){
		return header.isDisplayed();
		
	}
	public UserPage clickUser(){
		UserBtn.click();
		return new  UserPage(dpdriver);
	}

	

}
