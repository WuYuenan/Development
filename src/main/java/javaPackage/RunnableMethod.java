package javaPackage;

public class RunnableMethod implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableMethod runnableMethod = new RunnableMethod();
//        runnableMethod.run();
        new Thread(runnableMethod).start();
    }
}
