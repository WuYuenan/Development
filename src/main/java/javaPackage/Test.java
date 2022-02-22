package javaPackage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Test {

    @org.junit.Test
    public void test() throws IOException {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @org.junit.Test
    public void getAbsolutePath() {
        System.out.println(System.getProperty("user.dir"));
    }

    @org.junit.Test
    public void getSeconds() {
        int i=1800;
        System.out.println(i%1000);
    }

    @org.junit.Test
    public void getNum() {
        System.out.println(3<<2);
    }
    
}