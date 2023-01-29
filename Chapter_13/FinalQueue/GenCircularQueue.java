package Chapter_13.FinalQueue;

public class GenCircularQueue <T> implements IGenQ<T> {

    public T q[];
    private int getloc, putloc, c = 0;
    private boolean updated = false;

    public GenCircularQueue(T[] array) {
        q = array;
        putloc = getloc = 0;
    }

    @Override
    public void put(T obj) {

        q[putloc++] = obj;

        if (updated)
            c++;

        if (putloc == q.length) {
            putloc = 0;
            System.out.println("Очередь обновлена\n");
            updated = true;
            c = 0;
        }
    }

    @Override
    public T get() throws QueueEmptyException {
        T ch;

        if (putloc == getloc && !updated) {
            throw new QueueEmptyException();
        }

        if (updated)
            ch = q[c++];
        else
            ch = q[getloc++];

        if (getloc == q.length) getloc = 0;
        if (putloc == q.length) putloc = 0;
        if ( c == q.length) {
            updated = false;
        }

        return ch;
    }

    public void reset() {
            putloc = getloc = 0;
        }
}
