package campaign;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import cfaMainModule.CFAProductBeforeAfterSuite;

public class CampaignPreconditionBeforeTest extends CFAProductBeforeAfterSuite
{
	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Campaign i.e. level 2 module
	//Class refers to campaign submodule - CampaignList i.e. level 3 module
	
	
	@BeforeTest // Campaign Module (level 2) pre condition is written here , Level 1 is main module i.e. CFA
	public void campaignPreCondition() 
	{
		System.out.println("Campaign Pre condition - Before Test");
		System.out.println("***********");
		
	}
	
	@AfterTest // Campaign Module (level 2) post condition is written here , Level 1 is main module i.e. CFA
	public void campaignPostCondition()
	{
		System.out.println("Campaign post condition - After Test");
		System.out.println("***********");
	}
}
