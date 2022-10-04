package definitions;

import com.app.norden.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginPageStepdefs {

   LoginPage getPage=new LoginPage();
    @Given("I have navigated to the Norden login page")
    public void loginToApplication() {
        getPage.navigateToLoginPage();
    }

    @When("I select {string} profile to access Norden")
    public void iSelectOptionFromTheProfilesList(String profile) {
        getPage.selectProfile(profile);
    }

    @And("I enter the user credentials and login to Norden")
    public void iEnterTheUserCredentialsAndLoginToNorden() {
        getPage.logInToApplication();
    }
}
