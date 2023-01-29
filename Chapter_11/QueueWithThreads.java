package Chapter_11;

import Chapter_9.QueueFullException;
import Chapter_9.QueueEmptyException;
import Chapter_9.ICharQ;

class NewThreads implements Runnable {

    Thread thrd;
    FixedQueue queue;

    NewThreads (String name, FixedQueue q) {
        thrd = new Thread(this, name);
        queue = q;
    }

    public void run() {

        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                queue.put( (char) ('A' + i) );
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i ++){
                ch = queue.get();
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }

    static NewThreads createAndStart (String name, FixedQueue q) {

        NewThreads nt = new NewThreads(name, q);
        System.out.println("������ ������ :" + name);
        nt.thrd.start();
        return nt;
    }
}

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
    synchronized public void put(char ch) throws QueueFullException {

        try {
            if (Thread.currentThread().getName().equals("put"))
                return;

            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ ��������");
        }

        //���� ������� ���������
        if (putloc == q.length) {
            notify();
            throw new QueueFullException(q.length);
        }
        //���������� �������
        q [putloc++] = ch;
        System.out.println("�������� ������ '" + ch + "'; ����� � �������: " + (putloc-1));
    }

    //��������������� ����� get(), �� ���������� � put()
    synchronized public char get() throws QueueEmptyException{

        try {
            if (!Thread.currentThread().getName().equals("get"))
                return 0;


            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ ��������");
        }

        //���� ������� ���������� � ���������� �����, ������ � ������� ������ �� ��������
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }


        System.out.println("�������� ������ '" + q[getloc] + "'; ����� � �������: " + getloc);
        return q[getloc++];
    }
}

public class QueueWithThreads {

    public static void main(String args[]){

        FixedQueue queue = new FixedQueue(10);

        NewThreads nth1 = NewThreads.createAndStart("put", queue);

        NewThreads nth2 = NewThreads.createAndStart("get", queue);

        try {
            nth1.thrd.join();
            nth2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ ��������");
        }

        System.out.println("���������� ��������� ������ ���������");
    }
}
