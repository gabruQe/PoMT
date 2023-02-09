package tests;

import actions.LoginAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends PickrrTest{
//    @BeforeMethod
//    public void openPickrr() {
//        driver.get("https://pickrr.com");
//        System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
//    }

//    @Test(priority = 1)
//    public void navigate_to_login() throws InterruptedException {
//        new PickrrAction(driver).clickloginButton();
//
//        // hold all window handles in array list
//        ArrayList<String> newtb = new ArrayList<String>(driver.getWindowHandles());
//
//        //Switch to new window
//        driver.switchTo().window(newtb.get(1));
//        System.out.println("Page title of new tab:" + driver.getTitle());
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.titleIs("Pickrr Dashboard - Sign Up for Free"));
//
//        }
//        catch (Exception e){
//            System.out.println("Something went wrong");
//        }
//
//    }
    @Test(priority = 1)
    public void login_functionality () throws InterruptedException {
        new LoginAction(driver).clickloginSumbit();

        System.out.println("Page title of new tab:" + driver.getTitle());
        String x = driver.getTitle();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs(x));

        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }


}
