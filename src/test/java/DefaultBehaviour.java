import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DefaultBehaviour {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));


        List<WebElement> list1 = driver.findElements(By.tagName("a"));
       int i =  list1.size();
       System.out.println("the number is  " + i);

       for(int j=0; j<i;j++){
           list1.get(j).click();
           Thread.sleep(2000);
       }




        String strAtt = driver.findElement(By.id("#TnC")).getAttribute("class");
        System.out.println(strAtt);
        Assert.assertTrue(strAtt.contains("fa-check-square"));

        driver.close();
        driver.quit();



        }
}
