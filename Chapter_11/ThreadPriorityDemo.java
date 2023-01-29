package Chapter_11;


class Priority implements Runnable {

    int count;
    static boolean stop = false;
    static String currentThreadName;
    Thread thrd;

    // ����������� ������, ������ ������ ���� Thread (�� �������� ��� this)
    // ������������� ������� � ��� ��� ������� ������
    public Priority (String name) {

        thrd = new Thread(this, name);
        count = 0;
        currentThreadName = name;

    }

    // �������, ���� ����� �� ������� �� ����� �� 100 ���
    public void run() {
        System.out.println(thrd.getName() + " - ������");
        do {
            count++;
            if (currentThreadName.compareTo(thrd.getName()) != 0) {
                currentThreadName = thrd.getName();
                System.out.println("� ������ " + currentThreadName);
            }
        } while (!stop && count < 100000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " - ����������");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        // ������ ������ ����� ����� Priority
        Priority mt1 = new Priority("������� ���������");
        Priority mt2 = new Priority("������ ���������");
        Priority mt3 = new Priority("������� ��������� �1");
        Priority mt4 = new Priority("������� ��������� �2");
        Priority mt5 = new Priority("������� ��������� �3");

        // ������������� ��������� ��� ������� (�� ����� ��������)
        mt1.thrd.setPriority(Thread.MAX_PRIORITY);
        mt2.thrd.setPriority(Thread.MIN_PRIORITY);

        // ��������� ������ �� ����������
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        // ������� ���������� ���� �������
        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("������� �������� �����");
        }

        // ������� ����������
        System.out.println("\n������� ������ � ������� �����������: " + mt1.count);
        System.out.println("������� ������ � ������ �����������: " + mt2.count);
        System.out.println("������� ������ � ������� ����������� �1: " + mt3.count);
        System.out.println("������� ������ � ������� ����������� �2: " + mt4.count);
        System.out.println("������� ������ � ������� ����������� �3: " + mt5.count);
    }
}
