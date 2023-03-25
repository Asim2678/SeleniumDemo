package TestNGFramework;

import org.testng.annotations.Test;

public class DisableTest {


    @Test
    public void tesMethodone(){
        System.out.println("Test method one");
    }

    @Test
    public void tesMethodtwo(){
        System.out.println("Test metthod two belongs to include group");
    }
    @Test(enabled = false)
    public void tesMethodthree(){
        System.out.println("Test method three belongs to 2 group");
    }
    @Test(enabled = true)
    public void tesMethodfour(){
        System.out.println("Test method three belongs to 2 group");
    }
}

