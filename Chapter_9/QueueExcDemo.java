package Chapter_9;

class FixedQueue implements ICharQ {

    //���� ������� �������
    private char q[];

    //��������� ��� ���������� � ���������� �� �������
    private int putloc, getloc;

    //�����������, � �� �� ������ ����� �������
    public FixedQueue(int size){
        q = new  char[size];
        putloc = getloc = 0;
    }

    //��������������� ����� put(), ����������� ������ ���� ������� ��� �������������� ����������� ���������� ����� throws
    //����� ���������� �� ����� �������, � ������� ���������������� ������� � �������� ���� throw new
    public void put(char ch) throws QueueFullException {
        //���� ������� ���������
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        //���������� �������
        q [putloc++] = ch;
    }

    //��������������� ����� get(), �� ���������� � put()
    public char get() throws QueueEmptyException{
        //���� ������� ���������� � ���������� �����, ������ � ������� ������ �� ��������
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }

}

public class QueueExcDemo {

    public static void main(String args[]){

        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                System.out.println("������� ����������: " + (char) ('A' + i));
                q.put( (char) ('A' + i) );
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i ++){
                System.out.print("��������� ���������� �������: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
