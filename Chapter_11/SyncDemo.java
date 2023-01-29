package Chapter_11;

class ArraySum {

    private static int sum;

    public ArraySum () {
    }

    int sumArray (int b[]) {

        sum = 0;

        for (int x : b) {
            sum += x;
            System.out.println("������� ����� ��� ������ '" + Thread.currentThread().getName() + "': " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("����� '" + Thread.currentThread().getName() + "' �������");
            }
        }

        System.out.println("\n�������� ����� ��� ������ '" + Thread.currentThread().getName() + "': " + sum + "\n");

        return sum;
    }
}

class SyncThreadDemo implements Runnable {

    // ������ �����, ������������ ������, � ������� ����� �������� ������
    static final ArraySum sa = new ArraySum();
    int a[];
    Thread thrd;

    public SyncThreadDemo (String name, int b[]) {

        thrd = new Thread(this, name);
        a = b;

    }

    public void run() {

        // ���������������� ����� ��������� ����� ����, �������� ������ �����-�� �������
        synchronized (sa) {
            sa.sumArray(a);
        }
        System.out.println("����� '" + Thread.currentThread().getName() + "' ��������");

    }

    static SyncThreadDemo createAndStart (String name, int b[]) {

        SyncThreadDemo std = new SyncThreadDemo(name, b);
        std.thrd.start();
        System.out.println("����� '" + Thread.currentThread().getName() + "' �������");
        return std;
    }
}

public class SyncDemo {

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5};
        SyncThreadDemo mt1 = SyncThreadDemo.createAndStart("����� �1", a);
        SyncThreadDemo mt2 = SyncThreadDemo.createAndStart("����� �2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("����� '" + Thread.currentThread().getName() + "' �������");
        }
    }
}
