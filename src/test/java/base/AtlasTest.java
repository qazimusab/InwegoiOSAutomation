package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import tools.AutomationHelper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by qazimusab on 1/10/17.
 */
public abstract class AtlasTest {

    protected AppiumDriver driver;
    protected AutomationHelper automationHelper;

    @Before
    public void setUp() throws Exception {
        driver = getDriver();
        automationHelper = new AutomationHelper(driver);
    }

    private String getAppPath() {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "src/resources");
        File app = new File(appDir, getAppFileName());
        return app.getAbsolutePath();
    }
    protected String getAppFileName() {
        return "app-automation-debug.apk";
    }

    protected DesiredCapabilities getDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, getAppPath());
        return capabilities;
    }

    protected abstract AppiumDriver getDriver() throws MalformedURLException;

    protected URL getAppiumServerUrl() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
