package Utilities;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtil {


    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchFrame(WebElement frame){
        Driver.getDriver().switchTo().frame(frame);
    }

    public static void switchFrame(String idOrName){
        Driver.getDriver().switchTo().frame(idOrName);
    }

    public static void switchDefaultHtml(){
        Driver.getDriver().switchTo().defaultContent();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void pageDown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public static void pageUp() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
    }



}
