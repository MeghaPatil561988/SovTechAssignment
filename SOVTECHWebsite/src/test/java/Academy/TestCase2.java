package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.landingPage;

public class TestCase2 extends base{
	public WebDriver driver;
	base b=new base();
	
	@BeforeTest
	public void initialize() throws IOException {

		 driver=initializedriver();
		 driver.get(prop.getProperty("url")); 
	}
	@Test(priority=0)
	public void landigpagevalidation() throws InterruptedException 
	{
		landingPage l = new  landingPage(driver);
		
		 //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 
		 System.out.println(l.gettotallinks().size());
	     System.out.println("Page title is : " + driver.getTitle());
	     
	     Actions a = new Actions(driver);
	     WebElement move = l.getclients();
		 a.moveToElement(move).click().build().perform();
		 System.out.println("mouse hover on clients");
		 //l.getindustries().click();
		 a.moveToElement(l.getindustries()).click().perform();
		 System.out.println("clicked on industries");


		
	}
	@AfterTest()
    public void teardown() 
 {
    	driver.close();
 }
}
