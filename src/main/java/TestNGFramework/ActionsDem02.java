package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsDem02 {

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

        appurl = "https://jqueryui.com/slider/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appurl);

        driver .switchTo().frame(0);
        WebElement item01 = driver.findElement(By.id("slider"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(item01, 10, 0).build();
        action.perform();
    }
}
