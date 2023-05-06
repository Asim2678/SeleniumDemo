package TestNGFramework.ReportingExtentReport;



    import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

    public class TestCase2 {

        @Test
        public void doLogin() {
            ExtentTestManager.getTest().log(Status.INFO, "doLogin test started");
            System.out.println("Executing Login Test");
            ExtentTestManager.getTest().log(Status.INFO, "doLogin test completed");
        }

        @Test
        public void doUserReg() {
            ExtentTestManager.getTest().log(Status.INFO, "doUserReg test started");
            Assert.fail("User Reg Test Failed");
            ExtentTestManager.getTest().log(Status.INFO, "doUserReg test completed");
        }

        @Test
        public void isSkip() {
            ExtentTestManager.getTest().log(Status.INFO, "Skipping the test case");
            throw new SkipException("Skipping the test case");
        }

    }


