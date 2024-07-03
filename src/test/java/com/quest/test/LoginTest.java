package com.quest.test;

import org.testng.annotations.Test;

import com.quest.baseclass.BaseClass;
import com.quest.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void Login() throws InterruptedException {
		
		LoginPage login =new LoginPage(driver);
		
		login.LoginQuest();
		login.VisibilityFunc();
		Thread.sleep(3000);
	
	}
	
	
	

}
