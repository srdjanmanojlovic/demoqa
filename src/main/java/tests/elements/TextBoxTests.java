package tests.elements;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

import java.time.Duration;

public class TextBoxTests extends BaseTests {

    @AfterMethod
    public void afterTextBoxTests() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    //TC-07 Verify that Text box in elements page  works properly with valid inputs
    @Test(priority = 1)
    public void textBoxTest() {
//        getElementsPage().navigateToTextBox();
        getDriver().findElement(getHomePage().getElements()).click();
        getDriver().findElement(getElementsPage().textBox).click();
        getDriver().findElement(By.id("userName")).sendKeys("Test Name");
        getDriver().findElement(By.id("userEmail")).sendKeys("test@email.com");
        getDriver().findElement(By.id("currentAddress")).sendKeys("test address");
        getDriver().findElement(By.id("permanentAddress")).sendKeys("test permanent address");
        getDriver().findElement(getElementsPage().submitButton).click();
        //      getElementsPage().textBoxFill("Test Name", "test@email.com", "test address", "test permanent address");

        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultName).getText(),
                "Name:"+ "Test Name" );
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultEmail).getText(),
                "Email:"+ "test@email.com" );
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultCurrentAddress).getText(),
                "Current Address :"+ getElementsPage().testCurrentAddress);
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultPermanentAddress).getText(),
                "Permananet Address :"+ getElementsPage().testPermanentAdress);   //improvement - typo

    }

    //TC-08 Verify that Text box in elements page  works properly with invalid inputs
    @Test(priority = 1)
    public void textBoxTestInvalidEmail() {
//        getElementsPage().navigateToTextBox();
        getDriver().findElement(getHomePage().getElements()).click();
        getDriver().findElement(getElementsPage().textBox).click();
        getDriver().findElement(By.id("userName")).sendKeys(getElementsPage().testName);
        getDriver().findElement(By.id("userEmail")).sendKeys("test@11.11");    //invalid domain name 11.11
        getDriver().findElement(By.id("currentAddress")).sendKeys("test address");
        getDriver().findElement(By.id("permanentAddress")).sendKeys("test permanent address");
        getDriver().findElement(getElementsPage().submitButton).click();
        //      getElementsPage().textBoxFill("Test Name", "test@11.11", "test address", "test permanent address");

        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultName).getText(),
                "Name:"+ getElementsPage().testName );
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultEmail).getText(),
                "Email:"+ "test@11.11" );
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultCurrentAddress).getText(),
                "Current Address :"+ getElementsPage().testCurrentAddress  );
        Assert.assertEquals(getDriver().findElement(getElementsPage().textBoxResultPermanentAddress).getText(),
                "Permananet Address :"+ getElementsPage().testPermanentAdress );
    }

}
