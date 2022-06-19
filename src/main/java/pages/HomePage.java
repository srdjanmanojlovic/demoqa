package pages;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



@Data
@Getter
public class HomePage extends BasePage{

    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By alerts = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div");
    private By bookStore = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div");


    private By pageTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");


//    public static void switchTabs(WebDriver driver, int expectedWindowsCount,int SwitchtoWindow)
//            throws Exception {
//        (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.numberOfWindowsToBe(expectedWindowsCount));
//        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(SwitchtoWindow));
//    }

    public void pageDown(){

        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

    }



}
