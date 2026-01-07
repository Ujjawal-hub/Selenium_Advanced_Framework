package tests.pageObjectModel.vwo;
import driver.driverManager;
import base.CommontoAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pageObjectModel.vwo.Dashboardpage;
import pages.pageObjectModel.vwo.Loginpage;
import utils.PropertiesReader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;




public class vwologinTest extends CommontoAll {

    private static final Logger logger = LogManager.getLogger( vwologinTest.class);

    @Test
    public void login_page_negative_testcase(){


        logger.info("Start of test case");
        Loginpage page  = new Loginpage(driverManager.getDriver());

       String error_text_message = page.invalidloginvwo(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
logger.info("Validating test case");
        Assert.assertEquals(error_text_message,PropertiesReader.readKey("error_message"));

logger.info("end of test case");

    }

    @Test
    public void login_page_positive_test_case() {

        logger.info("Start of test case");

        Loginpage page = new Loginpage(driverManager.getDriver());

        page.validloginvwo("nanycob@flipkart.com","Pa$$w0rd!");

        Dashboardpage dashboardpage = new Dashboardpage(driverManager.getDriver());

      String text =  dashboardpage.Fecthing_domain_name_from_dashboard();
        logger.info("Validating test case");
        Assert.assertEquals(text,"Flipkart");

        logger.info("end of test case");
    }


}
