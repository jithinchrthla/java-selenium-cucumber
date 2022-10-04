package com.app.norden.base;


import com.app.norden.utils.JavaScriptExecutorUtility;
import com.app.norden.utils.WebdriverUtils;
import com.app.norden.hooks.Setup;
import com.app.norden.utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageBase {
    protected WebDriver driver;
    protected JavaScriptExecutorUtility executor;
    protected Wait wait;

    protected WebdriverUtils driverUtils;

    public PageBase() {
        this.driver = Setup.driver;
        this.executor = new JavaScriptExecutorUtility(this.driver);
        this.wait = new Wait(this.driver);
        this.driverUtils = new WebdriverUtils(this.driver,this.wait);
        PageFactory.initElements(driver, this);
    }

}

