package pages;

public class SamplePage extends BasePage {

    public SamplePage() {
        super("homepages.locator.properties"); // Pass the locator file name to BasePage
    }

    public void clickSampleButton() {
        click("ButtonCreateNewWallet"); // Use the locator key directly
    }

    public void waitForPinButton() {
        waitForVisibility("pinWalletInput"); // Use the locator key directly
    }

    // public void enterPin() {
    //     click("pinWalletInput"); 
    // }

    public void enterTextInSampleField(String text) {
        sendKeys("sampleTextField", text); // Use the locator key directly
    }

    public String getSampleFieldText() {
        return getText("sampleTextField"); // Use the locator key directly
    }

    public void clickPin(String pin) {
        for (char digit : pin.toCharArray()) {
            enterPin("pinWalletInput", String.valueOf(digit));
        }
    }
    
}
