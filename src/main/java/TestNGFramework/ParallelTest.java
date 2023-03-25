package TestNGFramework;

import org.testng.annotations.Test;

public class ParallelTest {

    @Test(description = "login test")
    public void TestMethodOne(){
        @SuppressWarnings("deprecation")
        Long id =Thread.currentThread().getId();
        System.out.println("Thread id of method one is :"+ id);

    }
    @Test
    public void TestMethodTwo(){
        @SuppressWarnings("deprecation")
        Long id =Thread.currentThread().getId();
        System.out.println("Thread id of method one is :"+ id);

    }


}
