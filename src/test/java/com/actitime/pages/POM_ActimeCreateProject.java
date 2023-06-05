package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActimeCreateProject 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddnewButton;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement AddnewProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement EnterprojectName;
	
	@FindBy(xpath="//div[contains(text(),'-- Please Select Customer to Add Project for  --')]")
	private WebElement CustomerDropDown;
	
	@FindBy(xpath="//div[@class='scrollableContainer ']//div[@class='searchItemList']//div[contains(text(),'-- New Customer --')]")
	private WebElement NewCustomerSelection;
	
	@FindBy(xpath="//input[@class='newCustomerNameField newCustomer']")
	private WebElement NewCustomerNameTextField;
	
	@FindBy(xpath="//div[.='Create Project']")
	private WebElement CreateProject;
	
	public POM_ActimeCreateProject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addNewProject()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.visibilityOf(AddnewProject));
		js.executeScript("arguments[0].click()", AddnewProject);
		
		wait.until(ExpectedConditions.visibilityOf(EnterprojectName));
		js.executeScript("arguments[0].value='POM'", EnterprojectName);
		
		wait.until(ExpectedConditions.visibilityOf(CustomerDropDown));
		js.executeScript("arguments[0].click()", CustomerDropDown);
		
		wait.until(ExpectedConditions.visibilityOf(NewCustomerSelection));
		js.executeScript("arguments[0].click()",NewCustomerSelection);
		
		wait.until(ExpectedConditions.visibilityOf(NewCustomerNameTextField));
		js.executeScript("arguments[0].value='Bhoumya'",NewCustomerNameTextField);
		
		wait.until(ExpectedConditions.visibilityOf(CreateProject));
		js.executeScript("arguments[0].click()", CreateProject);
	}
	
	
}
