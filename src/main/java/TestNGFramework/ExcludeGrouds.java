package TestNGFramework;

import org.testng.annotations.Test;

public class ExcludeGrouds {


    @Test(groups = "include-group")
    public void tesMethodone(){
        System.out.println("Test method one");
    }
    @Test(groups = "include-group")
    public void tesMethodtwo(){
        System.out.println("Test metthod two belongs to include group");
    }
    @Test(groups = {"exclude-group"})
    public void tesMethodthree(){
        System.out.println("Test method three belongs to 2 group");
    }
    @Test(groups = { "exclude-group"})
    public void tesMethodfour(){
        System.out.println("Test method three belongs to 2 group");
    }
}
