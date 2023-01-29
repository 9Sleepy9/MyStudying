package Chapter_8.qpack;

//������� ������� �������������� �������
public class FixedQueue implements ICharQ {

    public char q[];
    private int putloc, getloc;

    //�������� ������ �������
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //���������� ������� � �������
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - ������� ���������");
            return;
        }

        q[putloc++] = ch;
    }

    //���������� ������� �� �������
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }

        return q[getloc++];
    }


    public void reset() {
        putloc = getloc = 0;
    }

}
