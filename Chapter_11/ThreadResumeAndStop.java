package Chapter_11;

class MyMyThread implements Runnable {

    Thread thrd;
    private boolean suspended;
    private boolean stopped;

    public MyMyThread (String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(50);

                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped)
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println("Поток прерван");
            }
        }
    }

    synchronized void mysuspend() {
        suspended = true;
        System.out.println("\nВыполнение потока '" + thrd.getName() + "' приостановлено");
    }

    synchronized void myresume() {
        suspended = false;
        System.out.println("\nВыполнение потока '" + thrd.getName() + "' возобновлено");
        notify();
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        System.out.println("\nВыполнение потока '" + thrd.getName() + "' остановлено");
        notify();
    }

    public static MyMyThread createAndStart (String name) {

        MyMyThread mmt = new MyMyThread(name);

        mmt.thrd.start();

        return mmt;
    }
}

public class ThreadResumeAndStop {

    public static void main(String args[]) {

        MyMyThread mmthrd1 = MyMyThread.createAndStart("Порождённый поток #1");
        //MyMyThread mmthrd2 = MyMyThread.createAndStart("Порождённый поток #2");

        try {
            Thread.sleep(1000);
            mmthrd1.mysuspend();

            Thread.sleep(1000);
            mmthrd1.myresume();

            //Thread.sleep(1000);
            //mmthrd2.mysuspend();

            //Thread.sleep(1000);
            //mmthrd2.myresume();

            Thread.sleep(1000);
            mmthrd1.mysuspend();

            Thread.sleep(1000);
            mmthrd1.mystop();

            //Thread.sleep(1000);
            //mmthrd2.mysuspend();

            //Thread.sleep(1000);
            //mmthrd2.mystop();

        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        try {
            mmthrd1.thrd.join();
            //mmthrd2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        System.out.println("\nВыполнение основного потока программы завершено");
    }
}
