package com.testng.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;



	public class TestBase
	{
	  public static WebDriver Driver;
	  public static Properties prop;
	  static DesiredCapabilities capabilities;
	  public static final Logger log = Logger.getLogger(TestBase.class.getName());
	  
	  public TestBase() throws IOException
	  {
	    try
	    {
	      prop = new Properties();
	      FileInputStream ip = new FileInputStream("D:\\JavaTraining\\New folder\\fiserv\\src\\main\\java\\com\\config\\config.properties");
	      prop.load(ip);
	    }
	    catch (FileNotFoundException ex)
	    {
	      ex.printStackTrace();
	    }
	    catch (IOException ex)
	    {
	      ex.printStackTrace();
	    }
	  }
	  
	  public static void initializeBrowsers()
	  {
	    String Browsertype = prop.getProperty("Browsertype");
	    String Browsername = prop.getProperty("Browsername");
	    String url = prop.getProperty("url");
	    
	    if (Browsertype.equalsIgnoreCase("DESKTOP"))
	    {
	      if (Browsername.equalsIgnoreCase("CHROME"))
	      {
	        System.setProperty("webdriver.chrome.driver", "D:\\JavaTraining\\chromedriver.exe");
	        Driver = new ChromeDriver();
	        log.info("created chrome browser");

	      }
	      else if (Browsername.equals("FF"))
	      {
	        Driver = new FirefoxDriver();

	      }
	      else if (Browsername.equals("SAFARI"))
	      {
	        Driver = new SafariDriver();

	      }
	      else if (Browsername.equals("incognito"))
	      {
	        System.setProperty("webdriver.chrome.driver", "D:\\JavaTraining\\chromedriver.exe");
	        capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments(new String[] { "-incognito" });
	        
	        capabilities.setCapability("goog:chromeOptions", options);
	        Driver = new ChromeDriver(capabilities);
	      }
	    }
	    

	    Driver.manage().window().maximize();
	    Driver.manage().deleteAllCookies();
	    
	    Driver.get(url);
	    log.info("navigated to url");
	    
	    Driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
	  }
	}




