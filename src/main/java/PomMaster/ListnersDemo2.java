package PomMaster;

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
@Listeners(TestListners.class)
public class ListnersDemo2 {
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
        appurl = "https://adactinhotelapp.com/";
    }

    @AfterTest
    public void CloseBrowser() {
        System.out.println("Close browser");
        driver.close();
    }
//    @Test
//    public void VerifyTitle() {
//
//        driver.get(appurl);
//        String expectedTitle = "Adactin.com - Hotel Reservation System";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(expectedTitle, actualTitle, "Title are not matching");
//
//    }

    @Test
    public void VerifyLogin() {

        driver.get(appurl);
        HotelLoginPage lp= new HotelLoginPage(driver);
        lp.doLogin("vtestuser02","selenium");
        String expectedTitle = "Adactin.com - Search Hotel";
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
        Assert.assertEquals(false, true);
    }



}


