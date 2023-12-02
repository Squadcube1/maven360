package DeviceManagement;

import org.testng.annotations.Test;

import sg360.pageobjects.DeviceManagement;
import sg360.testcases.BaseClass;

public class Devicemgt_TC_005 extends BaseClass{


	@Test
	public void filterbybrandname() throws InterruptedException
	
	{
		DeviceManagement d = new DeviceManagement(driver);
		d.Devicemgt();
		logger.info("Selecting Device management...");
		Thread.sleep(10000);
		
		d.filterbybrandname();
	}
}
