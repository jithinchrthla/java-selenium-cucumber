package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(tags = "", features = "src/test/resources/features", glue = {"com/app/norden/hooks", "definitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
    TestNGCucumberRunner testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
}
