package Chapter_11;

class TickTock {

    private static String state;

    synchronized void tick(boolean working) {

        if (!working) {
            state = "ticked";
            notify();
            return;
        }
        try {
            Thread.sleep(500);
            System.out.print("Tick-");

            state = "ticked";

            notify();

            while (!state.equals("tocked"))
                wait();
        } catch (InterruptedException exc) {
            System.out.println("Ожидание потока '" + Thread.currentThread().getName() + "' прервано");
        }
    }

    synchronized void tock(boolean working) {

        if (!working) {
            state = "tocked";
            notify();
            return;
        }
        try {
            Thread.sleep(500);
            System.out.println("Tock");

            state = "tocked";

            notify();

            while (!state.equals("ticked"))
                wait();
        } catch (InterruptedException exc) {
            System.out.println("Ожидание потока '" + Thread.currentThread().getName() + "' прервано");
        }
    }
}


class TickTockThread implements Runnable {

    Thread thrd;

    private final static TickTock ttobj = new TickTock();

    TickTockThread (String name) {

        thrd = new Thread(this, name);
    }

    public void run() {

        if (Thread.currentThread().getName().equals("Tick")) {
            for (int i = 0; i < 5; i++)
                ttobj.tick(true);
            ttobj.tick(false);
        }
        else {
            for (int i = 0; i < 5; i++)
                ttobj.tock(true);
            ttobj.tock(false);
        }
    }

    public static TickTockThread createAndStart (String name) {

        TickTockThread ttt = new TickTockThread(name);

        System.out.println("Поток '" + ttt.thrd.getName() + "' запущен");

        ttt.thrd.start();

        return ttt;
    }

}


public class TickTockSync {

    public static void main(String args[]) {

        TickTockThread myttt1 = TickTockThread.createAndStart("Tick");
        TickTockThread myttt2 = TickTockThread.createAndStart("Tock");

        try {
            myttt1.thrd.join();
            myttt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока '" + Thread.currentThread().getName() + "' прервано");
        }

        System.out.println("\nРабота программы успешно завершена");
    }
}
