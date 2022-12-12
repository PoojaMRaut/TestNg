package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LognInPageObjects;
import resources.BaseClass;

public class logintestcase extends BaseClass {

	
	@Test
	public void method1() throws IOException {
		initbrowser();
	driver.get("https://www.salesforce.com/");
	LognInPageObjects LPO=new LognInPageObjects(driver);
	  
	  LPO.enterUsername().sendKeys("rahul");
	  LPO.enterPassword().sendKeys("test");
	  LPO.clickOnLogin().click();
	   
	}
}
