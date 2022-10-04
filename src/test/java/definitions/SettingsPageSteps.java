package definitions;

import com.app.norden.pageObjects.SettingsPage;
import io.cucumber.java.en.When;

public class SettingsPageSteps {

    SettingsPage settingsPage = new SettingsPage();

    @When("^I enter Idea Name to create New Idea$")
    public void userClicksOnIdeaNameAndEnterOnNewIdeaPage() throws Throwable {
        settingsPage.enterEmailAddress();
    }
}
