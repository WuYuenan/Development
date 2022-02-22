package javaPackage;

import interfacePackage.Math;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExecrise {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable("123qwe");
        System.out.println(optionalString);
        System.out.println(optionalString.map(f -> f.toString()+1));
        System.out.println(optionalString.map(String::toString));
    }

}
