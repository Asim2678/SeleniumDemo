package TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAsserts1 {

    @Test
    public void tesMethodone(){
        System.out.println("Test method one");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(true, false);

        System.out.println("Iam using soft assertion" );


       // Assert.assertEquals(true, false);
        System.out.println("Iam using hard assertion" );

    }
    @Test
    public void tesMethodtwo(){
        System.out.println("Test metthod two belongs to include group");
    }
    @Test
    public void tesMethodthree(){
        System.out.println("Test method three belongs to 2 group");
    }
    @Test
    public void tesMethodfour(){
        System.out.println("Test method three belongs to 2 group");
    }
}


