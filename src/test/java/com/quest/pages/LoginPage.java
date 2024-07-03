package com.quest.pages;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	 WebDriver driver;
	
	 
	 @FindBy(css= "input.oxd-input.oxd-input--active[name='username']")
	 WebElement  emailid;

	 @FindBy(xpath= "//input[@class='oxd-input oxd-input--active' and @name='password']")
	 WebElement  password;
	 
	 @FindBy(xpath= "//button[contains(@type,'submit')]")
	 WebElement  login;
	 
	 @FindBy(xpath= "//i[@class='oxd-icon bi-chevron-left']")
	 WebElement  sidePanel;
	 
	 @FindBy(xpath= "//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	 WebElement  DashBoard;

	 
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);

	       
	    }
	 
	 public void LoginQuest() throws InterruptedException {
		 
		 password.sendKeys("admin123");
		 emailid.sendKeys("Admin");
		 
		 login.click();

	 }
	 
	 public void VisibilityFunc()  {
		 
		 
		 if(sidePanel.isDisplayed() && DashBoard.isDisplayed())
		 {
			 System.out.println("Elements displayed");
		 }
		
		 else { 
			 System.out.println("Element not displayed");
		 }
		
	 }
	 
		 
			 
		 
		 	
		 

	 }






















