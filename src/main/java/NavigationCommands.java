import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implcit wait

        String appurl = "https://www.google.com/";
        driver.get(appurl);
        appurl = "https://www.amazon.com/";
        driver.get(appurl);
        try{
            File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Copy file at destination
            FileUtils.copyFile(SrcFile, new File("C:\\Users\\mabassra\\Downloads\\pics\\sample.png"));
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }

        driver.navigate().back();;
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.close();


    }




}
