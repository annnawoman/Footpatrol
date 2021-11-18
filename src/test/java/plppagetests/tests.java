package plppagetests;

import base.basetests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import Pages.plppage;
import org.testng.annotations.Test;

public class tests extends basetests {
    @Test
    public void getplpHeaderTitle() {
        homepage.acceptcookieelement();
        homepage.findsearch();
        String plpheaderTitle = "Adidas";
        plppage plpPage = homepage.enterText(plpheaderTitle);

        assertEquals(plpPage.getSearchResult(), plpheaderTitle, "PLP header is incorrect");


    }

    @Test
    public void selectedOptionsTest() {
        homepage.acceptcookieelement();
        homepage.findsearch();
        plppage plppage = homepage.enterText("Adidas");
        String option = "Latest";
        plppage.selectFromDropdown(option);
        var selectedOptions = plppage.getSelectedSortingOptions();

        assertEquals(selectedOptions.size(), 1, "incorrect");
        assertTrue(selectedOptions.contains(option), "Incorrect");

    }

    @Test
    public void selectFilter() {
        homepage.acceptcookieelement();
        homepage.findsearch();
        plppage search = homepage.enterText("Adidas");

        assertTrue(search.selectedFilterIsDisplayed(), "white filter is not selected");


    }
}