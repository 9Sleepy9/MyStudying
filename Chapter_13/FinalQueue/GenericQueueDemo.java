package Chapter_13.FinalQueue;

public class GenericQueueDemo {

    public static void main(String[] args) {

        Integer[] iStore = new Integer[10];

        GenQueue<Integer> iq = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Демонстрация очереди чисел типа Integer");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Добавление '" + i + "' в очередь q");
                iq.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = iq.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // Очередь для чисел с плавающей точкой
        Double[] dStore = new Double[10];
        GenQueue<Double> dq = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("Демонстрация очереди чисел типа Double: ");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Добавление '" + (double) i/2 + "' в очередь dq");
                dq.put((double) i/2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Double из очереди dq: ");
                dVal = dq.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
