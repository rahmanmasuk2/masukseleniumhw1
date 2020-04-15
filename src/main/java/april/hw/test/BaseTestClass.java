package april.hw.test;

import april.hw.base.HomePage;
import april.hw.base.LogInPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestClass  {

    protected LogInPage logInPage;
    protected HomePage homePage;
    public WebDriver driver;
    private Object WebDriverManager;


    @BeforeClass
    public void setUpMethod(){
        initilization();
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDownMethod(){
        if(driver != null){
            driver.quit();
        }

    }


    public void initilization(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo.broadleafcommerce.org/");

    }
}
}
