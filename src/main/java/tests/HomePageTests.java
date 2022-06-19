package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTests extends BaseTests{


    //TC-01 -Verify that home page link for elements works properly
    @Test(priority = 1)
    public void homePageElementsTest(){
        getHomePage().pageDown();
        getDriver().findElement(getHomePage().getElements()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Elements");
        getDriver().navigate().back();

    }

    //TC-02 -Verify that home page link for forms works properly
    @Test(priority = 2)
    public void homePageFormsTest()  {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getForms()));
        getDriver().findElement(getHomePage().getForms()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Forms");
        getDriver().navigate().back();

    }

    //TC-03 -Verify that home page link for alerts works properly
    @Test(priority = 2)
    public void homePageAlertsTest(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getAlerts()));
        getDriver().findElement(getHomePage().getAlerts()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Alerts, Frame & Windows");
        getDriver().navigate().back();

    }

    //TC-04 Verify that home page link for widgets works properly
    @Test(priority = 2)
    public void homePageWidgetsTest(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getWidgets()));
        getDriver().findElement(getHomePage().getWidgets()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Widgets");
        getDriver().navigate().back();

    }

    //TC-05 Verify that home page link for interactions works properly
    @Test(priority = 2)
    public void interactionsTest(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getInteractions()));
        getDriver().findElement(getHomePage().getInteractions()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Interactions");
        getDriver().navigate().back();

    }

    //TC-06 Verify that home page link for book store works properly
    @Test(priority = 3)
    public void bookStoreTest(){
        getHomePage().pageDown();
    //    getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getBookStore()));
        getDriver().findElement(getHomePage().getBookStore()).click();
        Assert.assertEquals(getDriver().findElement(getHomePage().getPageTitle()).getText(), "Book Store");
        getDriver().navigate().back();

    }


}
