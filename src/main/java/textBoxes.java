import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class textBoxes {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String appurl = "https://adactinhotelapp.com/";

        driver.get(appurl);
//        WebDriverWait mywaitvar =new WebDriverWait(driver, Duration.ofSeconds(10));
//        mywaitvar.until(ExpectedConditions.visibilityOf(login_input));
        WebElement ExpliciteWait = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.className("login_input")));//explicite wait

        driver.findElement(By.className("login_input")).sendKeys("HI");

        System.out.println("Test is completed");


//        WebDriverWait mywaitvar =new WebDriverWait(driver, Duration.ofSeconds(10));
//        mywaitvar.until(ExpectedConditions.visibilityOf("login_input"));


    }

}
