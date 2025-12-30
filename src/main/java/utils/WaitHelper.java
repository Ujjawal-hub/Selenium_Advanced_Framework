package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    public static void waitjvm(int time){

        try{

            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void visiblityofelement(WebDriver driver, By locator, int time){

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(time));

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    public static void visiblityofelement(WebDriver driver, By locator){

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    public static void visiblityofelements(WebDriver driver, By locator, int time){

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(time));

        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }

    public static void visiblityofelements(WebDriver driver, By locator){

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));

        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }

public static void texttobepresent(WebDriver driver,By locator,String text,int time){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,text));

}

    public static void texttobepresent(WebDriver driver,By locator,String text){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,text));

    }

    public static void urltobe(WebDriver driver,String url,int time){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));

        wait.until(ExpectedConditions.urlToBe(url));

    }

    public static void urltobe(WebDriver driver,String url){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));

        wait.until(ExpectedConditions.urlToBe(url));

    }

    public static void clickiblityofelement(WebDriver driver,By locator,int time){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    public static void clickiblityofelement(WebDriver driver,By locator){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

}
