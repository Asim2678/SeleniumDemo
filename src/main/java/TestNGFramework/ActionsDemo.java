package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {

    @Test
    public void Webtabledmo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        String appurl = "https://jqueryui.com/selectable/";

        driver.get(appurl);
        driver.switchTo().frame(0);

        Actions builder =new Actions(driver);

        WebElement item01 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
        WebElement item04 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
        builder.clickAndHold(item01)
        .clickAndHold(item04)
        .click()
        .perform();



    }
}
