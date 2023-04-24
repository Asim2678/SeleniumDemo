package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableDemo {

    @Test
    public void Webtabledmo() throws InterruptedException {
        ChromeOptions chromeOptions;
        WebDriver driver;
        String appurl;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver2\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        appurl = "https://www.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appurl);

        /*
        rows and columns
        htmls --- table , tr, td, th
        th =  headers
        tr = row === tr will give me the number of rows
        td = colum, cell




        Step 1= identify rows and columns of table
        int rwo_cout = driver.findElement(By.xpath("//tble[@id='product']/tbody/tr")).size();
         System.out.println("number of rows" + rwo_cout);

  */
        // no of rows in a table
        int row_count = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
        System.out.println("Number of rows : " + row_count);

        // no of columns in a table
        int col_count = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td")).size();
        System.out.println("Number of columns : " + col_count);


        // print value from the table
        System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/td[2]")).getText());

        for (int i = 2; i <= row_count; i++) {

            System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[" + i + "]/td[2]")).getText());
            System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[" + i + "]/td[3]")).getText());

        }
        for (int i = 2; i <= row_count; i++) {
            for (int j = 1; j <= col_count; j++)
                System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[" + i + "]/td[" + j + "]")).getText());
            System.out.print("\u0009");
        }
        System.out.println("");

    }
}
