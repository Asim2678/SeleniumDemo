package PomCom1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersTest implements ITestListener {

    public void onStart(ITestContext context)
    {   //Invoked after the test class is instantiated and before any configuration method is called.
        System.out.println("onstart method started");
    }

    public void onTestStart(ITestResult result)
    {   //Invoked each time before a test will be invoked.
        System.out.println("New Test started :"+ result.getName());
    }


    public void onTestSuccess(ITestResult result)
    {   //Invoked each time a test succeeds.
        System.out.println("on Test sucess method:"+ result.getName());
    }

    public void onTestFailure(ITestResult result)
    {   //Invoked each time a test fails.
        System.out.println("on Test failure method:"+ result.getName());
    }

    public void onTestSkipped(ITestResult result)
    {   //Invoked each time a test is skipped.
        System.out.println("on Test failure method:"+ result.getName());
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {   /*
	Invoked each time a method fails but has been annotated with
	successPercentage and this failure
	still keeps it within the success percentage requested
	  */
        System.out.println("onTest Failed Bu tWithin Success Percentage:"+ result.getName());
    }


}
