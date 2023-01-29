package Chapter_11;

public class UseMainThread {

    public static void main (String args[]) {

        Thread thrd = Thread.currentThread();

        System.out.println("Имя основного потока: " + thrd.getName());
        System.out.println("Приоритет основного потока: " + thrd.getPriority());

        System.out.println();

        thrd.setName("Поток №1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Новое имя основного потока: " + thrd.getName());
        System.out.println("Новый приоритет основного потока: " + thrd.getPriority());

        /*StackTraceElement ste [] = thrd.getStackTrace();
        for (StackTraceElement sss : ste)
            System.out.println(sss);*/
    }
}
