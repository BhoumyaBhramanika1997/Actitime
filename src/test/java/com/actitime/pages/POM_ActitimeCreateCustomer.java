package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;



public class POM_ActitimeCreateCustomer extends BasePage implements AutoConstant
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerName;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomer;
	
	//@FindBy(xpath="//div[.='Bhoumya']/../..//div[4][@class='editButton']")
	//private WebElement settings;
	
	//@FindBy(xpath="(//div[@class='actionButton'])[7]")
	//private WebElement Actions;
	
	
	public POM_ActitimeCreateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void EnterCustomerName(String customerName) throws InterruptedException, IOException
	{
		 

	    visibilityofElement(driver, EnterCustomerName);
	    EnterCustomerName.sendKeys(ExcelLibrary.getcellvalue(sheet_name_customer, 1, 0));

	     //js.executeScript("arguments[0].value='Bhoumya'", EnterCustomerName);
        
	    visibilityofElement(driver, CreateCustomer);
	    javascriptClick(driver, CreateCustomer);
	    
	     
	     //wait.until(ExpectedConditions.visibilityOf(settings));
	     //js.executeScript("arguments[0].click()", settings);
			 
	     //wait.until(ExpectedConditions.visibilityOf(Actions));
	     //js.executeScript("arguments[0].click()", Actions);
	}
	
}
