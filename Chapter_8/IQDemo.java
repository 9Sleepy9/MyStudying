package Chapter_8;

import Chapter_8.qpack.*;


class IQDemo {
    public static void main(String args[]){

        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        CircularDynQueue q4 = new CircularDynQueue(5);

        ICharQ iQ;

        char ch; int i;

        iQ = q1;

        for (i = 0; i < 10; i++)
            iQ.put( (char) ('A' + i) );

        System.out.print("���������� ������������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++)
            iQ.put( (char) ('Z' - i) );

        System.out.print("���������� ������������ �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iQ = q3;
        for (i = 0; i < 10; i++)
            iQ.put( (char) ('A' + i) );

        System.out.print("���������� ��������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        for (i = 10; i < 20; i++)
            iQ.put( (char) ('A' + i) );

        System.out.print("���������� ����������� ��������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }

        System.out.println("\n���������� � ������������� ������ ��������� �������: ");

        for (i = 0; i < 20; i++){
            iQ.put( (char) ('A' + i) );
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iQ = q4;
        for (i = 0; i < 5; i++)
            iQ.put( (char) ('A' + i) );
        System.out.print("���������� ������������ ��������� �������: ");
        for (i = 0; i < 5; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        for (i = 6; i < 16; i++)
            iQ.put((char) ('A' + i));

        System.out.print("���������� ����������� ������������ ��������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("�������� ������ reset(): ");
        System.out.println("������� ���������� ����������� ������������ ��������� ������� � ��������� �������:");
        iQ.reset();
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            if (ch != (char) 0)
                System.out.print(ch + " ");
        }


        System.out.println("�������� ������ QueueCopy: ");
        ICharQ.QueueCopy(q2.q, q4.q);
    }
}