package april.hw.test;

import org.junit.Test;

public class LogInPageTest extends BaseTestClass {


        @Test
        public void loginTest() throws InterruptedException {
            System.out.println("Login Page Verification items:    ==========");
            //System.out.println(logInPage.login(""));

            logInPage.loginLogOut("My Profile");
            System.out.println("========= Assertion Passed ======");

        }



    }
}
