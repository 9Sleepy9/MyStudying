package Chapter_11;

public class UseMainThread {

    public static void main (String args[]) {

        Thread thrd = Thread.currentThread();

        System.out.println("��� ��������� ������: " + thrd.getName());
        System.out.println("��������� ��������� ������: " + thrd.getPriority());

        System.out.println();

        thrd.setName("����� �1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("����� ��� ��������� ������: " + thrd.getName());
        System.out.println("����� ��������� ��������� ������: " + thrd.getPriority());

        /*StackTraceElement ste [] = thrd.getStackTrace();
        for (StackTraceElement sss : ste)
            System.out.println(sss);*/
    }
}
