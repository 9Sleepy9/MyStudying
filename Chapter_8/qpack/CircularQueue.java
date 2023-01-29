package Chapter_8.qpack;

//Кольцевая очередь
public class CircularQueue implements ICharQ {

    public char q[];
    private int getloc, putloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


    public void put(char ch) {
        if ((putloc + 1 == getloc) | (putloc == q.length - 1) & (getloc == 0)) {
            System.out.println(" - Очередь Заполнена");
            return;
        }

        q[putloc++] = ch;

        if (putloc == q.length) putloc = 0;
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
