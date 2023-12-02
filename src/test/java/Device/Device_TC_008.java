package Device;

import org.testng.annotations.Test;




import sg360.pageobjects.Device;
import sg360.testcases.BaseClass;

public class Device_TC_008 extends BaseClass{
	
@Test
	
	public void devicetest() throws InterruptedException
	{	
		Device ds = new Device(driver);
		
		ds.clickdevicestatus();
		Thread.sleep(10000);
		
		ds.page2();
		Thread.sleep(2000);
		
		ds.page3();
		Thread.sleep(2000);
		
		ds.previous();
		Thread.sleep(2000);
		
		ds.start();
		Thread.sleep(2000);
		
		ds.next();
		Thread.sleep(2000);
		
		ds.last();
		Thread.sleep(2000);
		
		
		
	}


}


