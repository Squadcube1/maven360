package sg360.testcases;

import java.io.File;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import sg360.pageobjects.LoginPage;
import sg360.utilities.ReadConfig;

public class BaseClass {
ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
    public static WebDriver driver;
    
    public static Logger logger=Logger.getLogger("sg360");;
    
    @Parameters("browser")
    @BeforeTest
     public void setup(String br) throws InterruptedException
     {
          
          if(br.equals("chrome"))
          {
              System.setProperty("webdriver.chrome.driver" ,readconfig.getChromePath());
              driver=new ChromeDriver();
              
          }
          
          else  if(br.equals("edge"))
          {
              System.setProperty("webdriver.edge.driver" ,readconfig.getEdgepath());
             driver=new EdgeDriver();
          } 
        
        
        driver.get(baseURL);
        logger.info("Opening url...");
  	    driver.manage().window().maximize();
  	    Thread.sleep(5000);
  	    
  	    LoginPage lp = new LoginPage(driver);
  	    
		lp.setUserName(username);
		logger.info("Entering Username...");
		Thread.sleep(5000);
		
		lp.setPassword(password);
		logger.info("Entering Password...");
		Thread.sleep(5000);
		
		lp.clickSubmit();
		logger.info("Logging in...");
		Thread.sleep(15000);    
     }
    public static void ss(WebDriver cdriver,String image) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/"+image+".png");
		FileHandler.copy(source, destination);
	}
    @AfterTest
    public void tearDown()
    {
    	driver.close();
    }

}
