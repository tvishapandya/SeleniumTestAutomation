
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowExample {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
        driver.findElement(By.xpath("//img[@title='Rocket Icon']")).click();
        Thread.sleep(2000);
        String str = driver.getCurrentUrl();
        System.out.println("currenr url " + str);

        String parentWindwID = driver.getWindowHandle();

        Set<String> set1 = driver.getWindowHandles();
        Iterator iter = set1.iterator();

        while (iter.hasNext()) {

            String childWindow = iter.next().toString();

            if (!parentWindwID.equals(childWindow)) {

                driver.switchTo().window(childWindow);
            }
        }
        driver.findElement(By.cssSelector("a.scrollLink.button")).click();
        driver.close();
        driver.quit();


    }

}
