package TestNGFramework;

import org.testng.annotations.Test;

public class GroupTests {

    @Test(priority = 1, groups = "Module01")
    public void Method01(){
        System.out.println("Exectioning method 1");
    }
    @Test(priority = 5,groups = "Module01")
    public void Method02(){
        System.out.println("Exectioning method 2");
    }
    @Test(priority = 2,groups = {"Module01", "Module02"})
    public void Method03(){
        System.out.println("Exectioning method 3");
    }
    @Test(priority = 4,groups = "Module02")
    public void Method04(){
        System.out.println("Exectioning method 4");
    }
    @Test(priority = 3,groups = "Module02")
    public void Method05(){
        System.out.println("Exectioning method 5");
    }
}

