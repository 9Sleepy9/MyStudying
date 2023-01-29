package Chapter_5;

class Queue {
    private double q[];
    private int putlock, getlock;

    Queue (int size){
        q = new double[size];
        putlock = getlock = 0;
    }

    void put(double x){
        if (putlock == q.length) {
            System.out.println("Очередь заполнена");
            return;
        }
        q[putlock++] = x;
        System.out.println("Текущий добавленный элемент: " + x);
    }

    double out(){
        if (putlock == getlock){
            System.out.println("Очередь пуста");
            return -1;
        }
        System.out.println("Текущий выведенный элемент: " + q[getlock]);
        return q[getlock++];
    }
}

public class QDemo {

    public static void main (String [] args){
        Queue bigQ = new Queue (20);

        for (int i = 0; i <= 50; i++){
            bigQ.put(i*i*0.5);
        }

        for (int i = 0; i <= 50; i++){
             bigQ.out();
        }
    }
}
