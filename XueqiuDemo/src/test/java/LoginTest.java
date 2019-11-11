import org.junit.Test;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import java.net.MalformedURLException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    @Test
    public void Non_phone() throws MalformedURLException {
        MainPage mainPage= MainPage.start();

        ProfilePage profilePage =mainPage.gotoProfile();

        LoginPage loginPage =profilePage.gotoLogin();
        loginPage.passwordFail("1780000000","xxxxxxxxx");

       // toast=loginPage.password("155555","xxxxx");
        assertThat(loginPage.getMessage(),equalTo("手机号码填写错误"));

    }
}
