package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By email = By.id("email");
    public static By password = By.xpath("//input[@class='ant-input']");

    public static By loginSubmit = By.xpath("//*[//*[@id=\"login-form\"]/div[4]/div/div/div/button]");



}
