package pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    //
    //Page locators
    //Page Actions

    WebDriver driver;

    public Loginpage(WebDriver driver){
        this.driver = driver;

    }

    //Page Locators

    private By usernamelocator = By.id("login-username");
    private  By passwordlocator = By.id("login-password");
    private By signinbuttonlocator = By.id("js-login-btn");
    private By loginerrormessage = By.id("js-notification-box-msg");

//Page Actions




}
