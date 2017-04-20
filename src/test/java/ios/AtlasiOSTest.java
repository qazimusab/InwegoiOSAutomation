package ios;

import base.AtlasTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

/**
 * Created by qazimusab on 1/10/17.
 */
public class AtlasiOSTest extends AtlasTest {

    protected String getAppFileName() {
        return "Atlas-iOS.automation.ipa";
    }

    protected AppiumDriver<IOSElement> getDriver() throws MalformedURLException {
        return new IOSDriver<IOSElement>(getAppiumServerUrl(), getDesiredCapabilities());
    }

    @Test
    public void helloWorld() throws InterruptedException {
        Thread.sleep(3000);
        automationHelper.waitByNameAndClick("Get started");
        Thread.sleep(3000);
    }

    protected DesiredCapabilities getDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = super.getDesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.1.1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Shula");
        capabilities.setCapability(MobileCapabilityType.UDID, "0d03901751b843d765eac4ac2575167b5670c36b");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Veronica");
//        capabilities.setCapability(MobileCapabilityType.UDID, "8934197fc202daddaf08b49e160e2851dab2eee8");
//        capabilities.setCapability("xcodeConfigfile", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/Config.xcconfig");
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.expapp.atlas-ios.automation");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        return capabilities;
    }
}
