package AlarmEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_006 extends BaseClass {
	
@Test

	public void scrolltest() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		Thread.sleep(10000);
		
		ae.view();
		Thread.sleep(5000);
		
		 WebElement v = driver.findElement(By.xpath("//button[@class='themebtn-two']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView();",v);
		    Thread.sleep(5000);
		
		    ae.cancelv();
			  Thread.sleep(3000);

	    
	}
	

}
