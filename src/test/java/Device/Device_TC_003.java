package Device;

import org.testng.annotations.Test;


import sg360.pageobjects.Device;
import sg360.testcases.BaseClass;

public class Device_TC_003 extends BaseClass{
	
@Test
	
	public void devicetest() throws InterruptedException
	{	
		Device ds = new Device(driver);
		
		ds.clickdevicestatus();
		Thread.sleep(5000);
		
		ds.specialcharacter();
		Thread.sleep(5000);
		
	}


}

