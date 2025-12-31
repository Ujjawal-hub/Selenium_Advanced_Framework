package tests.pageObjectModel.vwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pageObjectModel.vwo.Loginpage;

public class vwologinTest {

    @Test
    public void login_page_negative_testcase(){

        WebDriver webDriver = new ChromeDriver();

        Loginpage page  = new Loginpage(webDriver);

       String error_text_message = page.invalidloginvwo("gmo","ggg");

        Assert.assertEquals(error_text_message,"Your email, password, IP address or location did not match");

webDriver.quit();

    }


}
