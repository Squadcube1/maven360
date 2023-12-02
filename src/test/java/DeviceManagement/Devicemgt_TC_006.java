package DeviceManagement;

import org.testng.annotations.Test;

import sg360.pageobjects.DeviceManagement;
import sg360.testcases.BaseClass;

public class Devicemgt_TC_006 extends BaseClass {
	
	@Test
	public void navigationtest() throws InterruptedException
	
	{
		DeviceManagement d = new DeviceManagement(driver);
		d.Devicemgt();
		logger.info("Selecting Device management...");
		Thread.sleep(10000);
		
		d.page2();
		d.page3();
		d.page4();
		d.page5();
		d.previous();
		d.next();
		d.start();
		d.last();
	}
	

}
