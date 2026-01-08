package pages.pageObjectModel.vwo;

import base.Common_to_All_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertiesReader;
import utils.WaitHelper;

public class Loginpage extends Common_to_All_Pages {

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

 public String invalidloginvwo(String username ,String password){

     openurl(PropertiesReader.readKey("url"));

     enterdetails(usernamelocator,username);
     enterdetails(passwordlocator,password);
     clickonelement(signinbuttonlocator);

     WaitHelper.visiblityofelement(driver,loginerrormessage);

     return getTextfromelement(loginerrormessage);

 }

    public void  validloginvwo(String username ,String password){

        openurl(PropertiesReader.readKey("url"));
        enterdetails(usernamelocator,username);
        enterdetails(passwordlocator,password);
        clickonelement(signinbuttonlocator);




    }



}
