package loginpagetests;

import base.basetests;

import static org.testng.Assert.assertEquals;

import Pages.loginpage;
import Pages.accountpage;

import org.testng.annotations.Test;

public class tests extends basetests {


    @Test
    public void successfulLogin() {
        homepage.acceptcookieelement();
        loginpage loginpage = homepage.clickMyAccountLink();
        loginpage.setUsername("anna.shawjdplctest@gmail.com");
        loginpage.setPassword("Test1234");

        accountpage accountpage = loginpage.clickLoginButton();
        String expectedURL = "https://www.footpatrol.com/myaccount/dashboard/";
        assertEquals(accountpage.getMyaccountURL(), expectedURL);
        System.out.println("Login successful");

    }
}
