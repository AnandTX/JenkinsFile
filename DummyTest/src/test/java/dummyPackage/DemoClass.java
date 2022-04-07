package dummyPackage;

import org.testng.annotations.Test;

public class DemoClass {

    @Test
    public void test1() {
        System.out.println(System.getProperty("app"));
        System.out.println(System.getProperty("pwd"));
    }
}
