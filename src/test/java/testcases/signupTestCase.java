package testcases;


	import java.io.IOException;

	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import PageObjectModel.LognInPageObjects;
	import PageObjectModel.SignUpPageObjects;
	import resources.BaseClass;


	public class signupTestCase extends BaseClass {

	 @Test
	 public void verifySignup() throws IOException, InterruptedException {

		 initbrowser();
	  driver.get("https://login.salesforce.com/");
	  
	  LognInPageObjects LPO=new LognInPageObjects(driver);
	  LPO.clickOnTryForFree().click();
	  
	  SignUpPageObjects SPO= new SignUpPageObjects(driver);
	  Thread.sleep(5000);
	  SPO.enterFirstname().sendKeys("Ramesh");
	  
	  Select s=new Select(SPO.selectCompanyEmployees());
	  s.selectByIndex(1);
	  
	 }
	}
