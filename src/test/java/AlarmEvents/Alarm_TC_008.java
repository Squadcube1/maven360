package AlarmEvents;

import org.testng.annotations.Test;

import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_008 extends BaseClass{

@Test
	
	public void fullscreen() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		Thread.sleep(10000);
		
		ae.view();
		Thread.sleep(5000);
		
		ae.fs();
		Thread.sleep(3000);
		
		ae.fs();
		Thread.sleep(3000);
		
		ae.cancelv();
		
}

}