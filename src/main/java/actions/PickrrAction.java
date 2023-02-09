package actions;

import org.openqa.selenium.WebDriver;

import static pages.PickrrPage.loginButton;

public class PickrrAction {
    WebDriver driver;



    public PickrrAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickloginButton() {
     driver.findElement(loginButton).click();
 }

}
