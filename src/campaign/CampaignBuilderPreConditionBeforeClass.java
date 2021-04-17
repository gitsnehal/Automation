package campaign;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CampaignBuilderPreConditionBeforeClass extends CampaignPreconditionBeforeTest
{
	
	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Campaign i.e. level 2 module
	//Class refers to campaign submodule - CampaignBuilder i.e. level 3 module

	
	@BeforeClass  // Campaign subModule - CampaignBuilder (Level 3) pre condition is set here , Level 2 is Campaign module
	public void CampaignListPreConditionBeforeClass()
	{
		System.out.println("Campaign Builder Pre Condition Before Class");
		
	}

	@AfterClass // Campaign subModule - CampaignBuilder (Level 3) pre condition is set here , Level 2 is Campaign module
	public void CampaignListPostConditionBeforeClass()
	{
		System.out.println("Campaign Builder Post Condition After Class");	
	}

}
