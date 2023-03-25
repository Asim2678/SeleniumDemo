import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

// checkbox test
public class CheckboxPartialText {

    public static void main (String[] args) throws InterruptedException {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\mabassra\\Downloads\\EdgeDriver\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
      // WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        String appurl = "https://adactinhotelapp.com/";

        driver.get(appurl);

        driver.findElement(By.partialLinkText("New User")).click();
        driver.findElement(By.name("tnc_box")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
