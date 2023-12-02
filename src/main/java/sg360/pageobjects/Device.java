package sg360.pageobjects;

import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Device {

WebDriver ldriver;
	
public Device(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/nav/ul/li[3]/div/span[2]")
	WebElement Devicestatus;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Searchbtn;
	
	@FindBy(xpath="//h5[normalize-space()='Filter']")
	WebElement Filterbtn;
	
	@FindBy(xpath="//input[@id='UserName']")
	WebElement textbox;
	
	@FindBy(xpath="//select[@id='DeviceTypeId']")
	WebElement dd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[@class='themebtn-two']")
	WebElement cancel;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]/*[name()='svg'][1]")
	WebElement refresh;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement expand;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[3]/div[3]/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[2]/th[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/a")
	WebElement expandd;
	
    @FindBy(xpath="/html/body/div[1]/div[2]/div[3]/div[3]/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[2]/th[2]/div/div[3]/div/table/tbody/tr[2]/th[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/a")
	WebElement expanddd;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[4]/div[2]/a[1]")
	WebElement page2;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[4]/div[3]/a[1]")
	WebElement page3;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[6]")
	WebElement next;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[7]")
	WebElement last;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]")
	WebElement previous;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]")
	WebElement start;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[2]/span[1]/div[1]/div[2]/a[1]")
	WebElement lowbattery;
	
	@FindBy(xpath="//a[normalize-space()='Last 24 Hrs Comm Fails']")
	WebElement commfails;
	
	public void clickdevicestatus()
	{
		Devicestatus.click();
	}
	
	public void search()
	{
		Searchbtn.sendKeys("tester");
	}
	
	public void invalidsearch()
	{
		Searchbtn.sendKeys("a2");
	}
	
	public void specialcharacter()
	{
		Searchbtn.sendKeys("@");
	}
	
	public void filter()
	{
		Filterbtn.click();
	}
	
	
	public void ddselectbyarrowkeys() throws InterruptedException
	{
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
	
	public void selectbykeyboard() throws InterruptedException 
	{
		dd.click();
		dd.sendKeys("Door");
		Thread.sleep(3000);
	    dd.sendKeys(Keys.ENTER);   
	}
	
	public void textbox()
	{
		textbox.sendKeys("tes");
	}
	
	public void submit()
	{
		submit.click();
	}
	
	public void cancel()
	{
		cancel.click();
	}
	
	public void refresh()
	{
		refresh.click();
	}
	
	public void expand()
	{
		expand.click();
	}
	
	public void expandd()
	{
		expandd.click();
	}
	

	public void expanddd()
	{
		expanddd.click();
	}
	
	public void page2()
	{
         page2.click();
	}
	
	public void page3()
	{
         page3.click();
	}
	
	public void next()
	{
         next.click();
	}
	
	public void last()
	{
         last.click();
	}
	
	public void previous()
	{
         previous.click();
	}
	
	public void start()
	{
         start.click();
	}
	
	public void lowbattery()
	{
         lowbattery.click();
	}
	
	public void commfails()
	{
         commfails.click();
	}
}

