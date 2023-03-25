package TestNGFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {


    @Parameters({"username"})
    @Test
    public void testone(String name) {
        System.out.println("Test meythod one called" );
        System.out.println("Test meythod one parameter is :" + name);

    }

    @Parameters({"password"})

    @Test
    public void testwo(String pwd) {

        System.out.println("Test meythod two called" );
        System.out.println("Test meythod two parameter is :" + pwd);

    }
}

