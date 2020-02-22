package com.etlhive.selenium.googlehomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class Phptravels{
	@Test(dataProvider="abc",dataProviderClass=DataProv.class)
	
	

	public void f1(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("Opening the url");
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
	driver.get("http://phptravels.com/demo");
	
	}

}
