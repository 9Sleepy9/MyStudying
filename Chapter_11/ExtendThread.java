/*

MyThread mth = MyThread(name);

try {
    mth.join();
} catch (InterruptedException exc) {
    System.out.println(exc);
}

mth.setPriority(Thread.NORM_PRIORITY+3)


*/
package Chapter_11;

class MyThreadExtend extends Thread {

    public MyThreadExtend (String name) {
        super(name);
    }

    public static MyThreadExtend createAndStart (String name) {

        MyThreadExtend mte = new MyThreadExtend(name);

        mte.start();

        return mte;
    }

    public void run() {

        System.out.println(getName() + " - ������");

        try {
            for (int i = 0; i < 10; i++) {
                sleep(400);
                System.out.println("�����: " + getName() + " �������: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("����� '" + getName() + "' �������");
        }

        System.out.println("����� '" + getName() + "' ��������");
    }
}

public class ExtendThread {

    public static void main(String[] args) {

        System.out.println("������ ��������� ������");

        // ������� �������� ������� ������
        MyThreadExtend mnt1 = new MyThreadExtend("���������� ����� #1");

        // �������� ������� ������ ����� ��������� ����� (������������ ����� ������)
        MyThreadExtend mnt2 = MyThreadExtend.createAndStart("���������� ����� #2");

        MyThreadExtend mnt3 = MyThreadExtend.createAndStart("���������� ����� #3");


        do {
            System.out.print('.');
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("���������� ������ '" + mnt2.getName() + "' ��������");
            }
            // ���������, �� ��������� �� ��� ������
        } while (mnt2.isAlive() || mnt3.isAlive());

        mnt1.start();
        try {
            // ������� ���������� ������
            mnt1.join();
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ '" + mnt1.getName() + "' ��������");
        }
        System.out.println("���������� ��������� ������ ���������");
    }
}
