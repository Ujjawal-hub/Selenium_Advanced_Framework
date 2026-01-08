package base;


import driver.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common_to_All_Pages {

    public void openurl(String url){

        driverManager.getDriver().get(url);

    }

    public void enterdetails(By locator,String input) {

        driverManager.getDriver().findElement(locator).sendKeys(input);

    }

    public void enterdetails(WebElement element, String input) {

        element.sendKeys(input);

    }

    public void clickonelement(By locator){

        driverManager.getDriver().findElement(locator).click();

    }
    public void clickonelement(WebElement element){

        element.click();

    }

public String getTextfromelement(By locator){

       return driverManager.getDriver().findElement(locator).getText();

}
    public String getTextfromelement(WebElement element){

        return element.getText();

    }
}
