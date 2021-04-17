package campaign;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CampaignBuilderActualTestCases extends CampaignBuilderPreConditionBeforeMethod
{

	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Campaign i.e. level 2 module
	//Class refers to campaign submodule - CampaignBuilder i.e. level 3 module
	//Method refers to campaign submodule - CampaignBuilder test cases  i.e. level 4 module
		
	@Test
	public void checkCreateCampaign()
	{
		System.out.println("check Create Campaign");
	}
	
	@Test
	public void checkEditCampaign()
	{
		System.out.println("check Edit Campaign");
	}
	
	
}
