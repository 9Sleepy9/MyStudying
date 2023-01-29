package Chapter_11;

class MyThread implements Runnable {

    private final String ThreadName;

    public MyThread (String name) {
        ThreadName = name;
    }

    public void run() {
        System.out.println("������ ������ ������ " + ThreadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("\n���������� ������ " + ThreadName + " �" + i + "\n");
                Thread.sleep(400);
            }
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ " + ThreadName + " ��������: " + exc);
        }

        System.out.println("���������� ������ " + ThreadName + " ���������");
    }

}

public class MyFirstThreads {

    public static void main(String[] args) {

        MyThread mth = new MyThread("����� �����");

        Thread thd = new Thread(mth);

        thd.start();

        try {
            for (int i = 0; i < 50; i++) {
                System.out.println("���������� ��������� ������ �" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.println("���������� ��������� ������ ��������: " + exc);
        }

        System.out.println("���������� ��������� ������ ���������");
    }
}
