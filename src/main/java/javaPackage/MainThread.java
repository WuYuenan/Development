package javaPackage;

public class MainThread {
    public static void main(String[] args) {
        // 创建并启动自定义线程
        MyThread myThread = new MyThread();
        myThread.start();
        // 主线程打印输出
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
// 自定义线程类
class MyThread extends Thread {
    @Override
    public void run() {
        // 自定义线程打印输出
        for (int i = 1; i <= 10; i++) {
            System.out.println("Custom thread: " + i);
        }
    }
}