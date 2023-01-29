package Chapter_11;

import Chapter_9.QueueFullException;
import Chapter_9.QueueEmptyException;
import Chapter_9.ICharQ;

class NewThreads implements Runnable {

    Thread thrd;
    FixedQueue queue;

    NewThreads (String name, FixedQueue q) {
        thrd = new Thread(this, name);
        queue = q;
    }

    public void run() {

        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                queue.put( (char) ('A' + i) );
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i ++){
                ch = queue.get();
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }

    static NewThreads createAndStart (String name, FixedQueue q) {

        NewThreads nt = new NewThreads(name, q);
        System.out.println("Запуск потока :" + name);
        nt.thrd.start();
        return nt;
    }
}

class FixedQueue implements ICharQ {

    //Сама простая очередь
    private char q[];

    //Указатели для добавления и извлечения из очереди
    private int putloc, getloc;

    //Конструктор, в нём мы создаём новую очередь
    public FixedQueue(int size){
        q = new  char[size];
        putloc = getloc = 0;
    }

    //Переопределённый метод put(), обязательно должны быть указаны все обрабатываемые проверяемые исключения после throws
    //Здесь исключение мы выдаём вручную, с помощью соответствующего условия и ключевых слов throw new
    synchronized public void put(char ch) throws QueueFullException {

        try {
            if (Thread.currentThread().getName().equals("put"))
                return;

            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        //Если очередь заполнена
        if (putloc == q.length) {
            notify();
            throw new QueueFullException(q.length);
        }
        //Добавление символа
        q [putloc++] = ch;
        System.out.println("Добавлен символ '" + ch + "'; номер в массиве: " + (putloc-1));
    }

    //Переопределённый метод get(), всё аналогично с put()
    synchronized public char get() throws QueueEmptyException{

        try {
            if (!Thread.currentThread().getName().equals("get"))
                return 0;


            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        //Если индексы извлечения и добавления равны, значит в очереди ничего не осталось
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }


        System.out.println("Добавлен символ '" + q[getloc] + "'; номер в массиве: " + getloc);
        return q[getloc++];
    }
}

public class QueueWithThreads {

    public static void main(String args[]){

        FixedQueue queue = new FixedQueue(10);

        NewThreads nth1 = NewThreads.createAndStart("put", queue);

        NewThreads nth2 = NewThreads.createAndStart("get", queue);

        try {
            nth1.thrd.join();
            nth2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        System.out.println("Выполнение основного потока завершено");
    }
}
