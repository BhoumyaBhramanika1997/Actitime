package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;



public class TC0_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
		loginPage.titlevalidate();
		
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}
