package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignUpPage {


    private WebDriver driver;



@FindBy(xpath = "//input[@name='Nickname']")
    private WebElement userNameTextBox;

    @FindBy(xpath = "//input[@name='Email']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    private WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//input[@name='FirstName']")
    private WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='LastName']")
    private WebElement lastNameTextBox;


    @FindBy(id= "submitSignupForm")
    private WebElement signUpButton;


    @FindAll
            ({
                    @FindBy(css = "small.error"),
            })
    private List<WebElement> errorMessageElements;

    public SignUpPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    public void enterUserName(String userName){
        userNameTextBox.sendKeys(userName);
    }

    public void enterEmailAddress(String emailAddress){
        emailTextBox.sendKeys(emailAddress);
    }

    public void enterPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public void enterConfirmPassword(String password){
        confirmPasswordTextBox.sendKeys(password);
    }

    public String getTextFirstErrorMessage(){
        return errorMessageElements.get(0).getText();
    }


    public String getTextSecondErrorMessage(){
        return errorMessageElements.get(1).getText();
    }
    public void clickOnSingUpButton(){
        signUpButton.click();
        //passwordTextBox.sendKeys("1234");
    }


}
