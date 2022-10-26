package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]//span")
    public WebElement logInIcon;
    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement userPassword;
    @FindBy(xpath = "//*[@id=\"login-page\"]//button[2]/span")
    public WebElement getSignIn;
    @FindBy(xpath = "//*[@id=\"login-page\"]//div/span/strong")
    public WebElement invalidCredentialsErrorMessage;
}
