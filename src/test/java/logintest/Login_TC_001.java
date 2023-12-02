package logintest;

import org.testng.annotations.Test;


import sg360.pageobjects.LoginPage;
import sg360.testcases.BaseClass;

public class Login_TC_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Thread.sleep(5000);
		
		lp.setPassword(password);
		Thread.sleep(5000);
		
		lp.clickSubmit();
		Thread.sleep(15000);

		
	}

}

