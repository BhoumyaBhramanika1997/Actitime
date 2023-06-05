package com.actitime.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_ActitimeHomePage 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement TasksButton;
	
	public POM_ActitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void logoutMethod()
	{
		logoutLink.click();
	}
	public void tasksMethod()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(TasksButton));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", TasksButton);
		//TasksButton.click();
	}
}
