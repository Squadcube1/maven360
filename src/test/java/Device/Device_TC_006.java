package Device;

import org.testng.annotations.Test;



import sg360.pageobjects.Device;
import sg360.testcases.BaseClass;

public class Device_TC_006 extends BaseClass{
	
@Test
	
	public void devicetest() throws InterruptedException
	{	
		Device ds = new Device(driver);
		
		ds.clickdevicestatus();
		Thread.sleep(10000);
		
		ds.filter();
		Thread.sleep(5000);
		
		ds.ddselectbyarrowkeys();
		Thread.sleep(5000);
		
		ds.submit();
		Thread.sleep(8000);
		
		ds.refresh();
		Thread.sleep(5000);	
		
	}


}

