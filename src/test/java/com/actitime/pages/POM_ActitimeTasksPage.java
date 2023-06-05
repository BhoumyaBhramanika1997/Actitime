package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeTasksPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddnewButton;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement AddnewCustomer;
	
	public POM_ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void addnew()
	{
		 wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 wait.until(ExpectedConditions.visibilityOf(AddnewButton));
		 js.executeScript("arguments[0].click()", AddnewButton);
	}
	public void addCustomer()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		 JavascriptExecutor js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.visibilityOf(AddnewCustomer));
		 js.executeScript("arguments[0].click()", AddnewCustomer);

	}
}
