package javaPackage;

public class ThreadMethod extends Thread {
    int i = 0;
    public void start() {
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    public void run() {
//        while (true) {
//            System.out.println(i++);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) {
        ThreadMethod threadMethod = new ThreadMethod();
        threadMethod.start();
    }

}
