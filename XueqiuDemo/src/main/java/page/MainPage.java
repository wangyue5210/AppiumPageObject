package page;

import driver.Driver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainPage {

    By profile=By.id("user_profile_icon");
    public  static MainPage start() throws MalformedURLException {
        Driver.start();
        return new MainPage();
    }

    public ProfilePage gotoProfile(){
        Driver.getCurrentDriver().findElement(profile).click();
        return new ProfilePage();
    }
}
