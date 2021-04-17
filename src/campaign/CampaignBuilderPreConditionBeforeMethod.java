package campaign;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CampaignBuilderPreConditionBeforeMethod extends CampaignBuilderPreConditionBeforeClass
{
	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Campaign i.e. level 2 module
	//Class refers to campaign submodule - CampaignBuilder i.e. level 3 module
	//Method refers to campaign submodule - CampaignBuilder test cases  i.e. level 4 module

	@BeforeMethod
	public void CampaignBuilderPreTestCaseBeforeMethod()
	{
		System.out.println("Campaign Builder Pre Test Case Before Method");

	}
	
	@AfterMethod
	public void CampaignBuilderPostTestCaseAfterMethod()
	{
		System.out.println("Campaign Builder Post Test Case After Method");

	}

}
