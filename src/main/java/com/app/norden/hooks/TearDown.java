package com.app.norden.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(Scenario scenario){
        if(scenario.isFailed()){
           saveScreenshotsForScenario(scenario);
        }
        this.driver.quit();
    }

    @AfterStep
    public void as(Scenario scenario) throws IOException, InterruptedException
    {
        //scenario.attach(getByteScreenshot(), "image/png", "");
    }

    private byte[] saveScreenshotsForScenario(final Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png","screenshot");
        return screenshot;
    }

    public byte[] getByteScreenshot() throws IOException
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return FileUtils.readFileToByteArray(src);
    }
}
