package clarusway.tests;

import org.testng.annotations.*;

public class C01_Annotations {
/*
    @BeforeSuite-@AfterSuite : Bu projedeki tüm testlerden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeTest-@AfterTest :Tüm test methodlarından önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeClass-@AfterClass : Bir test sınıfındaki tüm test yöntemlerinden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeGroups-@AfterGroups :Herhangi belirli test grubundan önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeMethod-@AfterMethod :Her test methodundan önce/sonra çalışır
 */

 /*
    Create a class.
    Create 3 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.
 */
@BeforeSuite
 public void beforeSuite() {
        System.out.println("Before Suite");
    }
@AfterSuite
public void afterSuite() {
    System.out.println("After Suite");
}
@BeforeTest
public void beforeTest() {
    System.out.println("Before Test");
}
@AfterTest
public void afterTest() {
    System.out.println("After Test");
}
@BeforeClass
public void beforeClass() {
    System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
    System.out.println("After Class");
}
@BeforeMethod
public void beforeMethod() {
    System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
    System.out.println("After Method");
}
    @Test
    public void test01() {
        System.out.println("Test 01");
    }

    @Test
    public void test02() {
        System.out.println("Test 02");
    }

    @Test
    public void test03() {
        System.out.println("Test 03");
    }


    /*
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite
     */


}