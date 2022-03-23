import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AccountCreation {


    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/signup/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        double number = Math.random();
        String str = "test@abc.com";
        String strNew = str + number;
        System.out.println(strNew);


        driver.findElement(By.xpath("//input[@name='Nickname']")).sendKeys("firstName");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(strNew);
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Test1234@");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Test1234@");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Last");

        Select select = new Select(driver.findElement(By.id("Gender")));
        select.selectByValue("Male");
        select.selectByValue("Female");
        Select select1 = new Select(driver.findElement(By.id("day")));
        select1.selectByValue("28");
        Select select2 = new Select(driver.findElement(By.id("month")));
        select2.selectByValue("6");
        Select select3 = new Select(driver.findElement(By.id("year")));
        select3.selectByValue("1970");


        Select select4 = new Select(driver.findElement(By.id("nationality")));
        select4.selectByValue("England");

        driver.findElement(By.xpath("//label[@for='SecurityPublic']")).click();

        //driver.findElement(By.id("submitSignupForm")).click();
        //driver.findElement(By.xpath("//label[@for='TnC']")).click();
        //driver.findElement(By.id("#TnC")).click();

        Thread.sleep(20000);




        driver.close();
        driver.quit();




        //driver.findElement(By.id("truste-consent-button")).click();



    }


}
