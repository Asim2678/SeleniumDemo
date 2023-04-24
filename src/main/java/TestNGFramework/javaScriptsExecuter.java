package TestNGFramework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class javaScriptsExecuter {

    @Test
    public void TestDropDown() throws InterruptedException {
        ChromeOptions chromeOptions;
        WebDriver driver;
        String appurl;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(chromeOptions);

        appurl = "https://www.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appurl);
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");


    }

}
