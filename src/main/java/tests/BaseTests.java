package tests;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.BasePage;
import pages.ElementsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.time.Duration;
@Data
public class  BaseTests {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private BasePage basePage;
    private HomePage homePage;

    private ElementsPage elementsPage;
    private PracticeFormPage practiceFormPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zli\\Desktop\\QAbootcamp\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.homePage = new HomePage();
        this.elementsPage = new ElementsPage();
        this.practiceFormPage = new PracticeFormPage();
    }


    @AfterClass
    public void afterClass() {
        driver.close();
    }




}
