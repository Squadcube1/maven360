package DeviceManagement;

import org.testng.annotations.Test;

import sg360.pageobjects.DeviceManagement;
import sg360.testcases.BaseClass;

public class Devicemgt_TC_003 extends BaseClass{

	@Test
	public void filterbydevicetype() throws InterruptedException
	
	{
		DeviceManagement d = new DeviceManagement(driver);
		d.Devicemgt();
		logger.info("Selecting Device management...");
		Thread.sleep(10000);
		
		d.ddselectbyarrowkeys();
		logger.info("selecting by clicking on arrow keys...");
		d.ddselectbykeyboard();
		logger.info("selecting by typing the value...");
		Thread.sleep(5000);	
	}

}
