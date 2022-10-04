package com.app.norden.hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import java.util.Arrays;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        WebDriverManager.chromedriver().setup();
        String Platform = System.getProperty("app.Platform");
        if (Platform == null) {
            Platform = "windows";
        }
        switch (Platform) {
            case "linux":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("headless");
                chromeOptions.addArguments("--window-size=1920x1080");
                chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, org.openqa.selenium.Platform.LINUX);
                chromeOptions.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
                chromeOptions.setCapability("acceptInsecureCerts", true);
                driver = new ChromeDriver(chromeOptions);
                break;
            case "windows":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--ignore-certificate-errors");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + Platform + "\" isn't supported.");
        }
        driver.manage().deleteAllCookies();

    }
}
