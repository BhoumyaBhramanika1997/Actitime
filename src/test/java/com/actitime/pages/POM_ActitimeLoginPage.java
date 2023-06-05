package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;



public class POM_ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriverWait wait;
    public WebDriver driver;
    
	 @FindBy(name="usernam")
	 private WebElement usernameTextfield;
	 
	 @FindBy(name="pwd")
	 private WebElement passwordTextfield;
	 
	 @FindBy(id="keepLoggedInCheckBox")
	 private WebElement keepLoggedInCheckbox;
	 
	 @FindBy(id="loginButton")
	 private WebElement loginButton;
	 
	 @FindBy(xpath= "//a[.='Forgot your password?']")
	 private WebElement forgotyourpasswordLink;
	 
	 @FindBy(xpath="//a[.='actiTIME Inc.']")
	 private WebElement actitimeIncLink;
	 
	 //@FindBy(id="logoutLink")
	 //private WebElement logoutButton;
	 
	 public POM_ActitimeLoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 public void loginMethod() throws InterruptedException, IOException
	 {
		    visibilityofElement(driver, usernameTextfield);
			usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));

			visibilityofElement(driver, passwordTextfield);
			passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login,1 , 1));

			visibilityofElement(driver, keepLoggedInCheckbox);
			javascriptClick(driver, keepLoggedInCheckbox);

			visibilityofElement(driver, loginButton);
			javascriptClick(driver, loginButton); 
	 }
	 
	 public void forgotpasswordMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 forgotyourpasswordLink.click();
	 }
	 public void actitimeincMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 actitimeIncLink.click();
	 }
	public void titlevalidate() 
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
		 
		 
 }
	 
	 

