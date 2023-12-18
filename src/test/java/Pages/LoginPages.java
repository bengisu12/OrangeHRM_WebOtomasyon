package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Util.ElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;


public class LoginPages {
    WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper=new ElementHelper(driver);

    }
    By logintitle = By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title");
    By loginButton = By.cssSelector("button[type='submit']");
    By usernameRequire = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(3)");
    By passwordRequire = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(3)");
    By username = By.cssSelector("input[placeholder='Username']");
    By password = By.cssSelector("input[placeholder='Password']");
    By message = By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text");
    By dashboard = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");




    public void verifyUseratLoginPage() {
        WebElement title = driver.findElement(logintitle);
        String titleText = title.getText();
        assertEquals(titleText,"Login");



    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);

    }

    public void checkRequire() {
        elementHelper.checkVisible(usernameRequire);
        elementHelper.checkVisible(passwordRequire);
    }

    public void WriteUsernameAndPassword() {
        elementHelper.click(username);
        elementHelper.sendKey(username,"benben");
        elementHelper.click(password);
        elementHelper.sendKey(password,"şifre");
    }

    public void checkInvalidCredentialMessage() {
        elementHelper.checkVisible(message);
    }

    public void correctLogin() {
        elementHelper.click(username);
        elementHelper.sendKey(username,"Admin");
        elementHelper.click(password);
        elementHelper.sendKey(password,"admin123");



    }

    public void checkDashboardScreen() {
        elementHelper.checkVisible(dashboard);
    }
}

