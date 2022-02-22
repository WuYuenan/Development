package javaPackage;

import org.junit.Test;

import java.util.Arrays;

public class TestArrays {

    @Test
    public void test() {
        byte[] bytes = {35, 35};
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
    }

}
