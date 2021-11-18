package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    private WebDriver driver;
    private By emailAddressField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("doLogin");


    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(emailAddressField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public accountpage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new accountpage(driver);
    }

}
