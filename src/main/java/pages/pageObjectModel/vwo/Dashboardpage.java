package pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;

import java.util.List;

public class Dashboardpage {

    WebDriver driver;


    public Dashboardpage(WebDriver driver){
        this.driver =driver;
    }

   private By Domain_name_on_dashboard = By.xpath("//h6[@aria-label]");

    public String Fecthing_domain_name_from_dashboard(){


        driver.get("https://app.vwo.com/#/dashboard/");
WaitHelper.presenceofelement(driver,Domain_name_on_dashboard,10);
        return driver.findElement(Domain_name_on_dashboard).getText();
    }

}
