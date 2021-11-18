package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class plppage {

    private WebDriver driver;
    private By headerListingTitle = By.cssSelector("div[id='productListTitle'] h1");
    private By dropdown = By.cssSelector("select[data-e2e=plp-sortBy-select]");
    private By whitefilter = By.cssSelector("a[class='filterLink colourWhite white ga-ip']");


    public plppage(WebDriver driver) {
        this.driver = driver;
    }


    public String getSearchResult() {

        return driver.findElement(headerListingTitle).getText();
    }


    private Select findDropdownElement() {

        return new Select(driver.findElement(dropdown));
    }


    public void selectFromDropdown(String option) {

        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedSortingOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    public boolean selectedFilterIsDisplayed() {
        try {
            WebElement White = driver.findElement(whitefilter);
            if (White.isDisplayed()) {
                White.click();
                System.out.println("white filter is selected");
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return true;
    }

}






