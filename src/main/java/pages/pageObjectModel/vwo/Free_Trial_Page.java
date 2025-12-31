package pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Free_Trial_Page {

    WebDriver driver;

    public Free_Trial_Page(WebDriver driver){

        this.driver =driver;
    }

private By input_email_l = By.xpath("//input[@data-qa=\"page-su-step1-v1-email\"]");
private By Check_box_l = By.id("page-free-trial-step1-cu-gdpr-consent-checkbox");
private By Submit_button_l = By.xpath("//button[text()=\"Create a Free Trial Account\"]");
private By error_message_l = By.xpath("//div[contains(@class,\"invalid-reason\")]");

public String Fetching





}
