package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By other=text("邮箱手机号密码登录");
    By username=By.id("login_account");
    By password=By.id("login_password");
    By login=By.id("button_next");
    By msg =By.id("md_content");
    //登陆成功返回首页，登陆失败返回当前页面
    String message;
    public LoginPage passwordFail(String username,String password){
        find(other).click();
        find(this.username).sendKeys(username);
        find(this.password).sendKeys(password);
        find(login).click();
         message=find(msg).getText();
         find(By.id("md_buttonDefaultPositive")).click();

        return this;
    }
    public String getMessage(){
        return message;
    }

    public ProfilePage gotoProfile(){
        find(By.id("iv_action_back")).click();
        return new ProfilePage();

    }
}
