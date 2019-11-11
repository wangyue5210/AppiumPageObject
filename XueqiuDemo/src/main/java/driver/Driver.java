package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver driver;

        //启动app静态方法
        public static void start() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
            desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
            desiredCapabilities.setCapability("noReset", "true");
            desiredCapabilities.setCapability("autoGrantPermissions", "true");

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }


//driver的get方法
        public static AppiumDriver getCurrentDriver(){
            return driver;
        }


}
