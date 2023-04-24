package OPMMasterClass;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListners.class)
public class ListernsDemo {
//    ChromeOptions ChromeOptions;
//    WebDriver driver;

    @Test
    public void OpenBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

       String appurl = "https://adactinhotelapp.com/";
      driver.get(appurl);
        String expectedTitle = "Adactin.com - Hotel Reservation System";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.close();


//        String expectedTitle = "Adactin.com - Hotel Reservation System";
//        Sltring actualTitle = driver.getTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);


    }


}
