package DeviceManagement;

import java.io.IOException;

import org.testng.annotations.Test;

import sg360.pageobjects.DeviceManagement;
import sg360.testcases.BaseClass;

public class Devicemgt_TC_002 extends BaseClass {
	
	@Test
	
	public void filterbydeviceid() throws InterruptedException, IOException
	{
		DeviceManagement d = new DeviceManagement(driver);
		
		d.Devicemgt();
		logger.info("selecting device management...");
		Thread.sleep(10000);
		
		d.filterbydeviceid();
		Thread.sleep(5000);
		
		ss(driver, "filterbydeviceid");
		
	}

}
