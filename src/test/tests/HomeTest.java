package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }

    //@DataProvider(name = "title of the target website")
  //  public Object[] websites(){
      //  Object[] = new Object[7];
      //  website[0] =""
   // }


    //    @Test(testName = "IN-1 Verify all links ")
         //       public void test01(){





    }

