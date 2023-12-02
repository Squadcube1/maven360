package AlarmEvents;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_001 extends BaseClass{

	@Test(priority=0)
	
	public void alarmtest() throws InterruptedException
	{
		AlarmEvents ae = new AlarmEvents(driver);
		
		ae.clickalarm();
		Thread.sleep(10000);
		
		ae.edit();
		logger.info("Opening ticket to send to In Progress...");
		Thread.sleep(5000);
		
		ae.dd1();
		logger.info("Selecting Alarm Status...");
		Thread.sleep(3000);
		ae.dd2();
		logger.info("Selecting status...");
		Thread.sleep(3000);
		ae.submit();
		logger.info("updating status...");
		Thread.sleep(15000);
		
		ae.edit2();
		logger.info("Editing ticket to make it Done...");
		Thread.sleep(5000);
		
		ae.dd3();
		logger.info("Selecting status...");
		Thread.sleep(3000);
		ae.dd4();
		logger.info("Selecting Status");
		Thread.sleep(3000);
		
		ae.submit();
		logger.info("Updating status");
		Thread.sleep(15000);
		
		}
		
@Test(priority=1)
	
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

@Test(priority=6)

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

@Test(priority=4)

public void refreshtest() throws InterruptedException
{
	AlarmEvents ae = new AlarmEvents(driver);
	
	ae.clickalarm();
	Thread.sleep(10000);
	
    
    ae.refresh();
    Thread.sleep(2000);
    			
}

@Test(priority=7)

public void zoominouttest() throws InterruptedException
{
	AlarmEvents ae = new AlarmEvents(driver);
	
	ae.clickalarm();
	Thread.sleep(10000);
	
	ae.view();
	Thread.sleep(5000);
	
	WebElement ma = driver.findElement(By.xpath("//*[@id=\"exampleModalRight\"]/div/div[1]/div/div/div/div/div/div[13]/div/div[2]/div/button[2]"));
	Thread.sleep(5000);
	ma.click();
	ma.click();
	Thread.sleep(2000);
	
	WebElement mi = driver.findElement(By.xpath("//*[@id=\"exampleModalRight\"]/div/div[1]/div/div/div/div/div/div[13]/div/div[2]/div/button[1]"));
	mi.click();
	mi.click();
	Thread.sleep(2000);
	  
	  ae.cancelv();
	  Thread.sleep(3000);

}
@Test(priority=5)

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


@Test(priority=3)

public void googlemap() throws InterruptedException
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
    
    
    driver.findElement(By.xpath("//a[normalize-space()='(Click Here)']")).click();
    Thread.sleep(5000);
    
      Set<String> windowhandles = driver.getWindowHandles();
	  List<String> list = new ArrayList<String>(windowhandles);
	  
	  driver.switchTo().window(list.get(1));
	  Thread.sleep(10000);
	  WebElement m = driver.findElement(By.xpath("//button[@id='widget-zoom-in']//div[@class='ie0N9b']"));
	  Thread.sleep(10000);
	  m.click();
	  m.click();
	  Thread.sleep(2000);
	  driver.close();
	    
	  driver.switchTo().window(list.get(0));
	  
	  ae.cancelv();
	  Thread.sleep(3000);
}

@Test(priority=2)

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