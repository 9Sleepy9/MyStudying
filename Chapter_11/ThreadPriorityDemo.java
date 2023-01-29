package Chapter_11;


class Priority implements Runnable {

    int count;
    static boolean stop = false;
    static String currentThreadName;
    Thread thrd;

    // Конструктор класса, создаём объект типа Thread (не забываем про this)
    // Устанавливаем счётчик и имя для каждого потока
    public Priority (String name) {

        thrd = new Thread(this, name);
        count = 0;
        currentThreadName = name;

    }

    // Считаем, пока любой из потоков не дойдёт до 100 млн
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        do {
            count++;
            if (currentThreadName.compareTo(thrd.getName()) != 0) {
                currentThreadName = thrd.getName();
                System.out.println("В потоке " + currentThreadName);
            }
        } while (!stop && count < 100000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " - прерывание");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        // Создаём потоки через класс Priority
        Priority mt1 = new Priority("Высокий приоритет");
        Priority mt2 = new Priority("Низкий приоритет");
        Priority mt3 = new Priority("Обычный приоритет №1");
        Priority mt4 = new Priority("Обычный приоритет №2");
        Priority mt5 = new Priority("Обычный приоритет №3");

        // Устанавливаем приоритет для потоков (не особо работает)
        mt1.thrd.setPriority(Thread.MAX_PRIORITY);
        mt2.thrd.setPriority(Thread.MIN_PRIORITY);

        // Запускаем потоки на выполнение
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        // Ожидаем завершения всех потоков
        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерван основной поток");
        }

        // Выводим результаты
        System.out.println("\nСчетчик потока с высоким приоритетом: " + mt1.count);
        System.out.println("Счетчик потока с низким приоритетом: " + mt2.count);
        System.out.println("Счетчик потока с обычным приоритетом №1: " + mt3.count);
        System.out.println("Счетчик потока с обычным приоритетом №2: " + mt4.count);
        System.out.println("Счетчик потока с обычным приоритетом №3: " + mt5.count);
    }
}
