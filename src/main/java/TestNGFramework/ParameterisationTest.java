package TestNGFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationTest {

    @Parameters("brorowser")
    @Test()
    public void Method01(String b) {
        System.out.println("Exectioning method 1" + b);
    }
}
