package TestNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SamploeDataProvider {

    @DataProvider(name = "browserdata")
    public Object [] [] dataProviderMethod(){
        return new Object [] [] {{"chome"}, {"firefox"}, {"safari"}, {"ie"}};

    }
    @Test(dataProvider= "browserdata")

    public void testMethod(String data){
        System.out.println("browser executed :"+data);
    }

}
