package definitions;

import com.app.norden.pageObjects.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    @When("^I select \"([^\"]*)\" sub menu from \"([^\"]*)\" main menu$")
    public void iSelectSubmenuFromMainMenu(String subMenu, String mainMenu) throws InterruptedException {
        homePage.selectSubmenuFromMainMenu(subMenu, mainMenu);
    }

    @Then("^I verify that newly submitted Idea is displayed on Dashboard Ideas generated widget$")
    public void iVerifyThatNewlySubmittedIdeaIsDisplayedOnDashboardIdeasGeneratedWidget() {
        Assert.assertTrue(homePage.verifyNewIdeaIsCreated(),"Idea Submitted is not displayed in Ideas Generated widget");
    }

    @Then("I verify that user successfully logged in")
    public void iVerifyThatUserSuccessfullyLoggedIn() {
        Assert.assertTrue(homePage.isLoggedIn(),"Idea Submitted is not displayed in Ideas Generated widget");
    }

}
