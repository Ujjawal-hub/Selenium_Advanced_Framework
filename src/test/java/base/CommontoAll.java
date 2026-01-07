package base;

import driver.driverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;

public class CommontoAll {

    @BeforeMethod
    public void driverinitialization(){

        driverManager.init();

    }

    @AfterMethod

    public void driverclosing() {

        driverManager.close_browser();
    }
}
