package homepagetests;

import Pages.hovermenu;
import base.basetests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class tests extends basetests {

    @Test
    public void cookieTest1() {
        boolean cookieButton = homepage.isClicable();
        assertTrue(cookieButton, " cookie button is not clicable");
    }

    @Test
    public void cookieTest() {

        homepage.getURL();

        assertEquals(homepage.getURL(), "https://www.footpatrol.com/", "incorrect URL");
    }


    @Test
    public void menuTest() {
        homepage.getMenuTitle();

        assertEquals(homepage.getMenuTitle(), "LAUNCHES", "incorrect");

    }

    @Test
    public void Links() {
        int numberOfFooterLinks = 14;
        homepage.getLinksSize();
        assertEquals(numberOfFooterLinks, homepage.getLinksSize());
        //Issue : Privacy policy link is not visible as the text is in white color "We will use your information in accordance with our Privacy Policy. - updated from 18/05/18"

    }

    @Test
    public void getLinksTitle() {

        String Title = homepage.getLinksTitle();

        assertTrue(Title.contains("Delivery & Returns"));
        assertTrue(Title.contains("Wishlist"));
        assertTrue(Title.contains("Something"), "Link title is incorrect");

    }

    @Test
    public void restocksLink() {
        homepage.acceptcookieelement();
        hovermenu menu = homepage.hoverOverFootwear();
        assertEquals(menu.getLinkText(), "RESTOCKS", "Incorrect");

    }

    @Test
    public void hoverOverMenu() {
        homepage.acceptcookieelement();
        hovermenu menu = homepage.hoverOverFootwear();
        // String restocks = "Restocks";
        assertTrue(menu.clickOnRestocks(), " Restocks link is not clicked");
    }


}


