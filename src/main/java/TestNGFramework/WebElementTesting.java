package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementTesting {

    WebDriver driver;

    @BeforeTest

    public void lanchBrowser(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\mabassra\\Downloads\\EdgeDriver\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        String courseurl = "https://courses.letskodeit.com/practice";
        driver.get(courseurl);

    }
    @AfterTest

    public void closeBroser(){
        driver.close();

    }

@Test(priority = 2)
    public void VerifyCehckbox() throws InterruptedException {

        WebElement Radio1= driver.findElement(By.id("bmwradio"));
        Radio1.click();
        Thread.sleep(2000);

    }
    @Test(priority = 1)
    public void VerifyRadioButton() throws InterruptedException {

        WebElement Radio2= driver.findElement(By.id("bmwcheck"));
        Radio2.click();
        Thread.sleep(2000);

    }
}
