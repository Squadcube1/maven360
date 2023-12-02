package sg360.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;;

public class AlarmEvents {

WebDriver ldriver;
	
	public AlarmEvents(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div[2]/nav/ul/li[2]/div")
	WebElement alarmbtn;
	
	@FindBy(xpath="//td[@aria-label='Received']//div[1]//div[1]//div[1]//div[1]//div[1]//div[3]//div[2]//button[1]")
	WebElement editbtn1;
	
	@FindBy(xpath="//button[@class='themebtn-two']")
	WebElement cancel;
	
	@FindBy(xpath="//div[@class='countdown col-md-6 text-end']")
	WebElement refresh;
	
	@FindBy(xpath="//select[@id='alarmStatusID']")
	WebElement dd1;
	
	@FindBy(xpath="//select[@id='messageStatusID']")
	WebElement dd2;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//td[@aria-label='InProgress']//button[1]//*[name()='svg']")
	WebElement editbtn2;
	
	@FindBy(xpath="//select[@id='alarmStatusID']")
	WebElement dd3;
	
	@FindBy(xpath="//select[@id='messageStatusID']")
	WebElement dd4;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]")
	WebElement view;
	
	@FindBy(xpath="//button[@class='themebtn-two']")
	WebElement cancelv;
	
	@FindBy(xpath="//div[@role='dialog']//div[12]//span[1]")
	WebElement map;
	
	@FindBy(xpath="//*[@id=\"exampleModalRight\"]/div/div[1]/div/div/div/div/div/div[8]/button")
	WebElement fs;
	
	
	public void clickalarm()
	{
		alarmbtn.click();
	}
	
	public void refresh()
	{
		refresh.click();
	}
	public void edit()
	{
		
		editbtn1.click();
	}
	
	public void cancel()
	{
		cancel.click();
	}

	public void dd1()
	{
		Select s = new Select(dd1);
		dd1.click();
		s.selectByIndex(2);
	}
	
	public void dd2()
	{
		Select s = new Select(dd2);
		dd2.click();
		s.selectByIndex(2);
	}
	
	public void arrowkeys() throws InterruptedException
	{
		  dd1.click();
		  dd1.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(1000);
		  dd1.sendKeys(Keys.ARROW_DOWN);
          Thread.sleep(1000);
	      dd1.sendKeys(Keys.ARROW_UP);
	      Thread.sleep(1000);
		  dd1.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
	}
	
	public void arrowkeys2() throws InterruptedException
	{
		 dd2.click(); 
		 dd2.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 dd2.sendKeys(Keys.ARROW_UP);
         Thread.sleep(1000);
	     dd2.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(1000);
		 dd2.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
	}
	
	public void alphabetsdd1() throws InterruptedException
	{
		dd1.click();
		dd1.sendKeys("True");
		Thread.sleep(2000);
		dd1.sendKeys("False");
		Thread.sleep(2000);
	    dd1.sendKeys(Keys.ENTER);
	}

	public void alphabetsdd2() throws InterruptedException
	{
		dd2.click();
		dd2.sendKeys("Received");
	    Thread.sleep(2000);
	    dd2.sendKeys("Inprogress");
	    Thread.sleep(2000);
	    dd1.sendKeys(Keys.ENTER);
	}
	
	
	public void submit()
	{
		submit.click();
	}
	
	
	public void edit2()
	{
		editbtn2.click();
	}
	
	public void arrowkey3() throws InterruptedException
	{
		dd3.click();
		dd3.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    dd3.sendKeys(Keys.ARROW_UP);
	    Thread.sleep(1000);
	    dd3.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    dd3.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	}
	
	public void arrowkey4() throws InterruptedException
	{
		dd4.click();
		dd4.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    dd4.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    dd4.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(1000);
	    dd4.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	}
	
	public void alphabetsdd3() throws InterruptedException
	{
		dd3.click();
		dd3.sendKeys("True");
		Thread.sleep(2000);
		dd3.sendKeys("False");
		Thread.sleep(2000);
	    dd3.sendKeys(Keys.ENTER);
	}
	
	public void alphabetsdd4() throws InterruptedException
	{
		dd4.click();
		dd4.sendKeys("InProgress");
		Thread.sleep(2000);
		dd4.sendKeys("Closed");
		Thread.sleep(2000);
	    dd4.sendKeys(Keys.ENTER);
	}
	public void dd3()
	{
		Select s = new Select(dd3);
		dd3.click();
		s.selectByIndex(2);
	}
	
	public void dd4()
	{
		Select s = new Select(dd4);
		dd4.click();
		s.selectByIndex(2);
	}
	
	
	public void view()
	{
		view.click();
	}
	
	public void cancelv()
	{
		cancelv.click();
	}
	
	public void map()
	{
		map.click();
	}
	
	public void fs()
	{
		fs.click();
	}
	
	
	
}
