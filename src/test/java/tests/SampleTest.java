package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SamplePage;
import utils.DriverUtils;

public class SampleTest extends BaseTest {

    private SamplePage samplePage;

    @BeforeClass
    public void setUp() {
        // Initialize the Appium driver
        DriverUtils.initializeDriver();

        // Initialize SamplePage after the driver is ready
        samplePage = new SamplePage();
    }

    @Test(description = "Sample description")
    public void sampleTest() {
        samplePage.clickSampleButton(); // Use SamplePage instance
        // samplePage.enterTextInSampleField("Test Input");
        // String text = samplePage.getSampleFieldText();
        // System.out.println("Retrieved text: " + text);
    }
}