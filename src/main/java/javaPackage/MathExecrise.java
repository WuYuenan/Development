package javaPackage;

import interfacePackage.Math;
import org.junit.Test;

public class MathExecrise {

    Math add = (int x, int y) -> x + y;

    public int add(int a, int b, Math exe) {
        return exe.math(a, b);
    }

    @Test
    public void test() {
        System.out.println(add(1, 2, add));
    }
}