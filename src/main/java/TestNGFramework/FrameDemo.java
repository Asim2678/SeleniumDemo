package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FrameDemo {


    @Test
    public void Webtabledmo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        String appurl = "https://www.letskodeit.com/practice";

        driver.get(appurl);
        driver .switchTo().frame("courses-iframe");
        WebElement signin =  driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signin.click();
        System.out.println("success");
        driver.switchTo().defaultContent();

        WebElement rdbutton2 = driver.findElement(By.xpath("//input[@name='cars' and @value='honda']"));
        //input[@name='cars' and @value='bmw']    //input[@id='bmwradio']
        rdbutton2.click();// if i dont click it will not slicke and the result will be false
        System.out.println(rdbutton2.isSelected());

    }

}
