package com.app.norden.pageObjects;

import com.app.norden.base.PageBase;
import com.app.norden.variables.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public void selectSubmenuFromMainMenu(String subMenu, String mainMenu) {
        //waitForPageLoad();
        if (!driverUtils.isPresentAndDisplayed(driver.findElement(By.xpath(String
                .format("//span[text()='%s']/../..//following-sibling::ul//a[text()='%s']", mainMenu, subMenu))))) {
            executor.clickOnElement(wait.forElementVisible(driver.findElement(By.xpath(String.format("//span[text()='%s']", mainMenu)))));
        }
        executor.clickOnElement(driver.findElement(By.xpath(String
                .format("//span[text()='%s']/../..//following-sibling::ul//a[text()='%s']", mainMenu, subMenu))));
    }

    public boolean verifyNewIdeaIsCreated() {
        wait.setImplicitWait(50);
        WebElement IdeaName = driver.findElement(By.xpath(String.format("//span[text()='IDEAS GENERATED']/..//..//span[contains(text(),'%s')]", GlobalVariables.IDEANAME.substring(0, 20))));
        return wait.forElementVisible(IdeaName)
                .isDisplayed();
    }

    public boolean isLoggedIn() {
        //wait.setImplicitWait(50);
        WebElement IdeaName = driver.findElement(By.xpath("//span[text()='User']"));
        return wait.forElementVisible(IdeaName)
                .isDisplayed();

    }
}
