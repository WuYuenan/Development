package javaPackage;

import org.junit.Test;

public class TestFor {
    @Test
    public void testFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("~~~~~~");
        for (int j = 0; j < 10; ++j) {
            System.out.println(j);
        }
        System.out.println("~~~~~~");
        int i = 0;
        int j = i++;
        System.out.println(i);
        System.out.println(j);
    }

    public void test(int x) {
        System.out.println(" " + x);
    }
}
