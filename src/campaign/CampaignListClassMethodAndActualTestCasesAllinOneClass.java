package campaign;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CampaignListClassMethodAndActualTestCasesAllinOneClass extends CampaignPreconditionBeforeTest
{
	
	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Campaign i.e. level 2 module
	//Class refers to campaign submodule - CampaignList i.e. level 3 module
	
	@BeforeClass  // Campaign subModule - CampaignList (Level 3) pre condition is set here , Level 2 is Campaign module
	public void CampaignListPreConditionBeforeClass()
	{
		System.out.println("Campaign List Pre Condition Before Class");
		System.out.println("***********************");
		
	}

	@AfterClass // Campaign subModule -CampaignList (Level 3) pre condition is set here , Level 2 is Campaign module
	public void CampaignListPostConditionBeforeClass()
	{
		System.out.println("Campaign List Post Condition After Class");	
		System.out.println("***********************");
	}

	@BeforeMethod
	public void CampaignListPreTestCaseBeforeMethod()
	{
		System.out.println("Campaign List Pre Test Case Before Method");
		System.out.println("reload the page, clear db tables, delete log files");
		System.out.println("***********************");

	}
	
	@AfterMethod
	public void CampaignListPostTestCaseAfterMethod()
	{
		System.out.println("Campaign List Post Test Case After Method");
		System.out.println("Check the status of test case and capture screenshot on failure");
		System.out.println("***********************");

	}
	
	@Test
	public void checkListOfCampaigns()
	{
		System.out.println("check List Of Campaigns");
	}
	
	@Test
	public void checkTrackingNumbersOfCampaign()
	{
		System.out.println("check Tracking Numbers Of Campaign");
	}

	@Test
	public void exportCampaignsandTrackingNumbers()
	{
		System.out.println("export Campaigns and Tracking Numbers");
	}


}
