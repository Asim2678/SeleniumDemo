package TestNGFramework.ReportReportNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
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
        Radiobmw.click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void VerifyCheckbox() throws InterruptedException {
        WebElement Chkboxbwm = driver.findElement(By.id("bmwcheck"));
        Chkboxbwm.click();
        Thread.sleep(2000);
    }

    @BeforeTest
    public void LaunchBrowser() {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\mabassra.SCT\\Downloads\\Drivers\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.get(appurl);
//        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra.SCT\\Downloads\\Drivers\\chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(appurl);


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
        Assert.fail();
    }

    @Test(priority = 5)
    public void isSkip() {
        throw new SkipException("skipping the test");
    }

}
