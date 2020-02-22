package com.etlhive.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {
	@Test(dependsOnGroups="pqr")
	public void required()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("reqiured is running");
		driver.close();
	}
	@Test(groups= "pqr")
	public void optional()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("optional is running");
		driver.close();
	}
@Test()
	public void testing()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("testing is running");
		driver.close();
	}
@Test()
	public void selenium()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("selenium is running");
		driver.close();
	}
}
