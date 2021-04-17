package trackingNumber;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SimpleRouteBeforeAfterMethod extends SimpleRouteBeforeAfterClass
{
	//Suite refers to CFA i.e. main module or level 1 module
	//Test refers to Tracking Number i.e. level 2 module
	//Class refers to Simple Route submodule i.e. level 3 module
	//Method refers to Simple Route  test cases  i.e. level 4 module

	@BeforeMethod
	public void SimpleRoutePreConditionBeforeMethod()
	{
		System.out.println("Simple Route Pre Test Case Before Method");

	}
	
	@AfterMethod
	public void SimpleRoutePostConditionAfterMethod()
	{
		System.out.println("Simple Route Post Test Case After Method");

	}



	
}
