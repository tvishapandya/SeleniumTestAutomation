import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AccountCreationErrors {


    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/signup/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        String str = driver.findElement(By.xpath("//a[@href='https://www.hostelworld.com/']")).getText();
        System.out.println("This is the first text +" + str);
        String str22 = driver.findElement(By.xpath("//a[@href='https://www.hostelworld.com/']")).getAttribute("aria-label");
        System.out.println("This is the attribute text  +" + str22);






        driver.findElement(By.id("submitSignupForm")).click();

       List<WebElement> errorMessages = driver.findElements(By.cssSelector("small.error"));


       int n = errorMessages.size();
       System.out.println("size is " + n);

       for(int i=0; i<n ; i++){

           System.out.println(errorMessages.get(i).getText());
       }

      String error1 =  errorMessages.get(0).getText();
        Assert.assertEquals(error1,"Please Enter A Valid Username");



      String error2 = errorMessages.get(1).getText();
      Assert.assertEquals(error2,"Please Enter A Valid Email Address." );
      String error3 = errorMessages.get(2).getText();

      System.out.println(error1);
      System.out.println(error2);
      System.out.println(error3);


       driver.close();
        driver.quit();




        //driver.findElement(By.id("truste-consent-button")).click();



    }

}
