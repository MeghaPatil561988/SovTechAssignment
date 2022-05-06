package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
WebDriver driver;


By name = By.id("your_name-c2e387f9-4bd8-496f-ab2a-81fbbc31712a");
By frame = By.xpath("//iframe[@id='hs-form-iframe-0']");
By email = By.id("email-c2e387f9-4bd8-496f-ab2a-81fbbc31712a");
By mobileno = By.id("mobilephone-c2e387f9-4bd8-496f-ab2a-81fbbc31712a");
By companysize = By.cssSelector("select#numemployees-c2e387f9-4bd8-496f-ab2a-81fbbc31712a");
By option = By.xpath("//select[@id='numemployees-c2e387f9-4bd8-496f-ab2a-81fbbc31712a']/option[2]");
By service = By.xpath("//select[@id='what_kind_of_problem_is_your_business_currently_facing_-c2e387f9-4bd8-496f-ab2a-81fbbc31712a']");
By serviceopt = By.xpath("//select[@id='what_kind_of_problem_is_your_business_currently_facing_-c2e387f9-4bd8-496f-ab2a-81fbbc31712a']/option[2]");
By message = By.xpath("//textarea[@id='message-c2e387f9-4bd8-496f-ab2a-81fbbc31712a']");
By termscondt = By.xpath("//input[@id='LEGAL_CONSENT.subscription_type_10841063-c2e387f9-4bd8-496f-ab2a-81fbbc31712a']");
By submit = By.xpath("//input[@class='hs-button primary large']");
By errormessage = By.xpath("(//ul[@data-reactid='.hbspt-forms-0.4.0']//label[1]");
By totallinks = By.tagName("a");
By clients = By.xpath("//span[text()='Clients']");
By industries = By.cssSelector("ul#menu-main-menu>li:nth-of-type(2)>ul>li:nth-of-type(2)>a>span");
By successmessage = By.xpath("//div[@class='section-title-wrap']//h2[1]");

public landingPage(WebDriver driver) 
{
	this.driver=driver;
}

public WebElement getName()
{
	return  driver.findElement(name);
}
public WebElement getFrame()
{
	return  driver.findElement(frame);
}
public WebElement getEmail() {
	return driver.findElement(email);
}
public WebElement getMobileNo() {
	return driver.findElement(mobileno);
}
public WebElement getcompanysize() {
	return driver.findElement(companysize);
}
public WebElement getoption() {
	return driver.findElement(option);
}
public WebElement getservice() {
	return driver.findElement(service);
}
public WebElement getserviceopt() {
	return driver.findElement(serviceopt);
}
public WebElement getmessage() {
	return driver.findElement(message);
}
public WebElement gettermscondt() {
	return driver.findElement(termscondt);
}
public WebElement getsubmit() {
	return driver.findElement(submit);
}
public WebElement geterrormessage() {
	return driver.findElement(errormessage);
}
public List<WebElement> gettotallinks(){
	return driver.findElements(totallinks);
}
public WebElement getclients() {
	return driver.findElement(clients);
}
public WebElement getindustries() {
	return driver.findElement(industries);
}
public WebElement getsuccessmessage() {
	return driver.findElement(successmessage);
}
}
