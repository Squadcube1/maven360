package sg360.pageobjects;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviceManagement {
	
	WebDriver ldriver;
	
	public DeviceManagement(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/nav/ul/li[4]/div/span[2]")
	WebElement Dvmgt;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Search;
	
	@FindBy(xpath="//h5[normalize-space()='Filter']")
	WebElement Filter;
	
	@FindBy(xpath="//input[@id='DeviceId']")
	WebElement DeviceId;
	
	@FindBy(xpath="//select[@id='DeviceTypeId']")
	WebElement dd;
	
	@FindBy(xpath="//input[@id='SerialNo']")
	WebElement SerialNumber;
	
	@FindBy(xpath="//input[@id='BrandName']")
	WebElement BrandName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Filterbtn;
	
	@FindBy(xpath="//button[@class='themebtn-two']")
	WebElement Cancel;
	
	@FindBy(xpath="//span[@class='reset']//*[name()='svg']")
	WebElement Reset;
	
	@FindBy(xpath="//a[@name='Goto page2']")
	WebElement Page2;
	
	@FindBy(xpath="//a[@name='Goto page3']")
	WebElement Page3;
	
	@FindBy(xpath="//a[@name='Goto page4']")
	WebElement Page4;
	
	@FindBy(xpath="//a[@name='Goto page5']")
	WebElement Page5;
	
	@FindBy(xpath="//div[@class='e-next e-icons e-icon-next e-nextpage e-pager-default e-focused e-focus']")
	WebElement Next;
	
	@FindBy(xpath="//div[@class='e-last e-icons e-icon-last e-lastpage e-pager-default e-focused e-focus']")
	WebElement Last;
	
	@FindBy(xpath="//div[@class='e-prev e-icons e-icon-prev e-prevpage e-pager-default e-focused e-focus']")
	WebElement Previous;
	
	@FindBy(xpath="//div[@class='e-first e-icons e-icon-first e-firstpage e-pager-default e-focused e-focus']")
	WebElement First;
	
	public void Devicemgt()
	{
		Dvmgt.click();
	}
	
	public void searchbydevicetype() throws InterruptedException
	{
		Search.sendKeys("gateway");
		Thread.sleep(2000);
		Search.clear();
	}
	public void searchbybrandname() throws InterruptedException
	{
		Search.sendKeys("minew");
		Thread.sleep(2000);
		Search.clear();
	}
	
	public void searchbydeviceid() throws InterruptedException
	{
		Search.sendKeys("10");
		Thread.sleep(2000);
		Search.clear();	
	}
	
	public void searchbyserialno() throws InterruptedException
	{
		Search.sendKeys("device");
		Thread.sleep(2000);
		Search.clear();
	}
	
	public void searchbyversion() throws InterruptedException
	{
		Search.sendKeys("1.0");
		Thread.sleep(1000);
		Search.clear();
	}
	
	public void invalidsearch()
	{
		Search.sendKeys("gdt");
	}
	
	public void filterbydeviceid() throws InterruptedException
	{
		Filter.click();
		DeviceId.sendKeys("1");
		Thread.sleep(2000);
		Filterbtn.click();
		Thread.sleep(3000);
	}
	
	
	public void ddselectbyarrowkeys() throws InterruptedException
	{
		 Filter.click();
		 dd.click();
		 dd.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 dd.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 dd.sendKeys(Keys.ARROW_UP);
		 Thread.sleep(1000);
		 dd.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
	}
	
	public void ddselectbykeyboard() throws InterruptedException 
	{
		dd.click();
		dd.sendKeys("smoke");
		Thread.sleep(3000);
	    dd.sendKeys(Keys.ENTER);   
	}
	
	public void filterbyserialnumber() throws InterruptedException
	{ 
		 Filter.click();
		 SerialNumber.sendKeys("ac233fc099e4");
		 Filterbtn.click();
		 Thread.sleep(3000);	 
	}
	
	public void filterbyinvalidserialnumber() throws InterruptedException
	{
		 Filter.click();
		 SerialNumber.sendKeys("375");
		 Filterbtn.click();
		 Thread.sleep(3000);	
		 SerialNumber.clear();
		 Thread.sleep(3000);
	}
	
	public void filterbybrandname() throws InterruptedException
	{
		Filter.click();
		BrandName.sendKeys("minew");
		Filterbtn.click();
		Thread.sleep(3000);	
	}

	public void reset()
	{
	    Reset.click();
	}
	
	public void page2()
	{
        Page2.click();
	}
	
	public void page3()
	{
         Page3.click();
	}
	
	public void page4()
	{
        Page4.click();
	}
	
	public void page5()
	{
         Page5.click();
	}
	
	public void next()
	{
         Next.click();
	}
	
	public void last()
	{
         Last.click();
	}
	
	public void previous()
	{
         Previous.click();
	}
	
	public void start()
	{
         First.click();
	}
	
	
}
