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

public class DropdownDemo {
    @Test
    public void TestDropDown() throws InterruptedException {
        ChromeOptions chromeOptions;
        WebDriver driver;
        String appurl;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra.SCT\\Downloads\\Drivers\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        appurl = "https://www.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appurl);
       // WebElement ddnCars = driver.findElement(By.xpath("//input[@name='cars' and @value='bmw']"));

        WebElement ddnCars = driver.findElement(By.id("carselect"));
        Select sl = new Select(ddnCars);
        sl.selectByVisibleText("Honda");
        Thread.sleep(2000);
        System.out.println("Honda is Selected");
        sl.selectByIndex(0);
        Thread.sleep(2000);
        sl.selectByValue("benz");
       // sl.deselectByValue("benz");

// //code to select all items in dropdown
//        WebElement selectElem = driver.findElement(By.id("carselect"));
//        for (WebElement options : selectElem.findElements(By.tagName("options"))){
//       // if (options.getText().equals("Volvo (Sweden)")){
//
//            options.click();
//            Thread.sleep(5000);
//       // }
//
//
//
//        }



    }

}
