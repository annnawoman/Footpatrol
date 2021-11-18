package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class hovermenu {
    private WebDriver driver;
    private By restocks = By.cssSelector("a[ href='/footwear/?facet-campaign=restocks']");

    public hovermenu(WebDriver driver) {
        this.driver = driver;
    }

    public boolean clickOnRestocks() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(restocks)).click().perform();
        return true;
    }

    public String getLinkText() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(restocks)).perform();
        return driver.findElement(restocks).getText();
    }

}


