package TestNGFramework;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionTest {
    @Test(expectedExceptions = IOException.class)
    public void testone() throws Exception {
        throw new IOException();

    }
    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void testtwo() throws Exception {
        throw new Exception();

    }// the test will fail when expected exception list does not match with the exeption thrown

}

