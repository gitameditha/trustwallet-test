package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;
import utils.LocatorUtils;

import java.time.Duration;

public class BasePage {

    protected AppiumDriver driver;
    private WebDriverWait wait;
    private LocatorUtils locatorUtils;

    public BasePage(String locatorFileName) {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default wait time
        this.locatorUtils = new LocatorUtils(locatorFileName); // Initialize LocatorUtils with the file name
    }

    // Click on an element using a locator key
    public void click(String locatorKey) {
        String locator = locatorUtils.getLocator(locatorKey);
        By byLocator = By.xpath(locator);
        wait.until(ExpectedConditions.elementToBeClickable(byLocator)).click();
    }

    // Send keys to an element using a locator key
    public void sendKeys(String locatorKey, String text) {
        By locator = By.xpath(locatorUtils.getLocator(locatorKey));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    // Wait for an element to be visible using a locator key
    public WebElement waitForVisibility(String locatorKey) {
        By locator = By.xpath(locatorUtils.getLocator(locatorKey));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Get text from an element using a locator key
    public String getText(String locatorKey) {
        By locator = By.xpath(locatorUtils.getLocator(locatorKey));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
}
