

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//import java.util.List;

public class homepage {
    private WebDriver driver;
    private By cookie1 = By.cssSelector("div[class='bannerButtons'] button[class='btn btn-level1 accept-all-cookies']");
    private By myaccountbutton = By.cssSelector("div[id='usermenu'] a[data-ip-position='header-sign in']");
    private By searchfield = By.id("searchButton");
    private By searchfield1 = By.cssSelector("div[id='search']  input");
    private By footer = By.cssSelector("div[id='newFooterContainer']");
    private By footwearBox = By.cssSelector("a[data-ip-position='footwear-header-menu' ]");
    private By restocks = By.cssSelector("href=/footwear/?facet-campaign=restocks");


    public homepage(WebDriver driver) {
        this.driver = driver;
    }

    public homepage acceptcookieelement() {

        driver.findElement(cookie1).click();

        return new homepage(driver);
    }

    public boolean isClicable() {
        WebElement cookie = driver.findElement(cookie1);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookie));
        return true;
    }


    public String getURL() {

        driver.getCurrentUrl();
        return driver.getCurrentUrl();
    }

    public String getMenuTitle() {

        String Title = driver.findElement(By.cssSelector("a[data-ip-position='launches-header-menu']")).getText();
        return Title;

    }

    public loginpage clickMyAccountLink() {
        driver.findElement(myaccountbutton).click();
        return new loginpage(driver);
    }

    public void findsearch() {
        driver.findElement(searchfield).click();
    }

    public plppage enterText(String searchword) {
        driver.findElement(searchfield1).sendKeys(searchword, Keys.ENTER);
        return new plppage(driver);

    }

    public int getLinksSize() {
        WebElement footer1 = driver.findElement(footer);
        List<WebElement> i = footer1.findElements(By.tagName("a"));
        return i.size();
    }

    public String getLinksTitle() {
        WebElement footer1 = driver.findElement(footer);
        List<WebElement> footerLinks = footer1.findElements(By.tagName("a"));
        return footer1.getText();
    }

    public hovermenu hoverOverFootwear() {
        Actions actions = new Actions(driver);

        WebElement figure = driver.findElement(footwearBox);
        actions.moveToElement(figure).perform();
        return new hovermenu(driver);
    }


}


