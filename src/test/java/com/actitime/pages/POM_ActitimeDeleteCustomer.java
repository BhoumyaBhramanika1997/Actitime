package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeDeleteCustomer 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerName;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomer;

	@FindBy(xpath="//div[.='Bhoumya']/../..//div[4][@class='editButton']")
	private WebElement settings;

	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='actionButton']//div[.='ACTIONS']")
	private WebElement Actions;

	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement Delete;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement DeletePermanently;


	public POM_ActitimeDeleteCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void DeleteCustomerName() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.visibilityOf(EnterCustomerName));
		js.executeScript("arguments[0].value='Bhoumya'", EnterCustomerName);

		wait.until(ExpectedConditions.visibilityOf(CreateCustomer));
		js.executeScript("arguments[0].click()", CreateCustomer);

		wait.until(ExpectedConditions.visibilityOf(settings));
		js.executeScript("arguments[0].click()", settings);
		
		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(Actions));
		js.executeScript("arguments[0].click()", Actions);

		wait.until(ExpectedConditions.visibilityOf(Delete));
		js.executeScript("arguments[0].click()", Delete);
		
		js.executeScript("arguments[0].scrollIntoView(true)",DeletePermanently);
		
		wait.until(ExpectedConditions.visibilityOf(DeletePermanently));
		js.executeScript("arguments[0].click()", DeletePermanently);
		
		
	}
}