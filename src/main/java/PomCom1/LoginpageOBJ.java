package PomCom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginpageOBJ {
    WebDriver driver;

    public LoginpageOBJ(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//input[@id='sso_username']");
    By password = By.xpath("//input[@id='sso_password']");
    By btsignin = By.xpath("//button[@id='signinButton']");

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
        driver.findElement(btsignin).click();
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
