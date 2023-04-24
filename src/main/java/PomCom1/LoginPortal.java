package PomCom1;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnersTest.class)
public class LoginPortal {
    ChromeOptions chromeOptions;
    WebDriver driver;
    String appurl;


    @BeforeTest
    public void LaunchBrowser() {
        System.out.println("Launch browser");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        appurl = "https://www.test.cnsonline.co.uk/sso/sign-in";
    }

    @AfterTest
    public void CloseBrowser() {
        System.out.println("Close browser");
        driver.close();
    }


    @Test
    public void VerifyLogin() {

        driver.get(appurl);
        LoginpageOBJ lp= new LoginpageOBJ(driver);
        lp.doLogin("cnsadmin2","password");
        String expectedTitle = "Community Network Services Ltd | CNS";
        String actualTitle = lp.titleText();
        Assert.assertEquals(expectedTitle, actualTitle, "Title are not matching");

    }

    @Test
    public void SkipTest() {

        System.out.println("Skip test called");
        throw new SkipException("Skipping the test ");
    }

    @Test
    public void FailTest() {

        System.out.println("Fail test called");
        Assert.assertEquals(false, true + " : Test resultd does not match");
    }



}
