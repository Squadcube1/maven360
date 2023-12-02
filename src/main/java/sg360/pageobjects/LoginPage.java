package sg360.pageobjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
          
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/form/section/div/div/div[2]/div/div[2]/div/div[2]/button")
	WebElement login;
	
	@FindBy(linkText="Forgot Password?")
	WebElement Forgotpassword;
	
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		login.click();
	}
	
	public void clickfp()
	{
		Forgotpassword.click();
	}
	
	
	
	
	
	
	
}
