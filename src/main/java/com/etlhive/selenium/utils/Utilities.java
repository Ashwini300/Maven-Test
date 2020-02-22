package com.etlhive.selenium.utils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilities {
	WebDriver driver;
	public boolean clicksafelyOn(WebElement ele) 
	{
		try
		{
//		WebDriverWait wait =new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		return true;
		}
		catch(TimeoutException ex) 
		{
			WebDriverWait wait =new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			return true;
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Element is not present on the page");
			return false;
		}
		catch(Exception a) {
			a.printStackTrace();
			return false;
		}
	}
	
}
