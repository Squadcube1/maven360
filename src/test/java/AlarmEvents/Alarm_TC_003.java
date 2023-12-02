package AlarmEvents;

import org.testng.annotations.Test;
import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_003 extends BaseClass{
@Test
	
	public void textkeyboardtest() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		Thread.sleep(10000);
		ae.edit();
		logger.info("clickimg on edit...");
		Thread.sleep(5000);
		
		ae.alphabetsdd1();
		Thread.sleep(5000);
	    ae.alphabetsdd2();
	     
	    ae.submit();
	    Thread.sleep(5000);
	    
	    ae.edit2();
	    ae.alphabetsdd3();
	    ae.alphabetsdd4();
	    
	    ae.submit();
	    Thread.sleep(3000);	
		
	}

}
