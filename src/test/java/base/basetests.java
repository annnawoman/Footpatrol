package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Pages.homepage;

import java.util.concurrent.TimeUnit;

public class basetests {
    private WebDriver driver;

    protected homepage homepage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\annnawoman\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.footpatrol.com/");

        driver.manage().window().maximize();

        homepage = new homepage(driver);

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://www.footpatrol.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
