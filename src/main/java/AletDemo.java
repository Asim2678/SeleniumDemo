import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AletDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String appurl = "http://register.rediff.com/register/register.php?FormName=user_details";

        driver.get(appurl);

        driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Hello");

        // //*[containts(test(), 'name')]  if name is changing every time than we can user locatio
        driver.findElement(By.id("Register")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
    }
}
