package com.etlhive.selenium.googlehomepage;

import org.testng.annotations.DataProvider;

public class DataProv {
	@DataProvider(name="abc")
	//[][] is used for 2 dimensional aaray
	public static Object[][] googleTest(){
		
	return new Object[][]{{"http://newtours.demoaut.com"}};
	}

}
