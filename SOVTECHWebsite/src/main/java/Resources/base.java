package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base
{
	public  WebDriver driver;
	public  Properties prop;
	public WebDriver initializedriver() throws IOException 
	{
	 prop=new Properties();
    FileInputStream fis =new FileInputStream("C:\\Users\\Megha\\eclipse-workspace\\SOVTECHWebsite\\src\\main\\java\\Resources\\data.properties");
    prop.load(fis);
   String browserName = prop.getProperty("browser");
   if(browserName.equals("chrome")) 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha\\eclipse-workspace\\E2EProject\\lib\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
   } 
   
   else if(browserName.equals("firefox"))
   {
	   System.setProperty("","C:\\Users\\Megha\\eclipse-workspace\\E2EProject\\lib\\geckodriver.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
   }
   else if(browserName.equals("IE")) {
	   System.setProperty("","C:\\Users\\Megha\\eclipse-workspace\\E2EProject\\lib\\IEDriverServer.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
   }
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   return driver;
}
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
    }
      
	

}