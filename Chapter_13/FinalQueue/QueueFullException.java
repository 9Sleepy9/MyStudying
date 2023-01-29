package Chapter_13.FinalQueue;

public class QueueFullException extends Exception {
    private int size;

    QueueFullException (int s) { size = s; }

    public String toString () {
        return "\nОчередь заполнена, максимальный размер очереди: " + size;
    }
}
