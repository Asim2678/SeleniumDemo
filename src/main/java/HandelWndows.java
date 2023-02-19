import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandelWndows {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implcit wait

        String appurl = "https://only-testing-blog.blogspot.com/2014/01/textbox.html";

        driver.get(appurl);
        driver.findElement(By.linkText("Open New Page")).click();
        Thread.sleep(2000);
        Set<String> s = driver.getWindowHandles();
        Iterator<String > it = s.iterator();
        it.next();
        String w2nd = it.next();
        driver.switchTo().window(w2nd);
        driver.findElement(By.id("fname")).sendKeys("Hello");
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
