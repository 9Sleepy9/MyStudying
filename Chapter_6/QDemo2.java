package Chapter_6;

class Queue {

    private char q[];
    private int putlock, getlock;

    //Создание пустой очереди заданного размера
    Queue(int size){
        q = new char[size+1];
        putlock = getlock = 0;
    }

    //Создание очереди из массива данных
    Queue(char a[]){
        putlock = 0;
        getlock = 0;
        q = new char [a.length+1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    //Создание очереди на основе существующего объекта Queue
    Queue (Queue ob) {
        putlock = ob.putlock;
        getlock = ob.getlock;
        q = new char [ob.q.length];

        for (int i = getlock; i <= putlock; i++)
            q[i] = ob.q[i];
    }


    //Добавление символа в очередь
    void put(char ch){
        if (putlock == q.length) {
            System.out.println("Очередь заполнена");
            return;
        }
        q[putlock++] = ch;

    }

    //Извлечение символа из очереди
    char get(){
        if (putlock == getlock){
            System.out.println("Очередь пуста");
            return (char) 0;
        }

        return q[getlock++];
    }
}

public class QDemo2 {
    public static void main(String args[]){
        //Создание пустой очереди
        Queue q1 = new Queue(10);

        //Добавление элементов в очередь q1
        char ch;
        int i;
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        //Создание очереди на основе массива
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        //Создание очереди на основе существующего объекта (другой очереди)
        Queue q3 = new Queue(q1);

        //Отображаем очереди в консоли
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
