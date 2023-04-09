package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MulaiSelect {
    @Test
    public void TestMultiSelect() throws InterruptedException {
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
        // WebElement ddnCars = driver.findElement(By.xpath("//input[@name='cars' and @value='bmw']"));
        WebElement ddnCars = driver.findElement(By.id("multiple-select-example"));
        Select sl = new Select(ddnCars);

        sl.selectByIndex(1);

        sl.selectByIndex(2);
        System.out.println(sl.getAllSelectedOptions().size());
        sl.deselectByIndex(2);
        System.out.println(sl.getAllSelectedOptions());
        //complete with help

    }
}
