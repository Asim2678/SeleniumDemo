package TestNGFramework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {


    @Test
    @Parameters({"browser", "url"})
    public void testMethodone(@Optional("Firfox") String tetParameters1, @Optional ("http://google.com")String testParameters2) {
        System.out.println("Test parameter1 :"+ tetParameters1 );
        System.out.println("Test parameter2 :"+ testParameters2 );

    }
    @Test
    @Parameters({"username"})
    public void testMethodTwo(@Optional("shaker")String name){
    System.out.println("Parameters one for test method two :" +name);
    }
}
