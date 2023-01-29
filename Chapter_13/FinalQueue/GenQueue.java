package Chapter_13.FinalQueue;

public class GenQueue<T> implements IGenQ<T> {

    private T[] q;
    private int putloc, getloc;

    public GenQueue(T[] queueObj) {
        q = queueObj;
        putloc = getloc = 0;
    }

    public void put(T obj) throws QueueFullException {

        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    public T get() throws QueueEmptyException {

        if (putloc == getloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
