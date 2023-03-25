package TestNGFramework;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNGTest {
    @BeforeTest
    public void LanchBrowser()
    {
        System.out.println("Lauch The Browser");
    }
    @AfterTest
    public void CloseBrowser()
    {
        System.out.println("close The Browser");
    }

    @Test(priority = 1)
    public void firstTest(){
        System.out.println("This is my First Test");

    }
    @Test(priority = 3)
    public void secondTest(){
        System.out.println("This is my Second Test");

    }
    @Test(priority = 2)
    public void ThirdTest(){
        System.out.println("This is my Third Test");

    }
}
