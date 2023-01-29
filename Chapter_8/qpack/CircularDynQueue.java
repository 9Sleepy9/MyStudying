package Chapter_8.qpack;

public class CircularDynQueue implements ICharQ {

    public char q[];
    private int putloc, getloc;

    public CircularDynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if ((putloc + 1 == getloc) | (putloc == q.length - 1) & (getloc == 0)) {
            System.out.println(" - Очередь Заполнена");
            return;
        }

        if (putloc == q.length - 1) {
            getloc = putloc = 0;
            char t[] = new char[q.length * 2];

            q = t;
        }

        q[putloc++] = ch;
    }


    public char get() {
        if (putloc == getloc) {
            System.out.println(" - Очередь Пуста");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;

        return ch;
    }

    public void reset() {
        putloc = getloc = 0;
    }

}
