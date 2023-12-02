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

public class Alarm_TC_007 extends BaseClass{
@Test
	
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

}
