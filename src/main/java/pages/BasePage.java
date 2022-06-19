package pages;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public @Getter class BasePage {

    private WebDriver driver;

    private WebDriverWait driverWait;

    private static final String HOME_URL = "https://demoqa.com/";








}
