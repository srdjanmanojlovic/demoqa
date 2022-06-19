package tests.practiceform;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTests;

public class PracticeFormTests extends BaseTests {

    @BeforeMethod
    public void beforeForms(){
        //getHomePage().pageDown();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomePage().getForms()));
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        getDriver().findElement(getHomePage().getForms()).click();
        getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).click();

    }

    @Test
    public void formTest(){
        getDriver().findElement(By.id("firstName")).sendKeys("Petar");
        getDriver().findElement(By.id("lastName")).sendKeys("Petrovic");
        getDriver().findElement(By.id("userEmail")).sendKeys("test@test.com");
        getDriver().findElement(By.id("gender-radio-1")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.id("userNumber")).sendKeys("1324567890");
        getDriver().findElement(By.id("userNumber")).sendKeys(Keys.ENTER);
        //getDriver().findElement(By.id("submit")).click();
    }
}
