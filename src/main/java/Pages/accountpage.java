package Pages;

import org.openqa.selenium.WebDriver;

public class accountpage {
    private WebDriver driver;

    public accountpage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyaccountURL() {
        String myaccountUrl = driver.getCurrentUrl();
        return myaccountUrl;
    }
}
