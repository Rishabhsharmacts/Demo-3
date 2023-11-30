package com.functionalty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home_page extends Base_Class{

    public home_page(WebDriver driver)
    {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/div")
    WebElement btnRegister;


    //Action Methods
    public void clickRegister() {


        btnRegister.click();
    }
}
