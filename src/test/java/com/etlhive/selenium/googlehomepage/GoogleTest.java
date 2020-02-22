package com.etlhive.selenium.googlehomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test(dataProvider="abc",dataProviderClass=DataProv.class)//done for TestNG
	@Parameters({"firstname","lastname","phone"})
	public void f1(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Computers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("Opening the url");
		driver.get("http://newtours.demoaut.com");
		WebElement reg=driver.findElement(By.linkText("REGISTER"));
		reg.click();
		WebElement fn=driver.findElement(By.name("firstName"));
		fn.sendKeys(ftn);
		WebElement fn1=driver.findElement(By.name("lastName"));
		fn1.sendKeys(ftn1);
		WebElement fn2=driver.findElement(By.name("phone"));
		fn2.sendKeys(ftn2);
		WebElement fn3=driver.findElement(By.name("userName"));
		fn3.sendKeys("ashwinichougule030@gmail.com");
		WebElement fn4=driver.findElement(By.name("address1"));
		fn4.sendKeys("dehuroad sainagar");
		WebElement fn5=driver.findElement(By.name("city"));
		fn5.sendKeys("pune");
	     WebElement fn6=driver.findElement(By.name("state"));
		fn6.sendKeys("maharashtra");
		 WebElement fn7=driver.findElement(By.name("postalCode"));
		 fn7.sendKeys("412101");
		 WebElement dd=driver.findElement(By.name("country"));
		 Select cc=new Select(dd);
		 cc.selectByVisibleText("INDIA ");
		 WebElement fn8=driver.findElement(By.name("email"));
		 fn8.sendKeys("ashwinichougule030@gmail.com");
		 WebElement fn9=driver.findElement(By.name("password"));
		 fn9.sendKeys("ashu30");
		 WebElement fn10=driver.findElement(By.name("confirmPassword"));
		 fn10.sendKeys("ashu30");
		 WebElement re1=driver.findElement(By.name("register"));
		 re1.click();
		 
		 
		 
		 
		 
		 
		 
		Thread.sleep(5000);
		
	// driver is closing  once it is done
		driver.close();
		
		
		
		

	}

}
