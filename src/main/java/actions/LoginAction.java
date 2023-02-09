package actions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginAction extends LoginPage {
    WebDriver driver;

    public LoginAction(WebDriver driver) {
        this.driver = driver;
    }

public void enteremail() {
    driver.findElement(email).sendKeys("g.mangla911@gmail.com");
}
public void enterpassword() {
    driver.findElement(password).sendKeys("complex@1357");
}
public void clickloginSumbit() {
    driver.findElement(loginSubmit).click();
}

}
