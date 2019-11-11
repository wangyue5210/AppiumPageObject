package page;

import driver.Driver;
import org.openqa.selenium.By;

public class ProfilePage {
//字段
    By login =By.id("iv_login_phone");

    public LoginPage gotoLogin(){
        Driver.getCurrentDriver().findElement(login).click();
        return new LoginPage();
    }
}
