package test_case;

import com.functionalty.Add_to_cart;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class tc_002_Add_to_Cart extends test_Base_class{

   // Add_to_cart atc = new Add_to_cart(driver);

    @Test(enabled = true, priority = 0)
    public void test_search_select() throws InterruptedException {

        Add_to_cart atc = new Add_to_cart(driver);
        atc.searchProduct("Best Handbags for women");
        atc.searchSumbit();
        atc.selectProduct();


    }
    @Test(enabled = true, priority = 1)
    public void test_colourChange() throws InterruptedException {

        Add_to_cart atc = new Add_to_cart(driver);
        atc.colourChange();
        System.out.println("product Colour_Changed");

    }

    @Test(enabled = true, priority = 2)
    public void test_Add_to_cart() throws InterruptedException {

        Add_to_cart atc = new Add_to_cart(driver);
        atc.addtocart();
        System.out.println("Product Add_to_cart DONE!");
    }



}
