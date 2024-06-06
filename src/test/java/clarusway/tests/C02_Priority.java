package clarusway.tests;

import org.testng.annotations.Test;

public class C02_Priority {

    @Test(priority = 5)
    public void test01() {
        System.out.println("Test 01");
    }

    @Test
    public void test02() {
        System.out.println("Test 02");
    }

    @Test(priority=1)
    public void test03() {
        System.out.println("Test 03");
    }

    @Test(priority=2)
    public void test04() {
        System.out.println("Test 04");
    }

    @Test(priority=3)
    public void test05() {
        System.out.println("Test 05");
    }


}
