package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Path to feature files
    glue = "stepdefinitions",                // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
    monochrome = true                        // Clean console output
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
