package dummyPackage;

import org.testng.annotations.Test;

public class DemoClass {

    @Test
    public void test1() {
        System.out.println(System.getProperty("APP_NAME"));
        System.out.println("\n");
        System.out.println(System.getProperty("PASS_VALUE"));
        System.out.println("\n");
    }
}
