package TestNGFramework;

import org.testng.annotations.Test;

public class ParallelTest2 {
    @Test
    public void TestMethodOne(){
        @SuppressWarnings("deprecation")
        Long id =Thread.currentThread().getId();
        System.out.println("Class 1:Thread id of method one is :"+ id);

    }
    @Test
    public void TestMethodTwo(){
        @SuppressWarnings("deprecation")
        Long id =Thread.currentThread().getId();
        System.out.println("Class 1:Thread id of method one is :"+ id);

    }

}
