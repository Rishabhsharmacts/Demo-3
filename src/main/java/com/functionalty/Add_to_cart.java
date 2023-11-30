package com.functionalty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Add_to_cart extends Base_Class{

    public Add_to_cart(WebDriver driver){
        super(driver);
    }

    //Elements

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement txtsearch;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    WebElement btnsearchsubmit;

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/81ICjktH5oL._AC_UL320_.jpg']")
    WebElement selectproduct;

    @FindBy(xpath = "//*[@name='1' or @src='https://m.media-amazon.com/images/I/41UI2Je8fzL._SS36_.jpg']")
    WebElement btncolourchange;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement btnaddtocart;

    @FindBy(xpath="//*[@id=\"nav-cart-count\"]")
    WebElement btnopencart;


    public void searchProduct(String search)
    {
        txtsearch.sendKeys(search);
    }

    public void searchSumbit()
    {
        btnsearchsubmit.click();
    }
    public void selectProduct()
    {
        selectproduct.click();
    }

    public void addtocart() throws InterruptedException {
        Set<String> windowIDs=driver.getWindowHandles();
        List<String> windowIDslist=new ArrayList(windowIDs);

        String parentWindowID = windowIDslist.get(0);
        String childWindowID = windowIDslist.get(1);

        //Swtich to child window

        driver.switchTo().window(childWindowID);
        btnaddtocart.click();
        btnopencart.click();
        Thread.sleep(2000);
    }
    public void colourChange() throws InterruptedException {
        Set<String> windowIDs=driver.getWindowHandles();
        List<String> windowIDslist=new ArrayList(windowIDs);

        String parentWindowID = windowIDslist.get(0);
        String childWindowID = windowIDslist.get(1);

        //Swtich to child window

        driver.switchTo().window(childWindowID);
        btncolourchange.click();
        Thread.sleep(2000);
    }

}
