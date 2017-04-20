package tools;

/**
 * Created by qazimusab on 1/10/17.
 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by qazimusab on 08/09/16.
 */
@SuppressWarnings("unused")
public class AutomationHelper {

    private static int DEFAULT_WAIT_TIME = 15;
    private final AppiumDriver driver;

    public AutomationHelper(AppiumDriver driver) {
        this.driver = driver;
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public void clickById(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public void waitById(String id) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public void waitByIdAndClick(String id) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.elementToBeClickable(By
                .id(id))).click();
    }

    public void waitByIdAndClick(String id, int waitTime) {
        WebDriverWait wait = new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id))).click();
    }

    public void typeById(String id, String text) {
        getDriver().findElement(By.id(id)).sendKeys(text);
    }

    public void typeByName(String name, String text) {
        getDriver().findElement(By.name(name)).sendKeys(text);
    }

    public void typeByClassName(String className, String text) {
        getDriver().findElement(By.className(className)).sendKeys(text);
    }

    public void waitByIdAndType(String id, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).sendKeys(text);
    }

    public void waitById(String id, int maxTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public void clickByName(String name) {
        getDriver().findElement(By.name(name)).click();
    }

    public void waitByName(String name) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
    }

    public void waitByNameAndClick(String name) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name))).click();
    }

    public void waitByNameAndType(String name, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name))).sendKeys(text);
    }

    public void waitByName(String name, int maxTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
    }

    public void clickByClassName(String className) {
        getDriver().findElement(By.className(className)).click();
    }

    public void waitByClassName(String className) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }

    public void waitByClassNameAndClick(String className) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className))).click();
    }

    public void waitByClassName(String className, int maxTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }

    public void clickByLinkText(String linkText) {
        getDriver().findElement(By.linkText(linkText)).click();
    }

    public void waitByLinkText(String linkText) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
    }

    public void waitByLinkTextAndClick(String linkText) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText))).click();
    }

    public void waitByLinkText(String linkText, int maxTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
    }

    public void clickByXpath(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    public void waitByXpath(String xpath) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitByXpathAndClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }

    public void waitByXpathAndType(String xpath, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(text);
    }

    public void waitByXpath(String xpath, int maxTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public boolean elementExistsByXpath(String xpath) {
        return (getDriver().findElements( By.xpath(xpath) ).size() != 0);
    }

    public boolean elementExistsByName(String name) {
        return (getDriver().findElements( By.name(name) ).size() != 0);
    }

    public boolean elementExistsByCss(String css) {
        return (getDriver().findElements( By.cssSelector(css) ).size() != 0);
    }

    public void waitUntilClickableByXpathAndClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    public void waitByCssSelector(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public void waitUntilClickableByLinkTextAndClick(String linkText) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
    }

    public String getTextInElementByXpath(String xpath) {
        WebElement webElement = getDriver().findElement(By.xpath(xpath));
        return webElement.getText();
    }

    public void waitUntilVisibleByXpath(String xpath) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public String getRandomEmailAddress() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString() + "@gmail.com";
    }

    public String getRandomString() {
        return UUID.randomUUID().toString();
    }



    public String getRandomPhoneNumber() {
        Random rnd = new Random();
        int n = 1000000 + rnd.nextInt(9000000);
        return "404" + n;
    }

    public int getNumberOfChildElementsByXpath(String xpath) {
        WebElement rootWebElement = getDriver().findElement(By.xpath(xpath));
        List<WebElement> children = rootWebElement.findElements(By.xpath(".//*"));
        return children.size();
    }

    public int getNumberOfChildElementsByClassName(String className) {
        WebElement rootWebElement = getDriver().findElement(By.className(className));
        List<WebElement> children = rootWebElement.findElements(By.xpath(".//*"));
        return children.size();
    }
}