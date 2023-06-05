package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeDeleteTypeofWork 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath="//a[.='POMM']/../..//a[contains(text(),'delete')]")
	private WebElement Delete;
	
	public POM_ActitimeDeleteTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void deleteTypeofWork() 
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(Delete));
		js.executeScript("arguments[0].click()", Delete);
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
}
