import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnlyTestingblog {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String appurl = "https://adactinhotelapp.com/";

        driver.get(appurl);

        driver.findElement(By.partialLinkText("New User")).click();
        driver.findElement(By.name("tnc_box")).click();
       // Thread.sleep(2000);

        //driver.findElement(By.name("username")).sendKeys("Test1");
       // driver.findElement(By.className("reg_input")).sendKeys("Test1");
       // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Text 1");
        // xpath= //tagname[@attribute='value']
       // driver.findElement(By.cssSelector("#username")).sendKeys("Text1");
              // cssSelector #example for id

        WebElement ExpliciteWait = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.className("login_input")));//explicite wait

        driver.findElement(By.cssSelector(".reg_input")).sendKeys("Text1");


        //driver.findElement(By.id("Reset"))

        // cssSelector #example for class

        System.out.println("test pass");

       // driver.close();

    }
}
