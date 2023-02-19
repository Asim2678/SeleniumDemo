import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BBCnewsmovingtext {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mabassra\\Downloads\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            String appurl = "https://www.bbc.co.uk/";
            driver.get(appurl);
            List<WebElement> elements = driver.findElements(By.tagName("a"));//ancre tag
            System.out.println("Total number of elements :" +elements.size());

            for (WebElement element:elements){
                if(element.getText().length()>0)
                    System.out.println(element.getText());
                driver.close();
            }
        }
    }

