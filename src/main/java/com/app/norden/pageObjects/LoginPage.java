package com.app.norden.pageObjects;

import com.app.norden.base.PageBase;
import com.app.norden.variables.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage extends PageBase {

    @FindBy(xpath = "//input[@name='email']")
    private WebElement userNameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement submitButton;

    public void navigateToLoginPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa-core.nordhen.com/");
   }

    public void selectProfile(String profile) {
        wait.forElementClickable(driver.findElement(By.xpath(String
                        .format("//button[text()='%s']", profile)))).click();
    }

    public void logInToApplication(){
        wait.forElementVisible(userNameTextBox).sendKeys(System.getProperty("app.userName"));
        wait.forElementVisible(passwordTextBox).sendKeys(System.getProperty("app.password"));
        wait.forElementClickable(submitButton).click();
    }
}
