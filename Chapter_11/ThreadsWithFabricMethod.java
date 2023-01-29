package Chapter_11;

class MyNewThread implements Runnable {

    Thread thrd;

    public MyNewThread (String name) {
        thrd = new Thread(this, name);
    }


    public static MyNewThread CreateAndStart (String name) {

        MyNewThread mythrd = new MyNewThread(name);

        System.out.println("������ �����: " + name);

        mythrd.thrd.start();

        return mythrd;
    }

    public void run() {

        System.out.println("������ ���������� ������: " + thrd.getName());

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("�������� �" + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException exc) {
            System.out.println("���������� ������ '" + thrd.getName() + "' ��������");
        }

        System.out.println("���������� ������ '" + thrd.getName() + "' ���������");
    }
}

public class ThreadsWithFabricMethod {

    public static void main(String[] args) {

        MyNewThread mth;

        mth = MyNewThread.CreateAndStart("����� #2");

        try {
            for (int i = 0; i < 50; i++) {
                System.out.print('.');
                Thread.sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.print("���������� ��������� ������ ��������");
        }

        System.out.print("���������� ��������� ������ ���������");
    }
}
