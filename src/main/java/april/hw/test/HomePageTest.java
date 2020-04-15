package april.hw.test;

import org.junit.Test;

public class HomePageTest  extends BaseTestClass{

    @Test(priority = 0)
    public void LogInTest() throws InterruptedException {
        logInPage.login("My Profile");

    }

    @Test(priority = 1)
    public void addProductToCardTest() throws InterruptedException {
        homePage.addProductToCart("Shopping Cart");
    }


}

