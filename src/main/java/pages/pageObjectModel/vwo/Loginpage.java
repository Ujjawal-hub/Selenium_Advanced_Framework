package pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertiesReader;
import utils.WaitHelper;

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

 public String invalidloginvwo(String username ,String password){

     driver.get(PropertiesReader.readKey("url"));

     driver.findElement(usernamelocator).sendKeys(username);
     driver.findElement(passwordlocator).sendKeys(password);
     driver.findElement(signinbuttonlocator).click();

     WaitHelper.visiblityofelement(driver,loginerrormessage);

     return driver.findElement(loginerrormessage).getText();

 }

    public void  validloginvwo(String username ,String password){

        driver.get("https://app.vwo.com/#/login");

        driver.findElement(usernamelocator).sendKeys(username);
        driver.findElement(passwordlocator).sendKeys(password);
        driver.findElement(signinbuttonlocator).click();



    }



}
