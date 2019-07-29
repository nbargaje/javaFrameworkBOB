package FunctionLibrary;

import java.io.IOException;

import ObjectRepository.HomePageObjectFactory;

public class HomepageFunctions extends HomePageObjectFactory{

	public HomepageFunctions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	 public void clickOnStart()
	  {
		start.click();
	  
	  }
	  
	  public void enterData(String fname, String lname, String email1, String address1, String compname, String roleincomp, String phone)
	  {
	    firstName.sendKeys(fname);
	    log.info("entered fname");
	    lastName.sendKeys(lname);
	    companyName.sendKeys(compname);
	    roleInCompany.sendKeys(roleincomp);
	    phoneNumber.sendKeys(phone);
	    email.sendKeys(email1);
	    address.sendKeys(address1);
	  }
	  

	  public void clickOnSubmit()
	  {
	    submit.click();
	  }
}
