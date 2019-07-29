package ObjectRepository;
import com.testng.Utility.*;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
	public class HomePageObjectFactory extends TestBase
	{
	  @FindBy(xpath="//label[contains(text(),'First Name')]//following::input[1]")
	protected
	  WebElement firstName;
	  @FindBy(xpath="//label[contains(text(),'Last Name')]//following::input[1]")
	protected
	  WebElement lastName;
	  @FindBy(xpath="//label[contains(text(),'Email')]//following::input[1]")
	protected
	  WebElement email;
	  @FindBy(xpath="//label[contains(text(),'Phone Number')]//following::input[1]")
	protected
	  WebElement phoneNumber;
	  @FindBy(xpath="//label[contains(text(),'Company Name')]//following::input[1]")
	protected
	  WebElement companyName;
	  @FindBy(xpath="//label[contains(text(),'Address')]//following::input[1]")
	protected
	  WebElement address;
	  @FindBy(xpath="//label[contains(text(),'Role in Company')]//following::input[1]")
	protected
	  WebElement roleInCompany;
	  @FindBy(xpath="//button[@id='start']")
	protected
	  WebElement start;
	  @FindBy(xpath="//input[@class='btn btn-default']")
	protected
	  WebElement submit;
	  
	  public HomePageObjectFactory()
	    throws IOException
	  {
	    PageFactory.initElements(Driver, this);
	  }
	  
	 
	  
	  
}

