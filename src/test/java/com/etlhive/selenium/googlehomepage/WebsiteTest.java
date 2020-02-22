package com.etlhive.selenium.googlehomepage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.etlhive.selenium.commonlinks.HomePage;
import com.etlhive.selenium.commonlinks.Register;



public class WebsiteTest {
	@Test

	public  void f2() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Laxmi Computers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	HomePage hm=new HomePage(driver);
	Assert.assertTrue("Clicking on registration link", hm.clickOnRegister());
	Register rg=new Register(driver);
	Assert.assertTrue("Entering First name", rg.addFirstName("Payal"));
	Assert.assertTrue("Entering last name", rg.addLastName("Pawar"));
	driver.close();
	}

}


