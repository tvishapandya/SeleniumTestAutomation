import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FirstTest {


    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.id("sp-cc-accep")).click();
        System.out.println("This is the trail website");


        String str =driver.getCurrentUrl();
        Assert.assertEquals("https://www.amazon.co.uk/",str);

        Thread.sleep(5000);
        System.out.println("This is the trail website");

        //driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8']")).click();
        driver.findElement(By.cssSelector("a[href='/computers-accessories/b/?ie=UTF8&node=340831031&ref_=nav_cs_pc']")).click();





        Thread.sleep(5000);

        driver.close();


    }



}
