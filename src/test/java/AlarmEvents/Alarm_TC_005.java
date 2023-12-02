package AlarmEvents;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sg360.pageobjects.AlarmEvents;
import sg360.testcases.BaseClass;

public class Alarm_TC_005 extends BaseClass{

@Test
	
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

}
