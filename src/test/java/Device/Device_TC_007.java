package Device;

import org.testng.annotations.Test;




import sg360.pageobjects.Device;
import sg360.testcases.BaseClass;

public class Device_TC_007 extends BaseClass{
	
@Test
	
	public void devicetest() throws InterruptedException
	{	
		Device ds = new Device(driver);
		
		ds.clickdevicestatus();
		Thread.sleep(10000);
		
		ds.expand();
		Thread.sleep(5000);
		
		ds.expandd();
		Thread.sleep(5000);
		
		ds.expanddd();
		Thread.sleep(5000);
		
	}


}

