import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String appurl = "https://www.google.com/";
        driver.get(appurl);
        appurl = "https://www.amazon.com/";
        driver.get(appurl);
        driver.navigate().back();;
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.close();


    }




}
