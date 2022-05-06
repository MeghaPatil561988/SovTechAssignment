package Academy;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.landingPage;


public class LandingPagetestcase extends base{
	public WebDriver driver;
	base b=new base();
	
	@BeforeTest
	public void initialize() throws IOException {

		 driver=initializedriver();
		 driver.get(prop.getProperty("url")); 
	
	}
	
	@Test(priority=0)
	public void contactUsPage() throws InterruptedException 
	{
		 
		
		
		 landingPage l = new  landingPage(driver);
		 Actions actions = new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 
		 

		 driver.switchTo().frame(l.getFrame());
		 l.getName().clear();
		 l.getName().sendKeys("Megha");
		 
		 l.getName().clear();
		 l.getEmail().sendKeys("patilmegha.m5@gmail.com");
		 
		 l.getName().clear();
		 l.getMobileNo().sendKeys("612402764");
		 
		 WebElement dropdown = l.getcompanysize(); 
		 actions.moveToElement(dropdown).click().perform();
		 //Thread.sleep(2000);
		 WebElement hoverElement = l.getoption();
		 hoverElement.click();
		 
		 actions.moveToElement(l.getservice()).click().perform();
		 //Thread.sleep(2000);
		 WebElement hover = l.getserviceopt();
		 hover.click();
		 l.getmessage().sendKeys("I am looking for IT Solutions");
		 
		 //Assert.assertTrue(l.getmessage().isSelected());
		 l.gettermscondt().click();
		 Assert.assertFalse(l.getmessage().isSelected());
		 
		 l.getsubmit().click();
		
			String actualtext;
			String expttext = "Submission Successful";
			actualtext=l.getsuccessmessage().getText();
			System.out.println("Submission Successfully displayed "+actualtext);
			Assert.assertEquals(actualtext,expttext);
			
		
	}	 
	
	 @AfterTest()
	    public void teardown() 
	 {
	    	driver.close();
	 }
	 
}
