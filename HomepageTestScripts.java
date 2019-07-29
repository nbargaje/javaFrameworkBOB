package TestScripts;


import ObjectRepository.HomePageObjectFactory;
import com.testng.Utility.*;

import FunctionLibrary.HomepageFunctions;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)
public class HomepageTestScripts extends TestBase {
	
	public HomepageTestScripts() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	HomepageFunctions objhomepage;
	ExcelDataReader objexceldata;
	
	@BeforeTest
	  public void setup()
	    throws IOException
	  {
	    initializeBrowsers();
	    objhomepage = new HomepageFunctions();
	    objexceldata=   new ExcelDataReader();
	  
	  }
	  

	  @Test
	  public void testcase1()
	  {
	    String fname = objexceldata.getCellwiseData(0, 1, 0);
	    String lname = objexceldata.getCellwiseData(0, 1, 1);
	    String compname = objexceldata.getCellwiseData(0, 1, 2);
	    String roleincomp  = objexceldata.getCellwiseData(0, 1, 3);
	    String address1 = objexceldata.getCellwiseData(0, 1, 4);
	    String email1 = objexceldata.getCellwiseData(0, 1, 5);
	    String phone = objexceldata.getCellwiseData(0, 1, 6);
	    
	    objhomepage.clickOnStart();
	    objhomepage.enterData(fname, lname, email1, address1, compname, roleincomp, phone);
	    //objhomepage.clickOnSubmit();
	  }

}
