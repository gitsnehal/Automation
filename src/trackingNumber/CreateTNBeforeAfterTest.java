package trackingNumber;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import cfaMainModule.CFAProductBeforeAfterSuite;

public class CreateTNBeforeAfterTest extends CFAProductBeforeAfterSuite
{

	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Tracking Number i.e. level 2 module
	//Class refers to individual route types submodule - ex. Simple Route  i.e. level 3 module

	@BeforeTest // Tracking Number (level 2) pre condition is written here , Level 1 is main module i.e. CFA
	public void trackingNumberPreCondition() 
	{
		System.out.println("trackingNumber Pre condition - Before Test");		
	}
	
	@AfterTest // Campaign Module (level 2) post condition is written here , Level 1 is main module i.e. CFA
	public void trackingNumberPostCondition()
	{
		System.out.println("tracking Number post condition - After Test");
	}

}

