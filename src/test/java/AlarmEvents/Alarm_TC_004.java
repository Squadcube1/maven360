package AlarmEvents;


import org.testng.annotations.Test;

import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_004 extends BaseClass{
@Test
	
	public void refreshtest() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		Thread.sleep(10000);
		
	    
	    ae.refresh();
	    Thread.sleep(2000);
	    			
	}

}

