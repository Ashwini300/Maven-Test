package com.etlhive.selenium.commonlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.etlhive.selenium.utils.Utilities;


public class HomePage extends Utilities
{
	WebDriver driver;
	public HomePage(WebDriver driver2)
	{
		super();
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

@FindBy(linkText="REGISTER")
public WebElement reg;

public boolean clickOnRegister()
{
	return(clicksafelyOn(reg));
	
}
}
