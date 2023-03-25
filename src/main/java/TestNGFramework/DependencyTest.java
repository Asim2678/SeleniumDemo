package TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test (dependsOnMethods = {"Login"})
    public void fundTransfer(){
        System.out.println("Fund Transfer method called");
    }
    // the first test will only pass if the second test is executed and pass
    @Test
    public void Login(){
        System.out.println("LoginMethod called");
        Assert.assertTrue(false);
    }
}
