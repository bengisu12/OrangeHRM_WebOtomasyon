package StepDefinition;

import Pages.DashboardPages;
import Pages.LoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DashboardPagesStepDefinition {
    WebDriver driver = DriverFactory.getDriver();
    DashboardPages dashboardPages = new DashboardPages(driver);


    @When("click my info button")
    public void clickMyInfoButton() {
        dashboardPages.clickInfoButton();
    }

    @When("change name and surname")
    public void changeNameAndSurname() {
        dashboardPages.changenameandsurname();

    }

    @When("click to save button")
    public void clickToSaveButton() {
        dashboardPages.clicksavebutton();
    }

    @Then("check new name and surname")
    public void checkNewNameAndSurname() {
        dashboardPages.check();
    }

}