package tests.elements;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class CheckBoxTests extends BaseTests {

//    @BeforeMethod
//    public void beforeCheckBoxTest(){
//        getDriver().findElement(getHomePage().getElements()).click();
//        getDriver().findElement(getElementsPage().checkBox).click();
//
//    }


    @AfterMethod
    public void after(){
        getDriver().navigate().to("https://demoqa.com/");
    }

    //TC-09 Verify that Check box in elements page  works properly when whole tree is selected
    //all checkbox items are selected, result equals whole tree of items
    @Test
    public void wholeCheckBoxTest() {
        getDriver().findElement(getHomePage().getElements()).click();
        getDriver().findElement(getElementsPage().checkBox).click();

        getDriver().findElement(getElementsPage().checkBoxFirst).click();
        //checbox is checked
        Assert.assertEquals(getDriver().findElement(getElementsPage().checkBoxFirst).isEnabled(), true);
        //result equals whole tree of items
        Assert.assertEquals(getDriver().findElement(By.id("result")).getText(), "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");

    }

    //TC-10 //TC-10 Verify that Check box in elements page  works properly when one branch is selected
    //testing that desktop branch is selected, and others remain unselected, result equals selected items
    @Test
    public void firstChildCheckBoxTest(){
        getDriver().findElement(getHomePage().getElements()).click();
        getDriver().findElement(getElementsPage().checkBox).click();
        getDriver().findElement(getElementsPage().firstTreeNode).click();
        getDriver().findElement(getElementsPage().firstChildSelector).click();
        //checkbox checked - first branch
        Assert.assertEquals(getDriver().findElement(By.
                xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")).isEnabled(), true);
        //checkbox unchecked -second branch
        Assert.assertEquals(getDriver().findElement(By.
                xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")).isSelected(), false);
        //checkbox unchecked -third branch
        Assert.assertEquals(getDriver().findElement(By.
                xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")).isSelected(), false);
        //result equals selected items in the first branch
        Assert.assertEquals(getDriver().findElement(By.id("result")).getText(), "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");
    }

    //TC-11 Verify that Check box in elements page  works properly when one item is selected
    //testing that last child of desktop branch is selected, others unselected, result equals last child (notes)
    @Test
    public void lastChildCheckboxTest(){
        getDriver().findElement(getHomePage().getElements()).click();
        getDriver().findElement(getElementsPage().checkBox).click();
        getDriver().findElement(getElementsPage().firstTreeNode).click();
        getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
        getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).isEnabled(), true);
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]")).isSelected(), false);
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")).isSelected(), false);
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")).isSelected(), false);
        Assert.assertEquals(getDriver().findElement(By.id("result")).getText(), "You have selected :\n" +
                "notes"
                );
    }



}
