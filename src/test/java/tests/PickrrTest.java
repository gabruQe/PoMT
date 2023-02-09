package tests;

import actions.PickrrAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class PickrrTest extends BaseTest {
   /* WebDriver driver;
    BaseAction objBaseAction;    *//* object Reference on a global level*//*
*/



    @BeforeMethod
    public void openPickrr() {
        driver.get("https://pickrr.com");
        System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    }

    @Test(description = "This validates sign-in page is appeared")
    public void navigate_to_login() throws InterruptedException {
        new PickrrAction(driver).clickloginButton();

        // hold all window handles in array list
        ArrayList<String> newtb = new ArrayList<String>(driver.getWindowHandles());

        //Switch to new window
        driver.switchTo().window(newtb.get(1));
        System.out.println("Page title of new tab:" + driver.getTitle());
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs("Pickrr Dashboard - Sign Up for Free"));
            assertEquals("https://dashboard.pickrr.com/sign-in",driver.getCurrentUrl());
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }

}
