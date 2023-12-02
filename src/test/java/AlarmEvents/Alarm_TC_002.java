package AlarmEvents;

import org.testng.annotations.Test;

import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_002 extends BaseClass{
	
	
@Test
	
	public void arrowkeystest() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		logger.info("Selecting AlarmEvents...");
		Thread.sleep(10000);
		ae.edit();
		logger.info("Clicking on Edit button in ToDo..");
		Thread.sleep(5000);
		
	    ae.arrowkeys();
	    logger.info("Selecting Alarm status using arrowkeys..");
	    Thread.sleep(1000);
		ae.arrowkeys2();
		logger.info("Selecting Status using arrowkeys..");
	    Thread.sleep(1000);
	    
	    ae.submit();
	    logger.info("Clicking on Update...");
	    Thread.sleep(10000);
	    
	    ae.edit2();
	    Thread.sleep(5000);
	    logger.info("Clicking on Edit button in InProgress...");
	    
	    ae.arrowkey3();
	    logger.info("Selecting Alarm status using arrowkeys..");
	    Thread.sleep(1000);
	    ae.arrowkey4();
	    logger.info("Selecting Status using arrowkeys..");
	    Thread.sleep(1000);
	    
	    ae.submit();
	    logger.info("Closing the ticket by clicking on Update...");
	    Thread.sleep(5000);	
	}




}

