package Chapter_11;

class MyNewThread implements Runnable {

    Thread thrd;

    public MyNewThread (String name) {
        thrd = new Thread(this, name);
    }


    public static MyNewThread CreateAndStart (String name) {

        MyNewThread mythrd = new MyNewThread(name);

        System.out.println("Создан поток: " + name);

        mythrd.thrd.start();

        return mythrd;
    }

    public void run() {

        System.out.println("Начало выполнения потока: " + thrd.getName());

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Итерация №" + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока '" + thrd.getName() + "' прервано");
        }

        System.out.println("Выполнение потока '" + thrd.getName() + "' завершено");
    }
}

public class ThreadsWithFabricMethod {

    public static void main(String[] args) {

        MyNewThread mth;

        mth = MyNewThread.CreateAndStart("Поток #2");

        try {
            for (int i = 0; i < 50; i++) {
                System.out.print('.');
                Thread.sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.print("Выполнение основного потока прервано");
        }

        System.out.print("Выполнение основного потока завершено");
    }
}
