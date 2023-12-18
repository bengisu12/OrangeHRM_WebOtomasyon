package StepDefinition;

import Pages.LoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDefinition {
    WebDriver driver = DriverFactory.getDriver();
    LoginPages loginPages = new LoginPages(driver);

    @Given("User at login page")
    public void userAtLoginPage() {
        loginPages.verifyUseratLoginPage();

    }

    @When("click login button")
    public void clickLoginButton() {
        loginPages.clickLoginButton();
    }

    @Then("Check required message about username and password")
    public void checkRequiredMessageAboutUsernameAndPassword() {
        loginPages.checkRequire();
    }

    @When("Write username and password")
    public void writeUsernameAndPassword() {
        loginPages.WriteUsernameAndPassword();
    }

    @Then("check Invalid credentials message about login")
    public void checkInvalidCredentialsMessageAboutLogin() {
        loginPages.checkInvalidCredentialMessage();

    }

    @When("Write correct username and password")
    public void writeCorrectUsernameAndPassword() {
        loginPages.correctLogin();
    }

    @Then("check dashboard screeen")
    public void checkDashboardScreeen() {
        loginPages.checkDashboardScreen();
    }
}
