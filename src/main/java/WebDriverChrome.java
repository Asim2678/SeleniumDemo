import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {


    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        try {
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            driver.getTitle();
        }catch (Exception ex){
            System.out.println("error " + ex);
        }
        finally
        {
            driver.close();
        }
    }

}
