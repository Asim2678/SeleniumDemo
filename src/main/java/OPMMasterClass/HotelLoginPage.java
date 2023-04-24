package OPMMasterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelLoginPage {
    WebDriver driver;

    public HotelLoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    // identify all web elements
    By username=By.xpath("//input[@id='username']");
    By password=By.xpath("//input[@id='password']")	;
    By btnLogin=By.xpath("//input[@id='login']")	;

    public void setUsername(String strUsername )
    {
        driver.findElement(username).sendKeys(strUsername);
    }

    public void setPassword(String strPassword )
    {
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin()
    {
        driver.findElement(btnLogin).click();
    }

    public String titleText()
    {

        String strtitle=driver.getTitle();
        return strtitle;
    }

    public void doLogin(String strUsername,String strPassword)
    {
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.clickLogin();

    }

}


