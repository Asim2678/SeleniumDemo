package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Radiobutton {
    @Test
    public void TestRadioButton() throws InterruptedException {
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
/*
        WebElement rdbutton1 = driver.findElement(By.xpath("//input[@name='cars' and @value='bmw']"));
        //input[@name='cars' and @value='bmw']    //input[@id='bmwradio']
        rdbutton1.click();
        System.out.println(rdbutton1.isSelected());

        WebElement rdbutton2 = driver.findElement(By.xpath("//input[@name='cars' and @value='honda']"));
        //input[@name='cars' and @value='bmw']    //input[@id='bmwradio']
        rdbutton2.click();// if i dont click it will not slicke and the result will be false
        System.out.println(rdbutton2.isSelected());
*/
        //muliple rado button with loop

       for (WebElement rb : driver.findElements(By.xpath("//input[@name='cars' and @type='radio']")))
       {

            rb.click();
           System.out.println(rb.isSelected());
            Thread.sleep(2000);
            System.out.println("Test pass");

        }

        //lear from teacher

    }
}
