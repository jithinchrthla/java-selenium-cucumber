package com.app.norden.utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class WebdriverUtils {
    private WebDriver driver;

    private Wait wait;
    public WebdriverUtils(WebDriver driver,Wait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public boolean isPresentAndDisplayed(final WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException ne) {
            return false;
        }
    }

    public void enterStringOnTextField(WebElement element, String text) {
        // scrollToElement(element);
        Actions ob = new Actions(driver);
        ob.moveToElement(wait.forElementClickable(element)).doubleClick().sendKeys(text).build().perform();
    }

}
