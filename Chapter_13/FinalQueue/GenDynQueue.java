package Chapter_13.FinalQueue;

public class GenDynQueue<T> implements IGenQ<T> {

    public Object q[];
    private int putloc, getloc;

    public GenDynQueue(T[] queue) {
        q = queue;
        putloc = getloc = 0;
    }

    public void put(T ch) {
        if (putloc == q.length) {
            Object[] t = new Object[q.length * 2];

            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    @Override
    public T get() throws QueueEmptyException {
        return null;
    }

    public Object gett() throws QueueEmptyException {

        if (putloc == getloc) {
            throw new QueueEmptyException();
        }

        return q[getloc++];
    }

    public void reset() {
        putloc = getloc = 0;
    }

}
