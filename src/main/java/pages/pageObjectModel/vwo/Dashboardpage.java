package pages.pageObjectModel.vwo;

import base.Common_to_All_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;

import java.util.List;

public class Dashboardpage extends Common_to_All_Pages {

    WebDriver driver;


    public Dashboardpage(WebDriver driver){
        this.driver =driver;
    }

   private By Domain_name_on_dashboard = By.xpath("//h6[@aria-label]");

    public String Fecthing_domain_name_from_dashboard(){


        openurl("https://app.vwo.com/#/dashboard/");
WaitHelper.presenceofelement(driver,Domain_name_on_dashboard,10);
        return getTextfromelement(Domain_name_on_dashboard);
    }

}
