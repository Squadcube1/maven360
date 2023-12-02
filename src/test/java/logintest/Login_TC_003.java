package logintest;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sg360.pageobjects.LoginPage;
import sg360.testcases.BaseClass;
import sg360.utilities.XLUtils;

public class Login_TC_003 extends BaseClass{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pw) throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		Thread.sleep(2000);
		lp.setPassword(pw);
		Thread.sleep(2000);
		lp.clickSubmit();	
		Thread.sleep(10000);
	}
		



@DataProvider(name="LoginData")
String [][]getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/main/java/sg360/testdata/logindata.xlsx";
	
	int rownum=XLUtils.getRowCount(path,"Sheet1");
	int colcount=XLUtils.getCellCount(path,"Sheet1",1);
	
	String logindata[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
		}
	}
	return logindata;
}

}



