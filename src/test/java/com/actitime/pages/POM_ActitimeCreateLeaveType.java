package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeCreateLeaveType 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement HomepageSettings;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leaveType;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateleaveType;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement LeaveTypeName;
	
	@FindBy(xpath="//div[@class='buttonIcon']")
	private WebElement createLeaveTypeButton;
	
	public POM_ActitimeCreateLeaveType(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void createLeaveType()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(HomepageSettings));
		js.executeScript("arguments[0].click()", HomepageSettings);
		
		wait.until(ExpectedConditions.visibilityOf(leaveType));
		js.executeScript("arguments[0].click()", leaveType);
		
		wait.until(ExpectedConditions.visibilityOf(CreateleaveType));
		js.executeScript("arguments[0].click()", CreateleaveType);
		
		
		wait.until(ExpectedConditions.visibilityOf(LeaveTypeName));
		js.executeScript("arguments[0].value='SQL'", LeaveTypeName);
		
		wait.until(ExpectedConditions.visibilityOf(createLeaveTypeButton));
		js.executeScript("arguments[0].click()", createLeaveTypeButton);
		
	}
	
	
	
}
