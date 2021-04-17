package trackingNumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import FunctionLibrary.Library;
import configuration.Configuration;

public class SimpleRouteTestCases extends SimpleRouteBeforeAfterMethod
{

	//dr.findElement(By.id("")).click();
	//dr.findElement(By.xpath("")).click();

	WebDriver dr;
	Library lib;
	public SimpleRouteTestCases()
	{
		lib = new Library();	
		dr=lib.launchBrowser("Chrome");		
	}

	@Test (priority = 0)
	public void login()
	{
		//1.Login to CFA with valid credentials
		System.out.println("login");
		
		dr.get(Configuration.url);
		dr.findElement(By.id("email")).sendKeys("snehal.d@moentek.com");
		dr.findElement(By.id("password")).sendKeys("lmc2demo");
		dr.findElement(By.id("b1")).click();
		
	}
	
	@Test  (priority = 1) 
	public void createSimpleRouteTN() throws InterruptedException
	{
		//2.Navigate to Campaign & Tracking Number page

		System.out.println("Campaign And TrackingNumber Page");
		
		// Click on phone icon to got to campaign and tracking number page
		dr.findElement(By.xpath("//div/ul[@id = 'sidebar']//a[@ng-href='#/set-campaign']/i[@class= 'fa fa-phone']")).click();
		
		//click on edit to edit first campaign
		dr.findElement(By.xpath("//tr[@total-items='totalDataRows']/td/span[@class='actions-buttons']/button[@class='campaignbuttons btn btn-sm btn-primary'][1]")).click();
		
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(30);
		
		//click on 'Add Tracking Number' button to create a tracking number
		dr.findElement(By.xpath("//div[@ng-show='isTrackingNumbersOpen']/div/div/button[text() = 'Add Tracking Number']")).click();
	
		//Enter area code 
		dr.findElement(By.xpath("//input[@id='rateCenterAddress']")).sendKeys("385");;
		
		//Select 1st tracking number from the drop down
		dr.findElement(By.xpath("//a[text()='-ALPINE,UT']")).click();	
						
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='Name']")).sendKeys("Snehal tn1 - automation");
		
		//Select Ad source
		WebElement source=dr.findElement(By.xpath("//select[@ng-init=\"selectedCallFlow.channel = options[0]\"]"));
		Select sel1=new Select(source);
		sel1.selectByIndex(2);

		Thread.sleep(9000);

		WebElement tn=dr.findElement(By.xpath("//select[contains(@ng-required, 'singleNumber')]"));
		Select sel=new Select(tn);
		sel.selectByIndex(2);
	
		//Click Save button
		dr.findElement(By.xpath("//button[@ng-click= \"bCreateAnother=false\"]")).click();

	}
	
	@Test  (priority = 2) 
	public void editSimpleRouteTN() throws InterruptedException
	{
		
	}

	@Test  (priority = 3) 
	public void deleteSimpleRouteTN() throws InterruptedException
	{
		
	}

}
