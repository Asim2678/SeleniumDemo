package TestNGFramework;

import org.testng.annotations.Test;

// calculate the excution time for

public class TimeTest {


    @Test(timeOut = 500)// determin the time execution on test level
    public void testone() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Test meythod one called");

    }
    @Test(timeOut= 500)// this test will fail as it is taking more time that specified for the test execution
    public void testtwo() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Test meythod two  called");

    }
}

