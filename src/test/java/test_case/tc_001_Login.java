package test_case;

import com.functionalty.Add_to_cart;

import com.functionalty.home_page;
import com.functionalty.sign_in;
import org.testng.annotations.Test;

public class tc_001_Login extends test_Base_class {

    @Test(enabled = true)
    public void test_sign_in() throws InterruptedException {
        home_page hp= new home_page(driver);
        hp.clickRegister();
        sign_in si= new sign_in(driver);
        si.setTelephone("8755581830");
        si.clickContinue();
        si.setPassword("rishabh@29");
        si.clickContinue2();

        System.out.println("Sign_in without Excel_Sheet_Data is DONE!");


   }
}
