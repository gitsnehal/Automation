package cfaMainModule;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CFAProductBeforeAfterSuite
{
	// Suite refers to CFA suite
	@BeforeSuite
	public void oneTimeSetUp()
	{
		System.out.println("Before Suite");		
		System.out.println("CFA is at Suite Level Module i.e. Main Module");
		System.out.println("This method is the very first method to be called when we try to run CFA suite, which will do necessary set up before running CFA Suite");
		System.out.println("e.g. tasks like clean database , delete log files, restart services etc");
		System.out.println("*************--------------************");
		
	}

	@AfterSuite
	public void oneTimeTearDown()
	{
		System.out.println("After Suite");
		System.out.println("CFA is at Suite Level Module i.e. Main Module");	
		System.out.println("This method is the last method to be called when all other functions in CFA suite are executed which will do necessary tear down tasks");
		System.out.println("e.g. tasks like Revert back the suite level changes, Close all the suite level connections etc");
		System.out.println("*************--------------************");	
		
	}

}
