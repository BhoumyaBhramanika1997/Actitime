package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.POM_ActitimeCreateCustomer;
import com.actitime.pages.POM_ActitimeHomePage;
import com.actitime.pages.POM_ActitimeLoginPage;
import com.actitime.pages.POM_ActitimeTasksPage;


public class TC1_CreateCustomer extends BaseTest
{

	@Test
	public void createcustomer(String customerName) throws InterruptedException, IOException 
	{
		
		
		POM_ActitimeLoginPage loginPage=new POM_ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		POM_ActitimeHomePage homePage=new POM_ActitimeHomePage(driver);
		homePage.tasksMethod();
		
		POM_ActitimeTasksPage tasksPage=new POM_ActitimeTasksPage(driver);
		tasksPage.addnew();
		tasksPage.addCustomer();
		 
		POM_ActitimeCreateCustomer createCustomer=new POM_ActitimeCreateCustomer(driver);
		createCustomer.EnterCustomerName(customerName);
		
		//driver.quit();//
	}

}
