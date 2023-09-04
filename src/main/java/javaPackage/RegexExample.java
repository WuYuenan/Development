package javaPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class RegexExample {
  public static void main(String[] args) {
    String input = "Helloo, World!";

    Pattern pattern = compile("H");
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      System.out.println("Match found!");
      System.out.println("Matched substring: " + matcher.group());
      System.out.println("Start index: " + matcher.start());
      System.out.println("End index: " + matcher.end());
    } else {
      System.out.println("No match found!");
    }
  }
}
