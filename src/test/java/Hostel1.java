import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Hostel1 {

    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.id("truste-consent-button")).click();

        driver.findElement(By.xpath("//figure[@class='content-container']/span")).click();


       List<WebElement>  list1 = driver.findElements(By.className("pill-text"));
       //driver.findElements(By.className("pill-text")).get(1).click();

      String str1 =  list1.get(0).getText();
       String str2 = list1.get(1).getText();

       System.out.println(str1);
       System.out.println(str2);






    }

}
