package pages;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data
@Getter
public class ElementsPage extends BasePage{

    public By textBox = By.id("item-0");
    public By checkBox = By.id("item-1");

    //test box
    public By submitButton = By.id("submit");
    public By textBoxResultName = By.id("name");
    public By textBoxResultEmail = By.id("email");
    public By textBoxResultCurrentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]");
    public By textBoxResultPermanentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]");
    public String testName = "Test Name";
    public String testCurrentAddress = "test address";
    public String testPermanentAdress = "test permanent address";

    //Checkbox
    public By checkBoxFirst = By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox");
    public By firstTreeNode = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
    public By firstChildSelector = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");


    public ElementsPage() {

    }

//    public void navigateToTextBox(){
//        getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
//        getDriver().findElement(textBox).click();
//    }

    public void textBoxFill(String name, String email, String currentAddress, String permanentAddress){
      //  getDriver().findElement(By.id("item-0")).click();

        this.getDriver().findElement(By.id("userName")).sendKeys(name);
        getDriver().findElement(By.id("userEmail")).sendKeys(email);
        getDriver().findElement(By.id("currentAddress")).sendKeys(currentAddress);
        getDriver().findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
        getDriver().findElement(By.id("submit")).click();

    }

    public By getTextBox() {
        return textBox;
    }

    public By getCheckBox() {
        return checkBox;
    }

    public ElementsPage(By textBox, By checkBox) {
        this.textBox = textBox;
        this.checkBox = checkBox;
    }
}
