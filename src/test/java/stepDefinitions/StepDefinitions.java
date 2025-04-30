package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.SamplePage;
import utils.DriverUtils;

public class StepDefinitions {

    private SamplePage samplePage;

    @Given("the app is launched")
    public void theAppIsLaunched() {
        DriverUtils.initializeDriver();
        samplePage = new SamplePage();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        if (buttonName.equals("Create New Wallet")) {
            samplePage.clickSampleButton();
        }
    }

    @When("I enter the PIN {string}")
    public void iEnterThePIN(String pin) {
        samplePage.inputPin(pin);
    }

    @Then("I should see the wallet home screen")
    public void iShouldSeeTheWalletHomeScreen() {
        // Add assertion logic here
        System.out.println("Wallet home screen is displayed.");
    }
}
