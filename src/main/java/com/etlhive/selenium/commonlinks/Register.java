package com.etlhive.selenium.commonlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register extends Utilities

{
	WebDriver driver;
	public Register(WebDriver driver3)
	{
		//super
		this.driver=driver3;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="REGISTER")
	public WebElement Reg;
	
	@FindBy(linkText="firstName")
	public WebElement firstName;
	
	@FindBy(linkText="lastName")
	public WebElement lastName;
	
	@FindBy(linkText="phone")
	public WebElement phone;
	
	@FindBy(linkText="userName")
	public WebElement userName;
	
	@FindBy(linkText="address1")
	public WebElement add1 ;
	
	@FindBy(linkText="city")
	public WebElement city;
	
	@FindBy(linkText="state")
	public WebElement state ;
	
	@FindBy(linkText="postalCode")
	public WebElement code;
	
	@FindBy(linkText="country")
	public WebElement country;
	
	@FindBy(linkText="email")
	public WebElement email ;
	
	@FindBy(linkText="password")
	public WebElement password;
	
	@FindBy(linkText="confirmPassword")
	public WebElement confirmpassword ;
	
	@FindBy(linkText="register")
	public WebElement register;
	
	

	public boolean addFirstName(String text) 
	{
		return(SendValue(firstName, text));
	}
	
	public boolean addLastName(String text){
		
		return(SendValue(lastName, text));
		
	}
		

	}

//Select Country=new Select(drpdown);
//Country.selectByValue("92");


	
	
	 

