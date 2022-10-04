package com.app.norden.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wait {

    private WebDriver driver;
    private WebDriverWait wait;

    public Wait(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }


    public WebElement forElementClickable(WebElement element) {
        return (wait.until(ExpectedConditions.elementToBeClickable(element)));
    }

    public WebElement forElementVisible(WebElement element) {
        return (wait.until(ExpectedConditions.visibilityOf(element)));
    }

    public void setImplicitWait(int waitInSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSeconds));
    }

}
