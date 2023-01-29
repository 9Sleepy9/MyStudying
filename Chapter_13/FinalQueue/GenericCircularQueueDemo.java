package Chapter_13.FinalQueue;

public class GenericCircularQueueDemo {

    public static void main(String[] args) {

        Integer[] queueI = new Integer[10];
        int a;

        GenCircularQueue<Integer> qI = new GenCircularQueue<>(queueI);

        System.out.println("Добавляем: ");
        for (int i = 0; i < 15; i++) {
            System.out.println("Добавление элемента '" + i + "' в очередь");
            qI.put(i);
        }

        System.out.println("\nДобавляем повторно: ");
        for (int i = 15; i < 35; i++) {
            System.out.println("Добавление элемента '" + i + "' в очередь");
            qI.put(i);
        }

        System.out.println("Извлекаем: ");
        try {
            for (int i = 0; i <= 15; i++) {
                a = qI.get();
                System.out.println("Извлечение элемента '" + a + "' из очереди");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
