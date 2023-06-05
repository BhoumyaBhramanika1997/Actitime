package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeCreateUser 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement UserButton;
	
	@FindBy(xpath = "//div[.='New User']")
	private WebElement NewUserButton;
	
	@FindBy(xpath = "//input[@id='createUserPanel_firstNameField']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='createUserPanel_lastNameField']")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@id='createUserPanel_emailField']")
	private WebElement Email;
	
	@FindBy(xpath = "//div[.='Save & Send Invitation']")
	private WebElement sendInvitation;
	
	public POM_ActitimeCreateUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateUser() throws InterruptedException
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(UserButton));
	    js.executeScript("arguments[0].click()", UserButton);
	     
	    wait.until(ExpectedConditions.visibilityOf(NewUserButton));
	    js.executeScript("arguments[0].click()", NewUserButton);
	     
	    wait.until(ExpectedConditions.visibilityOf(FirstName));
		js.executeScript("arguments[0].value='Bhoumya'", FirstName);
		 
		wait.until(ExpectedConditions.visibilityOf(LastName));
		js.executeScript("arguments[0].value='Bhramanika'", LastName);
			
		wait.until(ExpectedConditions.visibilityOf(Email));
		js.executeScript("arguments[0].value='bhoumyabhramanika@gmail.com'",Email);
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(sendInvitation));
	    js.executeScript("arguments[0].click()", sendInvitation);



	}
}
