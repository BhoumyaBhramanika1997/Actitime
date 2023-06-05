package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeCreateTypeofWork 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement HomepageSettings;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement TypesOfWork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement CreateWork;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement AddName;
	
	@FindBy(xpath = "//label[.='Billable']")
	private WebElement Category;
	
	@FindBy(xpath = "//input[@id='billingRate_input']")
	private WebElement BillingRate;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement CreateTypeOfWork;
	
	public POM_ActitimeCreateTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void createTypeOfWork()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(HomepageSettings));
		js.executeScript("arguments[0].click()", HomepageSettings);
		
		wait.until(ExpectedConditions.visibilityOf(TypesOfWork));
		js.executeScript("arguments[0].click()", TypesOfWork);
		
		wait.until(ExpectedConditions.visibilityOf(CreateWork));
		js.executeScript("arguments[0].click()", CreateWork);
		
		wait.until(ExpectedConditions.visibilityOf(AddName));
		js.executeScript("arguments[0].value='POMM'", AddName);
		
		wait.until(ExpectedConditions.visibilityOf(BillingRate));
		js.executeScript("arguments[0].value='1234'", BillingRate);
		
		wait.until(ExpectedConditions.visibilityOf(Category));
		js.executeScript("arguments[0].click()", Category);
		
		wait.until(ExpectedConditions.visibilityOf(CreateTypeOfWork));
		js.executeScript("arguments[0].click()", CreateTypeOfWork);
		
		
		
	}
	
	
	
}
