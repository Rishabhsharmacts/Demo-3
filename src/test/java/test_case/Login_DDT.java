package test_case;

import com.functionalty.home_page;
import com.functionalty.sign_in;
import com.utility.DataProviders;
import org.testng.annotations.Test;

public class Login_DDT extends test_Base_class {



    @Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class,enabled = true)
    public void test_loginDDT(String username, String password) throws InterruptedException {
        home_page hp= new home_page(driver);
        hp.clickRegister();

        sign_in si= new sign_in(driver);
        si.setTelephone(username);
        si.clickContinue();
        si.setPassword(password);
        si.clickContinue2();
        System.out.println("Sign_in  with Excel_Sheet_Data is DONE!");
    }

}
