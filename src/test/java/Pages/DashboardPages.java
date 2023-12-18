package Pages;

import org.openqa.selenium.*;
import Util.ElementHelper;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.AbstractDocument;

import static org.testng.AssertJUnit.assertEquals;


public class DashboardPages {
    WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public DashboardPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);




    }

    By infobutton = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1) > span:nth-child(2)");
    By savebutton = By.cssSelector("div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] button[type='submit']");
    By title = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > p");

    public void clickInfoButton() {

        elementHelper.click(infobutton);
    }

    public void changenameandsurname() {
        WebElement name = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input"));
        name.sendKeys(Keys.CONTROL+"a");
        name.sendKeys(Keys.DELETE);
        WebElement lastname = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input"));
        lastname.sendKeys(Keys.CONTROL+"a");
        lastname.sendKeys(Keys.DELETE);
        name.sendKeys("bengisu");
        lastname.sendKeys("ölmez");
    }

    public void clicksavebutton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        elementHelper.click(savebutton);
    }

    public void check() {
        driver.findElement(infobutton).click();
        WebElement nameandsurnametitle = driver.findElement(title);
        String nameandsurnametext = nameandsurnametitle.getText();
        assertEquals(nameandsurnametext,"bengisu ölmez");
    }
}