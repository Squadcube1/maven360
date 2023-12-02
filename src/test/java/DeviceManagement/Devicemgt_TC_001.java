package DeviceManagement;

import org.testng.annotations.Test;


import sg360.pageobjects.DeviceManagement;
import sg360.testcases.BaseClass;

public class Devicemgt_TC_001 extends BaseClass {

	@Test
	public void searchtest() throws InterruptedException
	{
		DeviceManagement d = new DeviceManagement(driver);
		
		d.Devicemgt();
		logger.info("selecting device management...");
		Thread.sleep(10000);
		
		d.searchbydevicetype();
		Thread.sleep(1000);
		logger.info("searching by Device type...");
		d.searchbybrandname();
		Thread.sleep(1000);
		logger.info("searching by Brand name...");
		d.searchbydeviceid();
		Thread.sleep(1000);
		logger.info("searching by Device id...");
		d.searchbyserialno();
		Thread.sleep(1000);
		logger.info("searching by Seriel no...");
		d.searchbyversion();
		Thread.sleep(1000);
		logger.info("searching by version...");
		
	}

}
