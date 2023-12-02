package logintest;

import org.testng.annotations.Test;

import sg360.pageobjects.LoginPage;
import sg360.testcases.BaseClass;

public class Login_TC_002 extends BaseClass{

	@Test
	public void loginTest() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.clickfp();
		Thread.sleep(1000);	
	}

}
