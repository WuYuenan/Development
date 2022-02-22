package javaPackage;

public class Recursion {
    public static int recursion(int i) {
        if (i >= 1) {
            return recursion(i - 1) + i;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Recursion.recursion(100));
    }
}
