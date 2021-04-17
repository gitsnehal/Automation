package trackingNumber;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SimpleRouteBeforeAfterClass extends CreateTNBeforeAfterTest 
{

	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Tracking Number i.e. level 2 module
	//Class refers to simple route tracking number submodule i.e. level 3 module

	
	@BeforeClass  // Campaign subModule - CampaignBuilder (Level 3) pre condition is set here , Level 2 is Campaign module
	public void simpleRoutePreConditionBeforeClass()
	{
		System.out.println("simple Route Pre Condition Before Class");
		
	}

	@AfterClass // Campaign subModule - CampaignBuilder (Level 3) pre condition is set here , Level 2 is Campaign module
	public void simpleRoutePostConditionBeforeClass()
	{
		System.out.println("simple Route Post Condition After Class");	
	}

}
