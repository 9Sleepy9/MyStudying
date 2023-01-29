package Chapter_12;

enum TrafficLightColor {
    RED(1200), GREEN(1000), YELLOW(200);
    private final int delay;
    TrafficLightColor (int s) {
        delay = s;
    }

    int getDelay() {
        return delay;
    }
}


class TrafficLightSimulator implements Runnable {

    private TrafficLightColor tlc;
    private final TrafficLightColor[] tlcarray = TrafficLightColor.values();
    private int color = 0;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator (TrafficLightColor init) {
        tlc = init;
        color = tlc.ordinal();
    }

    TrafficLightSimulator() { tlc = TrafficLightColor.RED; }

    synchronized void changeColor() {

        if (color == 2) {
            System.out.println();
            color = 0;
        }
        else
            color++;

        tlc = tlcarray[color];

        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();

            changed = false;
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано: " + exc);
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }

    public void run() {
        while(!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            }
            catch (InterruptedException exc) {
                System.out.println("Выполнение потока прервано: " + exc);
            }
            changeColor();
        }
    }
}


public class TrafficLightDemo {

    public static void main(String args[]) {

        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
