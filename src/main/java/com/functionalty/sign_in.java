package com.functionalty;

//import com.utility.Excel_Utly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class sign_in extends Base_Class {


    public sign_in(WebDriver driver)
    {
        super(driver);
    }

    // Elements

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement txtTelephone;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement btncontinue;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement btncontinue2;



//    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
//    WebElement msgconfirm;

    //Action

//    public void getdatafromuexcel() throws IOException {
//        String file=System.getProperty("user.dir")+"";
//
//        int rows= Excel_Utly.getRowCount(file, "sheet1");
//    //    System.out.println(rows);
//        for(int i=1; i<rows;i++)
//        {
//            // Read data from excel
//            String username=Excel_Utly.getCellData(file, "Sheet1",i,0);
//            String password=Excel_Utly.getCellData(file,"Sheet1",i,1);
//        }
//        System.out.println(rows);
//        System.out.println(String);
//        txtTelephone.sendKeys(username);
//        txtPassword.sendKeys(password);
//
//    }

    public void setTelephone(String tel) throws InterruptedException {
        txtTelephone.sendKeys(tel);
    }

    public void clickContinue(){
        btncontinue.click();
    }

    public void setPassword(String pswd)
    {
        txtPassword.sendKeys(pswd);
    }

    public void clickContinue2(){
        btncontinue2.click();
    }



//    public String getmsgconfirm()
//    {
//       return msgconfirm.getText();
//    }




}
