import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialText {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String appurl = "https://adactinhotelapp.com/";

        driver.get(appurl);

        driver.findElement(By.partialLinkText("New User")).click();
        driver.findElement(By.name("tnc_box")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
