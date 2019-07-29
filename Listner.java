package com.testng.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listner extends ScreenshotsCode implements ITestListener {
	
	ScreenshotsCode objscreen= new ScreenshotsCode();

	public Listner() throws IOException {
		super();
		
	}

	public void onFinish(ITestContext ls) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext ls) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult ls) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult ls) {
		
		System.out.println("its seems failed plz check again");
	
		objscreen.getScreenshot(ls.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult ls) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult ls) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult ls) {
		System.out.println("its seems passed");
		objscreen.getScreenshot(ls.getMethod().getMethodName());
	}

}
