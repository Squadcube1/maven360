package Device;

import org.testng.annotations.Test;




import sg360.pageobjects.Device;
import sg360.testcases.BaseClass;

public class Device_TC_010 extends BaseClass{
	
@Test
	
	public void devicetest() throws InterruptedException
	{	
		Device ds = new Device(driver);
		
		ds.clickdevicestatus();
		Thread.sleep(10000);
		
	
		ds.commfails();
		Thread.sleep(4000);
		
		
	}


}


