package Chapter_9;

public class QueueFullException extends Exception {

    int size;

    public QueueFullException (int s) {
        size = s;
    }

    public String toString(){
        return ("\nОчередь заполнена! Максимальный размер: " + size);
    }

}
