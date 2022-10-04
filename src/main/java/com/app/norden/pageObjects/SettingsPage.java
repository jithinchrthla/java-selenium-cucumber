package com.app.norden.pageObjects;

import com.app.norden.variables.GlobalVariables;
import com.app.norden.base.PageBase;
import com.app.norden.utils.JsonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SettingsPage extends PageBase {
    @FindBy(xpath = "//input[@id='ideaName']")
    private WebElement ideaName;


    public void enterEmailAddress() throws IOException {
        // waitForElementVisible(ideaName).click();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
        driverUtils.enterStringOnTextField(wait.forElementVisible(ideaName),
                formatter.format(date) + "test@abc.com");
        GlobalVariables.IDEANAME = ideaName.getAttribute("value");
    }

}
