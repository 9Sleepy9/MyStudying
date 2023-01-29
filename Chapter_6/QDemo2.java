package Chapter_6;

class Queue {

    private char q[];
    private int putlock, getlock;

    //�������� ������ ������� ��������� �������
    Queue(int size){
        q = new char[size+1];
        putlock = getlock = 0;
    }

    //�������� ������� �� ������� ������
    Queue(char a[]){
        putlock = 0;
        getlock = 0;
        q = new char [a.length+1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    //�������� ������� �� ������ ������������� ������� Queue
    Queue (Queue ob) {
        putlock = ob.putlock;
        getlock = ob.getlock;
        q = new char [ob.q.length];

        for (int i = getlock; i <= putlock; i++)
            q[i] = ob.q[i];
    }


    //���������� ������� � �������
    void put(char ch){
        if (putlock == q.length) {
            System.out.println("������� ���������");
            return;
        }
        q[putlock++] = ch;

    }

    //���������� ������� �� �������
    char get(){
        if (putlock == getlock){
            System.out.println("������� �����");
            return (char) 0;
        }

        return q[getlock++];
    }
}

public class QDemo2 {
    public static void main(String args[]){
        //�������� ������ �������
        Queue q1 = new Queue(10);

        //���������� ��������� � ������� q1
        char ch;
        int i;
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        //�������� ������� �� ������ �������
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        //�������� ������� �� ������ ������������� ������� (������ �������)
        Queue q3 = new Queue(q1);

        //���������� ������� � �������
        System.out.print("���������� q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("���������� q2: ");
        for (i = 0; i < 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("���������� q3: ");
        for (i = 0; i < 10; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
