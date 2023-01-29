package Chapter_11;

class MyThread implements Runnable {

    private final String ThreadName;

    public MyThread (String name) {
        ThreadName = name;
    }

    public void run() {
        System.out.println("Начало нового потока " + ThreadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("\nВыполнение потока " + ThreadName + " №" + i + "\n");
                Thread.sleep(400);
            }
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока " + ThreadName + " прервано: " + exc);
        }

        System.out.println("Выполнение потока " + ThreadName + " завершено");
    }

}

public class MyFirstThreads {

    public static void main(String[] args) {

        MyThread mth = new MyThread("Новый поток");

        Thread thd = new Thread(mth);

        thd.start();

        try {
            for (int i = 0; i < 50; i++) {
                System.out.println("Выполнение основного потока №" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.println("Выполнение основного потока прервано: " + exc);
        }

        System.out.println("Выполнение основного потока завершено");
    }
}
