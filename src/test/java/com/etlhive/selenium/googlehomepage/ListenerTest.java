package com.etlhive.selenium.googlehomepage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// when your test case starts
		System.out.println("test case execution started");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//pass
		System.out.println("test case pass");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed miserably");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		//before browser launch or open
		System.out.println("test started");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//after closing browser
		System.out.println("test finish");
		// TODO Auto-generated method stub
		
	}

}
