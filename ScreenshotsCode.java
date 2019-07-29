package com.testng.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotsCode extends TestBase {
	
	
	public ScreenshotsCode() throws IOException {
		super();
		
	}

	public void getScreenshot(String testname)
	{
	File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File("D:\\JavaTraining\\New folder\\fiserv\\screenshots\\"+testname+" "+".jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
	

}
