/*

MyThread mth = MyThread(name);

try {
    mth.join();
} catch (InterruptedException exc) {
    System.out.println(exc);
}

mth.setPriority(Thread.NORM_PRIORITY+3)


*/
package Chapter_11;

class MyThreadExtend extends Thread {

    public MyThreadExtend (String name) {
        super(name);
    }

    public static MyThreadExtend createAndStart (String name) {

        MyThreadExtend mte = new MyThreadExtend(name);

        mte.start();

        return mte;
    }

    public void run() {

        System.out.println(getName() + " - запуск");

        try {
            for (int i = 0; i < 10; i++) {
                sleep(400);
                System.out.println("Поток: " + getName() + " счётчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("Поток '" + getName() + "' прерван");
        }

        System.out.println("Поток '" + getName() + "' завершен");
    }
}

public class ExtendThread {

    public static void main(String[] args) {

        System.out.println("Запуск основного потока");

        // Обычное создание первого потока
        MyThreadExtend mnt1 = new MyThreadExtend("Порождённый поток #1");

        // Создание второго потока через фабричный метод (возвращающий новый объект)
        MyThreadExtend mnt2 = MyThreadExtend.createAndStart("Порождённый поток #2");

        MyThreadExtend mnt3 = MyThreadExtend.createAndStart("Порождённый поток #3");


        do {
            System.out.print('.');
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Выполнение потока '" + mnt2.getName() + "' прервано");
            }
            // Проверяем, не завершены ли ещё потоки
        } while (mnt2.isAlive() || mnt3.isAlive());

        mnt1.start();
        try {
            // Ожидаем завершения потока
            mnt1.join();
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока '" + mnt1.getName() + "' прервано");
        }
        System.out.println("Выполнение основного потока завершено");
    }
}
