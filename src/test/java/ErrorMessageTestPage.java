import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.SignUpPage;

import java.time.Duration;

public class ErrorMessageTestPage {

    private WebDriver driver;
    SignUpPage page1;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hostelworld.com/signup/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.navigate().to("https://www.hostelworld.com/signup/");
    }


    @Test
    public void userNameErrorMessageTest() {
        page1 = new SignUpPage(driver);
        page1.clickOnSingUpButton();
        String str = page1.getTextFirstErrorMessage();
        System.out.println("Message is + " + str);
        Assert.assertEquals(str, "Please Enter A Valid Username");
    }



    @Test
    public void emailErrorMessageTest() {
        page1 = new SignUpPage(driver);
        page1.clickOnSingUpButton();
        String str = page1.getTextSecondErrorMessage();
        System.out.println("Message is + " + str);
        Assert.assertEquals(str, "Please Enter A Valid Email Address.");
    }




    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
