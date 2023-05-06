package TestNGFramework.ReportingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebElementsTesting2 {


    WebDriver driver;
    String appurl = "https://www.letskodeit.com/practice";
    ChromeOptions chromeOptions;

    @Test(priority = 1)
    public void VerifyRadioButton() throws InterruptedException {
        WebElement Radiobmw = driver.findElement(By.id("bmwradio"));
//        We need to create report log that should appear in the logs and explain our test
        Reporter.log("clicking on BMW radio button");
        Radiobmw.click();
        Thread.sleep(2000);
        Reporter.log("Verifying BMW radio button");
    }

    @Test(priority = 2)
    public void VerifyCheckbox() throws InterruptedException {
        Reporter.log("clicking on BMW checkbox button");
        WebElement Chkboxbwm = driver.findElement(By.id("bmwcheck"));
        Chkboxbwm.click();
        Thread.sleep(2000);
        Reporter.log(" BMW checkbox button selected");
    }

    @BeforeTest
    public void LaunchBrowser() {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\mabassra.SCT\\Downloads\\Drivers\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.get(appurl);
//        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra.SCT\\Downloads\\Drivers\\chromedriver.exe");
        Reporter.log("Lanch chrome browser");
        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(appurl);
        Reporter.log("Navigate to the application");
        System.setProperty("org.uncommons.reportng.escape-output","false");


    }

    @AfterTest

    public void closeBroser() {
        driver.close();

    }

    @Test(priority = 3)
    public void VerifyTitle() throws InterruptedException {
       // driver.get(appurl);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Practice Page");
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void VerifyHomePage() {
        System.out.println("Run afeter each test is executed");
        System.out.println(driver.getTitle());
       // Reporter.log("<a>Screenshot link<a>");
//        Reporter.log("<a href=\"C:\\immages\\Error2.jpg\"  \"target=\"_blank\">Screenshot link</a>");
//        Reporter.log("<br>");
//        Reporter.log("<a href=\"C:\\immages\\Error2.jpg\"  target=\"_blank\"><img height=200 scr=\"C:\\immages\\Error2.jpg\"></a>");
      //  Assert.fail();
        Assert.assertTrue(true);
    }

    @Test(priority = 5)
    public void isSkip() {
        throw new SkipException("skipping the test");
    }

}
