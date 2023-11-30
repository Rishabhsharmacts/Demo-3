package com.functionalty;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Base_Class {

    public WebDriver driver;

    public Base_Class(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

//    public String captureScreen(String tname) throws IOException {
//
//        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        String destination = System.getProperty("user.dir") + "\\src\\screenshot\\" + tname + "_" + timeStamp + ".png";
//
//        try {
//            FileUtils.copyFile(source, new File(destination));
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        return destination;
//
//    }
}
