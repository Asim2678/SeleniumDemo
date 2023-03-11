
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverChrome2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // declaration and instantiation of objects/variables
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.edge.driver", "C:\\Users\\mabassra\\Downloads\\EdgeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.selenium.dev/");
        try
        {
	    	 /*
	    // Click on the search text box and send value
	    driver.findElement(By.name("q")).sendKeys("selenium");

	    // Click on the search button
	    driver.findElement(By.name("btnK")).click();
	    Thread.sleep(1000);
	    */
            System.out.println("Tile of page "+driver.getTitle());

            String actualTitle=driver.getTitle();
            String expectedTitle="Selenium";
            if(actualTitle.equals(expectedTitle))
            {
                System.out.println("Verification successful correct url is opened ");
            }
            else
            {
                System.out.print("Verification failed  incorret url");
            }
        }
        catch(Exception ex)
        {
            System.out.println("error"+ex);
        }
        finally
        {
            driver.close();
        }
    }
}



